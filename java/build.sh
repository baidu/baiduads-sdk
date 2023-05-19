#!/usr/bin/env bash

# Be sure your script exit whenever encounter errors
set -e

base_dir=$(dirname $0)

source $base_dir/cmc.sh

mvn -U clean install -Dmaven.test.skip=true -Dgpg.skip -f $base_dir/pom.xml

sh $base_dir/postBuild.sh
