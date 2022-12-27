#!/usr/bin/env bash

##########################################################################################
## Do something after maven build.
##
## Include the following content:
## - Change directory
## - Delete some temporary files or directories
## - Create a output directory
## - Move files
##########################################################################################
base_dir=$(dirname $0)
rm -rf $base_dir/../output
mkdir -p $base_dir/../output/
cp $base_dir/baiduads-sdk/target/*.jar $base_dir/../output/