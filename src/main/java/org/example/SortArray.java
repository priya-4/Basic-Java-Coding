package org.example;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args){
        //•	Sort an array without using built-in sort methods
        int a[]=new int[]{5,2,1,10};
        for(int i=0;i<a.length-1;i++){
      for (int j = i + 1; j < a.length - 1; j++) {
        if (a[i] > a[j]) {
          int v = a[j];
          a[j] = a[i];
          a[i] = v;
        }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
