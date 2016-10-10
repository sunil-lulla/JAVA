package finaledition;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sam
 */
public class MaxMinValueUsingForEach {
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("size of array");
            int num=Integer.parseInt(bufferedReader.readLine(),10);
            int[] a= new int[num];
            for(int i=0;i<a.length;i++)
                a[i]=Integer.parseInt(bufferedReader.readLine(),10);
    
            int max,min;
            max=min=a[0];
            int count=0,count2=0;
            for(int i=0;i<a.length;i++)
            {
                if(max<a[i])
                 
                {
                    max=a[i];
                
                    count=i;
                }
                    if(min>a[i])
                {
                    min=a[i];
                    count2=i;
                }
                
            
            }
            
            
            System.out.print(max+" pos:"+(count+1)+"-------"+min+" pos2:"+(count2+1));
            
            
    }
}
