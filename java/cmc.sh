#!/usr/bin/env bash

# Be sure your script exits whenever encounter errors
set -e

# Be sure your charset is correct. eg: zh_CN.UTF-8
export LC_ALL=en_US.UTF-8
export LANG=en_US.UTF-8
export LANGUAGE=en_US.UTF-8

# Use DECK Environment Variables to set yours
# See http://buildcloud.baidu.com/submitter/5-env_declare#DECK_CENTOS6U3_K3 to find more.
export PATH=$M2_BIN_V353:$JAVA_BIN_V11:$PATH

export JAVA_HOME=$JAVA_HOME_V11

export M2_HOME=$M2_HOME_V353
