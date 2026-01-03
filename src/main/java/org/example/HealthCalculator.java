package org.example;

import java.util.Scanner;

public class HealthCalculator {
    public static void main(String[] args){
        //Create a method to calculate BMI.
        float weight,height;
        Scanner sc= new Scanner(System.in);
        weight=sc.nextFloat();
        System.out.println("Please input height in meters : ");
        height=sc.nextFloat();
        calculateBmi(weight,height);
    }

    public static void calculateBmi(float w,float h){
      float final1=  w/(h*h);
    System.out.println(final1);
    }
}
