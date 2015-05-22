# scala-blas
Benchmarks of BLAS libraries with Scala interface

## Description
This project contains benchmarks for matrix-matrix multiplication of various libraries that have Scala interface. Currently, they are 
  - Breeze, which can use any BLAS library with CBLAS interface by means of underlying Netlib-java
    - OpenBLAS, open source CPU optimized library
    - NVBLAS, proprietary wrapper for few functions from GPU optimized library CUBLAS
    - Intel MKL, proprietary CPU optimized library
    - f2jblas, reference Java BLAS implementation
  - BIDMat, based on Intel MKL and GPU CUDA
    - Own wrapper and optimizations for GPU CUBLAS
    - Own wrapper and optimizations for Intel MKL

## Sources
Sources contain Scala code snippets that are used to run benchmarks

## Results
Spreadsheets with results, each tab is a different hardware configuration:
https://docs.google.com/spreadsheets/d/1lWdVSuSragOobb0A_oeouQgHUMx378T9J5r7kwKSPkY/edit#gid=0

## Glossary
  - BLAS - Basic Linear Algebra Subprograms, general term for linear algebra in software, might be misleading becuase it does not mean any specific interface
  - Fortran BLAS - Reference Fortran interface for BLAS
  - CBLAS - reference C interface for BLAS
  - CUBLAS - proprietary (non-standard) interface for BLAS
  - NVBLAS - proprietary wrapper for few functions from GPU optimized library CUBLAS
  - Netlib - repository of software for scientific computing 

## Relevant links
  - Netlib, Reference BLAS and CBLAS http://www.netlib.org/blas/
  - Netlib-java https://github.com/fommil/netlib-java
  - Breeze https://github.com/scalanlp/breeze
  - BIDMat https://github.com/BIDData/BIDMat/
  - OpenBLAS https://github.com/xianyi/OpenBLAS
  - CUDA http://www.nvidia.com/object/cuda_home_new.html
  - NVBLAS http://docs.nvidia.com/cuda/nvblas
