package practicejava;

import javax.swing.text.html.HTMLDocument;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPractice{
     public static void main(String args[]){
//         internal data structure is HashTable.
//                 Insertion Order is not preserved.
//         Duplicate keys are not allowed , However Can have duplicate values
//         Null Keys is allowed only once.
//         Null values can be added multiples.
//         Prefered we need to have search operation
//
//         Methods available in HashMap
//         HashMap hashmap=new HashMap();
//
//         hasmap.put()
//         hashmap.get()
//         hashmap.putall(Map C)
//         m.get(key)// return the values
//         m.remove(key)// used to remove the key
//         m.containsKey(key)// to check if key is available
//         m.containsValue("value")// checks value is present or not
//         m.isEmpty(); //check if the hashmap is empty
//         m.size(); returns the size of HashMap
//         m.clear();/ Clears map
//
//         m.keyset();// retrives the all keys
//         m.values();// returns all values
//         m.EntrySet

         System.out.println("HashMapPractice");
         HashMap<String,String > hashMap=new HashMap();
         hashMap.put("101","Jhon");
         hashMap.put("102","David");
         hashMap.put("103","Scott");
         hashMap.put("104","Marry");
         hashMap.put("105","Tye");
         hashMap.put("103","Vish");
         System.out.println("Map Values"+hashMap);

         System.out.println("Return the Value of Keys:-"+hashMap.get("104"));

         System.out.println("Removing a value:-"+hashMap.remove("105"));
//         After removing
         System.out.println(hashMap);

//         Contains Value
         System.out.println("Contains Value:-"+hashMap.containsValue("Marry"));
// Is Empty
         System.out.println("Is Empty:-"+hashMap.isEmpty());

//         Get the keys from the HashMap
         Set myset=hashMap.keySet();
         System.out.println("All Keys:-"+myset);
         Iterator iterator=myset.iterator();
         while(iterator.hasNext()){
             System.out.println("Each Item;-"+iterator.next());
         }
         for (Object object:myset){
             System.out.println("From for each loop;-"+object);
         }

         //         Get Values
         System.out.println("Values are ;-"+hashMap.values());
         for(Object value:hashMap.values()){
             System.out.println("Printing individual values:-"+value);
         }

         //         Get the entry set
         System.out.println("Entr Set"+hashMap.entrySet());

         // Printing Key Value Pair
         for(Object obj:hashMap.keySet()){
             System.out.println("Key Value Pair are "+obj+" and "+hashMap.get(obj)+"");
         }

//         Entry Interface Method
         for( Map.Entry entry:hashMap.entrySet()){
             System.out.println("Key ;-"+entry.getKey()+"and Values ;-"+entry.getValue()+"");
         }

//         Using iterator
         Set set=hashMap.entrySet();
         Iterator iterator1=set.iterator();
        while(iterator1.hasNext()){
//            System.out.println("From Iterator:-"+iterator1.next());
            Map.Entry entry=(Map.Entry) iterator1.next();
            System.out.println("Key value"+entry.getValue());
        }
     }
}
