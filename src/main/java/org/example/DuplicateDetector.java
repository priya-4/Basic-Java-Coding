package org.example;

import java.util.HashSet;
import java.util.Set;

public class DuplicateDetector {
    public static void main(String []args){
        //Find duplicate elements in an integer array.
        int a[]=new int[]{2,3,2,1,8,1,1};
        Set set=new HashSet();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                   // System.out.println(a[i]);
                    set.add(a[i]);
                }
            }
        }
System.out.println(set);
    }
}
