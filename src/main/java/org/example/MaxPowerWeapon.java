package org.example;

public class MaxPowerWeapon {
    public static void main(String []args){
        //Find the largest element in an array.
     System.out.println();
     int a[]=new int[]{2,3,5,1};
     int highest=a[0];
     for(int i=1;i<a.length;i++){
         if(highest<a[i]){
             highest=a[i];
         }
     }
     System.out.println(highest);
    }
}
