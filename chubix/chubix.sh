#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "usage: chubix.sh [file]"
    exit 1
fi

for arg in $@ 
do
    java $arg
done 