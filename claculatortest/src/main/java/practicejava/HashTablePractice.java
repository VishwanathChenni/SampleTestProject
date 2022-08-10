package practicejava;

import io.cucumber.java.hu.Ha;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTablePractice{
    public static void main(String args[]){
        System.out.println("Hello HashTablePractice");
//        Hashtable hashtable=new Hashtable();// Capacity is 11, Load factor is .75
//        hashtable.put("");
//        Hashtable hashtable=new Hashtable(100);
//        Hashtable hashtable1=new Hashtable(100, (float)0.90);

        Hashtable<Integer,String> hashtable=new Hashtable<>();
        hashtable.put(101,"Jhon");
        hashtable.put(102,"David");
        hashtable.put(103,"Merry");
        System.out.println(hashtable);
        System.out.println("Value from HashTable:-"+hashtable.get(102));
        hashtable.remove(103);
        System.out.println("After removing:"+hashtable);
        System.out.println("Contains Key:-"+hashtable.containsKey(107));

        for(int key:hashtable.keySet()){
            System.out.println("Key"+key+"____________"+hashtable.get(key));
        }

        for(Map.Entry entry :hashtable.entrySet()){
            System.out.println( entry.getKey()+"------------"+entry.getValue());
        }

        Set set=hashtable.entrySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            System.out.println("From While:-"+ entry.getValue());
        }
    }
}
