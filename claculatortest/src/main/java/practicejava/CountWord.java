package practicejava;

import org.apache.commons.exec.util.StringUtils;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountWord {
    public static void main(String args[]){
        String s="Welcome To Hong Kong and Hong Kong Welcomes you";
        String[] sArray=s.split(" ");

        Set<String> mySet=new HashSet<>();
        for(int i=0;i<sArray.length;i++){
            mySet.add(sArray[i]);
        }
        Iterator iterator1=mySet.iterator();
        while (iterator1.hasNext()){
            String sWordNeedsToBeChecked=iterator1.next().toString();
            int count=0;
            for(int i=0;i<sArray.length;i++){
                if(sWordNeedsToBeChecked.equalsIgnoreCase(sArray[i])){
                    count=count+1  ;
                }
            }
            System.out.println("Word "+sWordNeedsToBeChecked+" occured time:-"+count);
        }
    }
}
