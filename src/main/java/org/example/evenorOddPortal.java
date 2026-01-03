package org.example;

import java.util.Scanner;

public class evenorOddPortal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter value :");
    int val= sc.nextInt();
    System.out.println("Input value is :"+val);
    if(val%2 ==0){
      System.out.println("number is even");
        }
    else{
      System.out.println("number is odd");
    }
    }
}
