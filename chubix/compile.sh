#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "usage: dimx-compiler.sh [files_to_compile]"
    exit 1
fi

for arg in $@ 
do
    java -ea GeneralMain $arg
done 

javac *.java 