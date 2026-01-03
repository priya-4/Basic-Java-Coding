package org.example;

import java.util.Scanner;

public class PrimeHunter {
    public static void main(String[] args){
        boolean isPrime=true;
        // Check if a number is prime.
        Scanner sc= new Scanner(System.in);
        int val= sc.nextInt();

   if(IsPrime(val)){
      System.out.println("Number is prime number.");
   }
   else{
      System.out.println("not a prime number.");
   }

   //•	Print all prime numbers between 1 and 100
     for(int i=1;i<=100;i++){
         if(IsPrime(i)){
        System.out.println("Prime no: "+i);
      }
     }

    }
    public static boolean IsPrime(int n){
      boolean  isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
