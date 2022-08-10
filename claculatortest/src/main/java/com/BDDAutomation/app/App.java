package com.BDDAutomation.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        String sMyString="WelComeToAutomation";
        int iUpper=0;
        int iLower=0;
        for(int i=0;i<sMyString.length();i++){
            char ch=sMyString.charAt(i);
            if(ch>=65 && ch<=90){
                iUpper=iUpper+1;
            }
            else{
                iLower=iLower+1;
            }
        }
        System.out.println("Upper char are:- "+iUpper+" and lower char are:- "+iLower);
    }
}
