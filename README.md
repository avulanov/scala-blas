# scala-blas
Benchmarks of BLAS libraries with Scala interface

## Description
This project contains benchmarks for matrix-matrix multiplication of various libraries that have Scala interface. Currently, they are 
  - Breeze, which can use any BLAS library with CBLAS interface by means of underlying Netlib-java
  - BIDMat, based on Intel MKL and GPU CUDA

## Sources
Sources contain Scala code snippets that are used to run benchmarks

## Results
Spreadsheets with results, each tab is a different hardware configuration:
https://docs.google.com/spreadsheets/d/1lWdVSuSragOobb0A_oeouQgHUMx378T9J5r7kwKSPkY/edit#gid=0

## Relevant links
  - Netlib-java https://github.com/fommil/netlib-java
  - Breeze https://github.com/scalanlp/breeze
  - BIDMat https://github.com/BIDData/BIDMat/
  - OpenBLAS https://github.com/xianyi/OpenBLAS
  - NVBLAS http://docs.nvidia.com/cuda/nvblas
