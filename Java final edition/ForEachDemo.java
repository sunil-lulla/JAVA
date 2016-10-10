/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaledition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sam
 */
public class ForEachDemo  {
    public static void main(String[] args) throws IOException {
     int[] a= new int[10];
     BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
     for(int x:a)
     {
         System.out.println(x+2);
         //x=Integer.parseInt(bufferedReader.readLine(),10);
     
     }
     
     for(int x:a)
            System.out.println(x);
     
    }
}
