package com.baidu.dev2.api.sdk.manual.upload;

import com.baidu.dev2.api.sdk.invoke.ApiClient;
import com.baidu.dev2.api.sdk.invoke.ApiException;
import com.baidu.dev2.api.sdk.invoke.Pair;
import com.baidu.dev2.api.sdk.manual.upload.model.InitiateMultipartUploadInfo;
import com.baidu.dev2.api.sdk.manual.upload.model.InitiateMultipartUploadResponseWrapper;
import com.baidu.dev2.api.sdk.manual.upload.model.PartEtag;
import com.baidu.dev2.api.sdk.manual.upload.model.UploadPartResponseWrapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.http.client.methods.CloseableHttpResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;


public class UploadClient {


    private ApiClient apiClient;

    public UploadClient() {
        this.apiClient = new UploadApiClient();
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public static final UploadClient INSTANCE = new UploadClient();

    /**
     * 分片最小 100kb
     */
    private static final int MIN_PART_SIZE = 100 * 1024;

    /**
     * 网关理论上支持最大100MB的分片
     */
    private static final int MAX_PART_SIZE = 100 * 1024 * 1024;

    /**
     * 默认分片阈值 100MB
     */
    private static final int DEFAULT_MULTIPART_THRESHOLD = 100 * 1024 * 1024;

    /**
     * 默认分片大小 5M
     */
    private static final int DEFAULT_PART_SIZE = 5 * 1024 * 1024;

    /**
     * 简单上传默认线程池配置
     */
    private ThreadPoolExecutor simpleUploadExecutor = new ThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            Runtime.getRuntime().availableProcessors() * 2,
            60L,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(512),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    /**
     * 允许用户自定义简单上传线程池
     *
     * @param simpleUploadExecutor
     */
    public void setSimpleUploadExecutor(ThreadPoolExecutor simpleUploadExecutor) {
        this.simpleUploadExecutor = simpleUploadExecutor;
    }


    /**
     * 分片上传默认线程池配置
     */
    private ThreadPoolExecutor mulitUploadExecutor = new ThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            Runtime.getRuntime().availableProcessors() * 2,
            60L,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(1024),
            new ThreadPoolExecutor.CallerRunsPolicy()
    );

    /**
     * 允许用户自定义分片上传线程池
     *
     * @param mulitUploadExecutor
     */
    public void setMulitUploadExecutor(ThreadPoolExecutor mulitUploadExecutor) {
        this.mulitUploadExecutor = mulitUploadExecutor;
    }

    /**
     * 文件上传
     *
     * @param path               上传请求路径
     * @param formParams         表单参数
     * @param file               文件
     * @param paramsJson         params参数json
     * @param fileKey            文件参数名：不填默认："file"
     * @param multipartThreshold 分片上传阈值：不填默认：100M
     * @param partSize           分片大小：不填默认：5M
     * @param partParallel       分片上传并发数：不填默认：5
     * @param timeout            上传超时时间(ms)：不填默认为0 永不超时
     * @param returnType         返回
     * @param <R>
     * @return
     * @throws ApiException
     */
    public <R> R uploadFile(String path,
                            Map<String, Object> formParams,
                            File file,
                            ObjectNode paramsJson,
                            String fileKey,
                            Integer multipartThreshold,
                            Integer partSize,
                            Integer partParallel,
                            Integer timeout,
                            TypeReference<R> returnType
    ) throws ApiException {
        if (file == null || file.length() <= 0) {
            throw new ApiException("invalid file:" + file);
        }
        if (partSize != null && (partSize < MIN_PART_SIZE || partSize > MAX_PART_SIZE)) {
            throw new ApiException("invalid partSize");
        }
        if (partParallel != null && partParallel < 1) {
            throw new ApiException("invalid partParallel");
        }
        if (multipartThreshold != null && multipartThreshold < DEFAULT_PART_SIZE) {
            // 分片阈值最小5M
            throw new ApiException("invalid multipartThreshold");
        }
        if (fileKey == null) {
            fileKey = "file";
        }
        if (multipartThreshold == null) {
            multipartThreshold = DEFAULT_MULTIPART_THRESHOLD;
        }
        if (partSize == null) {
            partSize = DEFAULT_PART_SIZE;
        }
        if (partParallel == null) {
            partParallel = 5;
        }
        if (formParams == null) {
            formParams = new HashMap<String, Object>();
        }
        if (timeout == null || timeout < 0) {
            timeout = 0;
        }

        String localVarPath = path;

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = formParams;
        final String[] localVarAccepts = {
                "application/json;charset=UTF-8"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "multipart/form-data;charset=UTF-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{};

        try {
            Future<CallResult<R>> future = null;
            if (file.length() <= multipartThreshold) {
                // 简单上传
                localVarFormParams.put(fileKey, file);
                localVarFormParams.put("params", apiClient.getObjectMapper().writeValueAsString(paramsJson));
                SimpleUploadCall<R> call = new SimpleUploadCall<>(
                        apiClient,
                        localVarPath,
                        "POST",
                        localVarQueryParams,
                        localVarCollectionQueryParams,
                        null,
                        localVarHeaderParams,
                        localVarCookieParams,
                        localVarFormParams,
                        localVarAccept,
                        localVarContentType,
                        localVarAuthNames,
                        returnType
                );

                future = simpleUploadExecutor.submit(call);

            } else {
                // 分片上传
                MultiUploadCall<R> call = new MultiUploadCall<>(
                        apiClient,
                        localVarPath,
                        "POST",
                        localVarQueryParams,
                        localVarCollectionQueryParams,
                        null,
                        localVarHeaderParams,
                        localVarCookieParams,
                        localVarFormParams,
                        localVarAccept,
                        localVarContentType,
                        localVarAuthNames,
                        returnType,
                        file,
                        partSize,
                        fileKey,
                        partParallel,
                        timeout,
                        this,
                        paramsJson
                );
                future = mulitUploadExecutor.submit(call);
            }


            CallResult<R> callResult = timeout != 0 ?
                    future.get(timeout, TimeUnit.MILLISECONDS) : future.get();
            if (callResult.t != null) {
                throw callResult.t;
            }
            return callResult.result;
        } catch (Throwable e) {
            throw new ApiException(e);
        }

    }


    static class MultiUploadCall<R> implements Callable<CallResult<R>> {

        private ApiClient apiClient;
        private String localVarPath;
        private String method;
        private List<Pair> localVarQueryParams;
        private List<Pair> localVarCollectionQueryParams;
        private Object body;
        private Map<String, String> localVarHeaderParams;
        private Map<String, String> localVarCookieParams;
        private Map<String, Object> localVarFormParams;
        private String localVarAccept;
        private String localVarContentType;
        private String[] localVarAuthNames;
        private TypeReference<R> returnType;

        private File file;
        private int partSize;
        private String fileKey;
        private int partParallel;

        private boolean timeoutEnable;
        private long deadline;
        private UploadClient uploadClient;
        private ObjectNode paramsJson;

        public MultiUploadCall(ApiClient apiClient,
                               String localVarPath,
                               String method,
                               List<Pair> localVarQueryParams,
                               List<Pair> localVarCollectionQueryParams,
                               Object body,
                               Map<String, String> localVarHeaderParams,
                               Map<String, String> localVarCookieParams,
                               Map<String, Object> localVarFormParams,
                               String localVarAccept,
                               String localVarContentType,
                               String[] localVarAuthNames,
                               TypeReference<R> returnType,
                               File file,
                               int partSize,
                               String fileKey,
                               int partParallel,
                               int timeout,
                               UploadClient uploadClient,
                               ObjectNode paramsJson) {

            this.apiClient = apiClient;
            this.localVarPath = localVarPath;
            this.method = method;
            this.localVarQueryParams = localVarQueryParams;
            this.localVarCollectionQueryParams = localVarCollectionQueryParams;
            this.body = body;
            this.localVarHeaderParams = localVarHeaderParams;
            this.localVarCookieParams = localVarCookieParams;
            this.localVarFormParams = localVarFormParams;
            this.localVarAccept = localVarAccept;
            this.localVarContentType = localVarContentType;
            this.localVarAuthNames = localVarAuthNames;
            this.returnType = returnType;
            this.file = file;
            this.partSize = partSize;
            this.fileKey = fileKey;
            this.partParallel = partParallel;

            this.timeoutEnable = timeout != 0;
            this.deadline = System.currentTimeMillis() + timeout;

            this.uploadClient = uploadClient;
            this.paramsJson = paramsJson;
        }

        private void checkTimeout() throws TimeoutException {
            if (timeoutEnable && System.currentTimeMillis() > deadline) {
                throw new TimeoutException();
            }
        }

        @Override
        public CallResult<R> call() throws Exception {
            try {

                // 计算分片数
                long fileSize = file.length();
                long partCount = fileSize / partSize;
                if (fileSize % partSize != 0) {
                    partCount++;
                }

                // step1: initMultipartUpload
                localVarFormParams.put("step", "InitiateMultipartUpload");
                localVarFormParams.put("params", apiClient.getObjectMapper().writeValueAsString(paramsJson));
                InitiateMultipartUploadResponseWrapper initResponseWrapper = apiClient.invokeAPI(
                        localVarPath,
                        method,
                        localVarQueryParams,
                        localVarCollectionQueryParams,
                        body,
                        localVarHeaderParams,
                        localVarCookieParams,
                        localVarFormParams,
                        localVarAccept,
                        localVarContentType,
                        localVarAuthNames,
                        new TypeReference<InitiateMultipartUploadResponseWrapper>() {
                        }
                );
                if (initResponseWrapper.getHeader().getStatus() != 0) {
                    throw new ApiException("InitiateMultipartUpload step fail:"
                            + initResponseWrapper);
                }
                checkTimeout();

                InitiateMultipartUploadInfo initiateMultipartUploadInfo =
                        initResponseWrapper.getBody().getData().get(0);

                String uploadId = initiateMultipartUploadInfo.getUploadId();
                Long fileId = initiateMultipartUploadInfo.getFileId();

                // step2: uploadPart
                // 并行上传分片数
                Semaphore semaphore = new Semaphore(partParallel);
                // key: 分片id value： future
                Map<Integer, Future<CallResult<UploadPartResponseWrapper>>> futureMap = new HashMap<>();
                localVarFormParams.put("step", "UploadPart");
                localVarFormParams.put("uploadId", uploadId);
                for (int i = 0; i < partCount; i++) {
                    int partNumber = i + 1;
                    if (timeoutEnable) {
                        long t;
                        do {
                            t = deadline - System.currentTimeMillis();
                            if (t <= 0) {
                                throw new TimeoutException();
                            }
                        } while (!semaphore.tryAcquire(t, TimeUnit.MILLISECONDS));
                    } else {
                        semaphore.acquire();
                    }

                    // copy 参数
                    Map<String, Object> formParams = new HashMap<>();
                    formParams.putAll(localVarFormParams);
                    PartUploadCall<UploadPartResponseWrapper> call =
                            new PartUploadCall<>(
                                    apiClient,
                                    localVarPath,
                                    method,
                                    localVarQueryParams,
                                    localVarCollectionQueryParams,
                                    body,
                                    localVarHeaderParams,
                                    localVarCookieParams,
                                    formParams,
                                    localVarAccept,
                                    localVarContentType,
                                    localVarAuthNames,
                                    new TypeReference<UploadPartResponseWrapper>() {
                                    },
                                    semaphore,
                                    file,
                                    partNumber,
                                    partSize,
                                    fileKey
                            );

                    Future<CallResult<UploadPartResponseWrapper>> future =
                            uploadClient.mulitUploadExecutor.submit(call);
                    futureMap.put(partNumber, future);
                }
                List<PartEtag> etags = new ArrayList<>();
                for (Map.Entry<Integer, Future<CallResult<UploadPartResponseWrapper>>> entry : futureMap.entrySet()) {
                    Integer partNumer = entry.getKey();
                    Future<CallResult<UploadPartResponseWrapper>> future = entry.getValue();
                    CallResult<UploadPartResponseWrapper> callResult;
                    if (timeoutEnable) {
                        long t = deadline - System.currentTimeMillis();
                        if (t <= 0) {
                            throw new TimeoutException();
                        }
                        callResult = future.get(t, TimeUnit.MILLISECONDS);
                    } else {
                        callResult = future.get();
                    }

                    if (callResult.t != null) {
                        throw callResult.t;
                    }

                    UploadPartResponseWrapper uploadPartResponseWrapper = callResult.result;
                    Integer status = uploadPartResponseWrapper.getHeader().getStatus();
                    if (0 != status) {
                        throw new ApiException("UploadPart step fail: " + uploadPartResponseWrapper);
                    }
                    String eTag = uploadPartResponseWrapper.getBody().getData().get(0).geteTag();

                    etags.add(new PartEtag(partNumer, eTag));
                }


                // step3:  CompleteMultipartUpload
                localVarFormParams.put("step", "CompleteMultipartUpload");
                localVarFormParams.put("parts", uploadClient.apiClient.getObjectMapper().writeValueAsString(etags));
                // 还需要在params中设置一下fileId
                paramsJson.put("fileId", fileId);
                localVarFormParams.put("params", apiClient.getObjectMapper().writeValueAsString(paramsJson));

                R result = apiClient.invokeAPI(
                        localVarPath,
                        method,
                        localVarQueryParams,
                        localVarCollectionQueryParams,
                        body,
                        localVarHeaderParams,
                        localVarCookieParams,
                        localVarFormParams,
                        localVarAccept,
                        localVarContentType,
                        localVarAuthNames,
                        returnType
                );
                return new CallResult<>(result);
            } catch (Throwable t) {
                return new CallResult<>(t);
            }
        }
    }

    static class PartUploadCall<R> implements Callable<CallResult<R>> {
        private ApiClient apiClient;
        private String localVarPath;
        private String method;
        private List<Pair> localVarQueryParams;
        private List<Pair> localVarCollectionQueryParams;
        private Object body;
        private Map<String, String> localVarHeaderParams;
        private Map<String, String> localVarCookieParams;
        private Map<String, Object> localVarFormParams;
        private String localVarAccept;
        private String localVarContentType;
        private String[] localVarAuthNames;
        private TypeReference<R> returnType;
        private Semaphore semaphore;
        private File file;
        private int partNumber;
        private int partSize;
        private String fileKey;

        public PartUploadCall(ApiClient apiClient,
                              String localVarPath,
                              String method,
                              List<Pair> localVarQueryParams,
                              List<Pair> localVarCollectionQueryParams,
                              Object body,
                              Map<String, String> localVarHeaderParams,
                              Map<String, String> localVarCookieParams,
                              Map<String, Object> localVarFormParams,
                              String localVarAccept,
                              String localVarContentType,
                              String[] localVarAuthNames,
                              TypeReference<R> returnType,
                              Semaphore semaphore,
                              File file,
                              int partNumber,
                              int partSize,
                              String fileKey) {
            this.apiClient = apiClient;
            this.localVarPath = localVarPath;
            this.method = method;
            this.localVarQueryParams = localVarQueryParams;
            this.localVarCollectionQueryParams = localVarCollectionQueryParams;
            this.body = body;
            this.localVarHeaderParams = localVarHeaderParams;
            this.localVarCookieParams = localVarCookieParams;
            this.localVarFormParams = localVarFormParams;
            this.localVarAccept = localVarAccept;
            this.localVarContentType = localVarContentType;
            this.localVarAuthNames = localVarAuthNames;
            this.returnType = returnType;
            this.semaphore = semaphore;
            this.file = file;
            this.partNumber = partNumber;
            this.partSize = partSize;
            this.fileKey = fileKey;
        }

        @Override
        public CallResult<R> call() throws Exception {
            File tempFile = null;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = new FileInputStream(file);
                byte[] data = new byte[partSize];
                int skip = (partNumber - 1) * partSize;
                fileInputStream.skip(skip);
                int read = fileInputStream.read(data);
                if (read != data.length) {
                    // 表示最后一个分片没有读满
                    byte[] copy = new byte[read];
                    System.arraycopy(data, 0, copy, 0, read);
                    data = copy;
                }

                tempFile = File.createTempFile(file.getName(), "-part" + partNumber);
                Files.write(tempFile.toPath(), data);

                data = null; // help gc

                localVarFormParams.put(fileKey, tempFile);
                localVarFormParams.put("partNumber", partNumber);

                R result = apiClient.invokeAPI(
                        localVarPath,
                        method,
                        localVarQueryParams,
                        localVarCollectionQueryParams,
                        body,
                        localVarHeaderParams,
                        localVarCookieParams,
                        localVarFormParams,
                        localVarAccept,
                        localVarContentType,
                        localVarAuthNames,
                        returnType
                );

                return new CallResult<>(result);
            } catch (Throwable t) {
                return new CallResult<>(t);
            } finally {
                semaphore.release();
                if (tempFile != null) {
                    tempFile.delete();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            }
        }
    }

    static class SimpleUploadCall<R> implements Callable<CallResult<R>> {

        private ApiClient apiClient;
        private String localVarPath;
        private String method;
        private List<Pair> localVarQueryParams;
        private List<Pair> localVarCollectionQueryParams;
        private Object body;
        private Map<String, String> localVarHeaderParams;
        private Map<String, String> localVarCookieParams;
        private Map<String, Object> localVarFormParams;
        private String localVarAccept;
        private String localVarContentType;
        private String[] localVarAuthNames;
        private TypeReference<R> returnType;

        public SimpleUploadCall(ApiClient apiClient,
                                String localVarPath,
                                String method,
                                List<Pair> localVarQueryParams,
                                List<Pair> localVarCollectionQueryParams,
                                Object body,
                                Map<String, String> localVarHeaderParams,
                                Map<String, String> localVarCookieParams,
                                Map<String, Object> localVarFormParams,
                                String localVarAccept,
                                String localVarContentType,
                                String[] localVarAuthNames,
                                TypeReference<R> returnType) {
            this.apiClient = apiClient;
            this.localVarPath = localVarPath;
            this.method = method;
            this.localVarQueryParams = localVarQueryParams;
            this.localVarCollectionQueryParams = localVarCollectionQueryParams;
            this.body = body;
            this.localVarHeaderParams = localVarHeaderParams;
            this.localVarCookieParams = localVarCookieParams;
            this.localVarFormParams = localVarFormParams;
            this.localVarAccept = localVarAccept;
            this.localVarContentType = localVarContentType;
            this.localVarAuthNames = localVarAuthNames;
            this.returnType = returnType;
        }

        @Override
        public CallResult<R> call() throws Exception {
            try {
                R result = apiClient.invokeAPI(
                        localVarPath,
                        method,
                        localVarQueryParams,
                        localVarCollectionQueryParams,
                        body,
                        localVarHeaderParams,
                        localVarCookieParams,
                        localVarFormParams,
                        localVarAccept,
                        localVarContentType,
                        localVarAuthNames,
                        returnType
                );
                return new CallResult<>(result);
            } catch (Throwable t) {
                return new CallResult<>(t);
            }
        }
    }


    static class CallResult<R> {
        private R result;
        private Throwable t;

        public CallResult(R result) {
            this.result = result;
        }

        public CallResult(Throwable t) {
            this.t = t;
        }
    }


    static class UploadApiClient extends ApiClient {
        @Override
        protected <T> T processResponse(CloseableHttpResponse response, TypeReference<T> returnType)
                throws ApiException, IOException {
            // 无奈之举
            response.removeHeaders("Content-Type");
            response.addHeader("Content-Type", "application/json;charset=UTF-8");
            return super.processResponse(response, returnType);
        }
    }

}
