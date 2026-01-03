package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GoldCounter {
    public static void main(String[] args){
        //Find the sum of numbers from 1 to N.
    System.out.println();
        Scanner sc= new Scanner(System.in);
       int N= sc.nextInt();
       int sum=0;
       for(int i=1;i<=N;i++){
           sum=sum+i;
       }
        System.out.println("Final sum is : "+sum);

    }
}
