package practicejava;

import java.util.*;

public class FindVowel {
    public static void main(String args[]){
//        System.out.println("WelComeOO");
//        String sMyString="WelComeOO";
//        int iVowel=0;
//        for(int i = 0; i<sMyString.length(); i++){
//            char myChar=sMyString.charAt(i);
//            if(myChar == 'a' || myChar == 'e' || myChar=='i' || myChar=='o' || myChar=='u'|| myChar == 'A' || myChar == 'E' || myChar=='I' || myChar=='O' || myChar=='U'){
//                iVowel++;
//            }
//        }
//        System.out.println("Count of vowels  :-"+iVowel);


//        sMyString.

        List list=new ArrayList();
        list.add("Hello");
        list.add("How");
        list.add("are");
        list.add("You");

        System.out.println(""+list.size());
//       List
        ArrayList arrayList=new ArrayList();
        arrayList.add(0,"Hello");
        arrayList.add(1,"How");
        arrayList.add(2,"Are");
        arrayList.add(3,"You");

//        System.out.println( arrayList.contains("Are"));

//       Collections.sort(arrayList);;
//       System.out.println("Sorted List is :-"+arrayList);
////     Reading elements using Array
//        for(int i=0;i<arrayList.size();i++){
//            System.out.println("Element in the arrayList:-"+arrayList.get(i));
//        }

//        For each loop
        System.out.println("Reading lements from for each loop...................");
        for(Object e:arrayList){
            System.out.println(e);
        }

        System.out.println("Reading lements from Iterator...................");
//        Reading elements using Iterator
        Iterator iterator=arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println("Item from Iterator:-"+iterator.next());
        }

//
    }
}
