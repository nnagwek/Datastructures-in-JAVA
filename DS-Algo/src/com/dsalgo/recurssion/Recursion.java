package com.dsalgo.recurssion;

public class Recursion {
  public static void main(String[] args) {
    int rec = factorial(-2);
    System.out.println(rec);
  }

  public static  int factorial(int n) {
    if (n<1) {
      return -1;
    }
    if (n==0 || n==1) {
      return 1;
    }
    return n * factorial(n-1);
  }


}
