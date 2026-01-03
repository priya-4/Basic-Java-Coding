package org.example;

import java.util.Scanner;

public class levelUnlockCode {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter score : ");
   int score= sc.nextInt();
   //•	Beginner (<50)
        //•	Intermediate (50–80)
        //•	Expert (>80)
   if(score<50){
      System.out.println("Beginner");
   }
   else if(score>=50 && score<=80){
      System.out.println("Intermediate");
   }
   else{
      System.out.println("Expert");
   }
    }
}
