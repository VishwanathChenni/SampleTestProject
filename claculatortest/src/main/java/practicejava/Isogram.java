package practicejava;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static void main(String args[]){
        System.out.println(Isogram("pen"));
    }
    public static boolean Isogram(String s){
        boolean isIsogram=true;
        char ch[]=s.toCharArray();
        Set<Character> myset=new HashSet<>();
        for(int i=0;i<ch.length;i++){
            if(myset.contains(ch[i])){
                isIsogram=false;
                break;
            }else{
                myset.add(ch[i]);
            }
        }
        return isIsogram;
    }
}
