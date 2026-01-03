package org.example;

import java.util.Arrays;

public class ReverseSpell {
    public static void main(String args[]){
        // Reverse an array without using extra arrays.
        int a[]=new int[]{2,5,1,6,8};
//        for(int n=a.length-1;n>=0;n--){
//
//            System.out.println(a[n]);
//        }

        int i,j;
        for(int n=0;n<a.length/2;n++){
            i=a[n];
            j=a[a.length-n-1];
            a[n]=j;
            a[a.length-n-1]=i;
        }
    System.out.println(Arrays.toString(a));
  }
}
