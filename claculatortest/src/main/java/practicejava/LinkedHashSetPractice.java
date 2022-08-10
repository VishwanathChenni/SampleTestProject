package practicejava;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPractice{
    public static void main(String args[]){
        System.out.println("LinkedHashSetPractice");
        LinkedHashSet linkedHashSet=new LinkedHashSet();
        linkedHashSet.add("X");
        linkedHashSet.add("Y");
        linkedHashSet.add("Z");
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        System.out.println("Linked Hash Set"+linkedHashSet);
        for(Object object:linkedHashSet){
            System.out.println("Looping:-"+object);
        }

        Iterator iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("Iterator:-"+iterator.next());
        }
    }
}
