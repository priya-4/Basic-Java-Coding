package org.example;

import java.util.Scanner;

public class miniBoss {
    public static void main(String[] args){
        //•	Print numbers from 1 to 100 using a loop
        for(int i=1;i<=100;i++){
      System.out.println(i);
        }
        //•	Replace multiples of 3 with "JAVA"
        for( int j=1;j<=100;j++){
            if(j%3==0){
        System.out.println("JAVA"+j);
            }
        }
    }
}
