package org.example;

import java.util.Scanner;

public class PatternForge {
    public static void main(String[] args){
    // *
    // **
    // ***
    // ****
    System.out.println("Pattern is : ");
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
       for(int i=1;i<=val;i++){
           for(int j=0;j<i;j++){
        System.out.print("*");
           }
      System.out.println();
       }
    }
}
