package practicejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class HashSetPractice {
    public static void main(String args[]){
        System.out.println("Hello HashSetPractice");
       HashSet hashSet=new HashSet();// default capacity 16, loadfactor .75
//        HashSet hashSet=new HashSet(100);
//        HashSet hashSet1=new HashSet(100,(float)0.90);
//        HashSet<Integer> hashSet2=new HashSet<Integer>();

//     Add Lements
        hashSet.add("X");
        hashSet.add(100);
        hashSet.add("Y");
        hashSet.add(true);

        System.out.println("Hash Set is "+hashSet);

        hashSet.remove("Y");
        System.out.println("After removing"+hashSet);

        System.out.println("Is Present:-"+hashSet.contains("X"));

        System.out.println("Is Empty:-"+hashSet.isEmpty());

        Iterator iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println("From Iterator:-"+iterator.next());
        }

        for(Object obj:hashSet){
            System.out.println("From For Each:-"+obj);
        }
        HashSet<Integer> integerHashSet=new HashSet<>();
        integerHashSet.add(2);
        integerHashSet.add(4);
        integerHashSet.add(6);

        HashSet<Integer> oddNumber=new HashSet<>();
        oddNumber.add(3);
        oddNumber.add(5);
        oddNumber.add(7);
        oddNumber.addAll(integerHashSet);

        System.out.println("Updated Hash Set"+oddNumber);

        oddNumber.removeAll(integerHashSet);

        System.out.println("HashSet After removing"+oddNumber);

        Iterator iterator1=oddNumber.iterator();
        while (iterator1.hasNext()){
            System.out.println("Available Elements:-"+iterator1.next());
        }

    }
}
