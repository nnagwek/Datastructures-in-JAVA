package com.dsalgo.recurssion;
public class RecrusionFibonacci {
  public static void main(String[] args) {
    int rec = fibonacci(-2);
    System.out.println(rec);

  }

  public static  int fibonacci(int n) {
    if (n<0) {
      return -1;
    }
    if (n==0 || n==1) {
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }



}
