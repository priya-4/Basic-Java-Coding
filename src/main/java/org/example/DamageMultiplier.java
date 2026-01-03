package org.example;

import java.util.Scanner;

public class DamageMultiplier {
  public static void main(String[] args) {
   //•	Create a recursive method to calculate factorial

      int n;
      Scanner sc= new Scanner(System.in);
    System.out.println("Please enter number : ");
      int val=sc.nextInt();
    //      int fact=1;
    //      for(int i=1;i<=val;i++){
    //          fact=fact*i;
    //      }
    //   System.out.println(fact);
    System.out.println(findFactorial(val));
  }

  public static int findFactorial(int n){
if(n==1){
    return 1;
}

return n*findFactorial(n-1);
  }
}
