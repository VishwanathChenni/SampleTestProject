package practicejava;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractice{
    public static void main(String args[]){
        System.out.println("Hello World!");

        LinkedList linkedList=new LinkedList();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Size of linked list is "+linkedList.size());
//
////        Removing objects from LinkedList
//        linkedList.remove();

//        Print after removing objects
        System.out.println("after removing element"+linkedList);

//      Adding elements in the middle of list
        linkedList.add(4,"X");
        System.out.println("New List after inserting ;-"+linkedList);

        System.out.println("Out put of get method"+linkedList.get(4));

        for(Object e:linkedList){
            System.out.println("Reading element "+e);
        }

        Iterator iterator=linkedList.iterator();
        while(iterator.hasNext()){
            System.out.println("Printing from Iterator:-"+iterator.next());
        }

//        Collections.sort(linkedList);
//        System.out.println("Sorted list is"+linkedList);
//        Revering the Order
        Collections.reverse(linkedList);
        System.out.println("Reversed Order"+linkedList);


    }
}
