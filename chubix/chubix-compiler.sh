#!/bin/bash

if [ $# -eq 0 ]
  then
    echo "usage: chubix-compiler.sh [file]"
    exit 1
fi

for arg in $@ 
do
    java -ea chubixMain $arg
done 

javac *.java 