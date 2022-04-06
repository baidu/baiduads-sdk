""" baiduads-sdk配置信息
"""


from setuptools import setup, find_packages  # noqa: H301

NAME = "baiduads-sdk-snapshot"
VERSION = "2022.2.1.3"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools


f = open("requirements.txt", "r")

REQUIRES = f.readlines()

setup(
    name=NAME,
    version=VERSION,
    description="baiduads-sdk",
    author="baidu",
    author_email="jiangyuan04@baidu.com",
    url="",
    keywords=["baidu"],
    python_requires=">=3.6",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description="""\
    baiduads-sdk
    """
)
