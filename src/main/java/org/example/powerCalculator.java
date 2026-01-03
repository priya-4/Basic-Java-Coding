package org.example;

import java.util.Scanner;

public class powerCalculator {
    public static void main(String[] args){
    // Take two integers and print their sum, difference, product, and quotient.
    System.out.println("Input two values : ");
        Scanner scanner=new Scanner(System.in);
       int val1= scanner.nextInt();
       int val2= scanner.nextInt();
    System.out.println("Value1 :" +val1+ "\nValue2 :"+val2 );
    int sum= val1+val2;
        System.out.println("Sum is :"+sum);
    int diff=val1-val2;
        System.out.println("Difference is : "+diff);
    int product = val1 *val2;
        System.out.println("Product is : "+product);
    int quotient=val1/val2;
    System.out.println("Quotient is : "+quotient);
    }
}
