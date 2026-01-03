package org.example;

import java.util.*;

public class list {
    public static void main(String[] args){
        // a Java program to create an ArrayList and add 5 integers to it.
List<Integer> list= new ArrayList<>();
list.add(3);
list.add(5);
list.add(1);
list.add(4);
list.add(6);
    System.out.println(list);

    // o	for loop
        for(int i =0;i<list.size();i++){
      System.out.println(list.get(i));
        }
        // o	enhanced for loop
        for(int i : list){
      System.out.println(i);
        }

        // o	Iterator
        Iterator<Integer> integerIterator=list.iterator();
        while(integerIterator.hasNext()){
      System.out.println(integerIterator.next());
        }

    // 3.	Write a program to remove an element from an ArrayList

    list.remove(1);
        System.out.println(list);

    // 4.	Write a Java program to check if an element exists in a List.
    System.out.println(  list.contains(5));
    // 5.	Write a program to sort an ArrayList of integers.
        Collections.sort(list);
    System.out.println("to sort an ArrayList of integers" + list);
    //6.	Write a program to reverse an ArrayList
        Collections.reverse(list);
    System.out.println("reverse an ArrayList"+ list);
    //7.	Write a Java program to convert an ArrayList to an array.
       Integer []b=  list.toArray(new Integer[0]);
    System.out.println("to convert an ArrayList to an array" + Arrays.toString(b));


    //8.	Write a program to find the size of a HashSet.
    Set<Integer> set1 = Set.of(3,2,1);
System.out.println(set1.size());

//9.	Write a program to add duplicate elements to a HashSet and observe the output.
HashSet<Integer> hashSet = new HashSet<>();
hashSet.add(3);
hashSet.add(1);
        hashSet.add(3);
        hashSet.add(1);
    System.out.println(hashSet.size());

    //10.	Write a Java program to create a HashMap and store student roll numbers and names.
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Name");
        map.put(2,"piyu");
    System.out.println(map.values());
    }
}
