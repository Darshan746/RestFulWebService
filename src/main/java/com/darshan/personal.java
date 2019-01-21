package com.darshan;

import java.util.List;

public class personal {

  public  <T extends Number> void copy(T[] dest, T[] src) {

  }



  public  <T extends Integer> void printList(T[] list) {

    for (T t : list) {
     System.out.println(t);
    }
  }

  public static void main(String args[]) {

    Integer[] arr = {1,2,3};
    Double[] arr1 = {2.8,6.9,8.0};

    Object[] arr2 = {3,"hello"};

    personal p = new personal();
    //p.copy(arr,arr);
    p.printList(arr);
  }
  }


