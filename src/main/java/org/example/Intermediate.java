package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Intermediate {
  public static void main(String[] args) {
    // 11.	Write a Java program to iterate over a HashMap using:
    // o	keySet()
    // o	entrySet()

      HashMap<Integer,Integer> hashMap = new HashMap<>();
      hashMap.put(1,1);
      hashMap.put(2,4);
      hashMap.put(3,1);
      hashMap.put(4,4);
      Set<Integer> set= hashMap.keySet();
      for(Integer s:set){
      System.out.println(hashMap.get(s));
      }
     for(Map.Entry<Integer,Integer> entry : hashMap.entrySet()){
      System.out.println("Key : " + entry.getKey() + "Value : " + entry.getValue());
     }
//12.	Write a program to find duplicate elements in an ArrayList.
      List<Integer> list = Arrays.asList(2,1,1,4,2);
     for(int i=0;i<list.size()-1;i++){
         for(int j=i+1;j<list.size();j++){
             if(list.get(i)==list.get(j)){
          System.out.println(list.get(i));
             }
         }
     }


     //13.	Write a Java program to remove duplicates from an ArrayList using a Set.
      List<Integer> list1 = Arrays.asList(2,1,1,4,2);
     Set<Integer> set1= new HashSet<>(list1);
     System.out.println(set1);
//14.	Write a program to count the frequency of elements in a List using HashMap.
      List<Integer> list2 = Arrays.asList(1,2,4,3,1,1,2,3,3,3,3);
      HashMap<Integer,Integer> map = new HashMap<>();
    System.out.println(list2.stream().collect(Collectors.groupingBy(Integer::intValue,Collectors.counting())));
  }
}
