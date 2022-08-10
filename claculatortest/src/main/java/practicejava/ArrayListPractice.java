package practicejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice{
    public static void main(String args[]){
        System.out.println("HelloWorld!");
        ArrayList arrayList=new ArrayList();
        arrayList.add("X");
        arrayList.add("Y");
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println("My current Array List"+arrayList);

        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println("My Sorted Array List"+arrayList);


        String arr[]={"1","2","3","4","5"};
        for (String value:arr){
            System.out.println("Elements from array"+value);
        }

//        Converting Array to Array list
        ArrayList al=new ArrayList(Arrays.asList(arr));

        System.out.println("Converted Array List"+al);

        for(Object obj:al){
            System.out.println("Object is:-"+obj);
        }

    }
}
