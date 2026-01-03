package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureChest {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        //taking user input for no of array elements
        int val=sc.nextInt();
        //create an array of size user provided
        int [] b=new int[val];
        //take user input for array values
        for(int i=0;i<val;i++){
            b[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(b));


    }
}
