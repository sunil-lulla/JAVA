package com.sam;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sin=new Scanner(System.in);
        System.out.println("i love computer\r\n");     
        String para=sin.nextLine();
        sin= new Scanner(para).useDelimiter(" ");
        String word=null,text;
        while(sin.hasNext())
        {           
            word=sin.next();
            text="";
            for(int i=0;i<word.length();i++)
            text=word.charAt(i)+text;
            System.out.print(text+" ");   
        }              
    }
}
