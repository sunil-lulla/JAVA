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
public class TraverseUsingForEach  
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("size of array");
        int num=Integer.parseInt(bufferedReader.readLine(),10);
        int[] a= new int[num];
        for(int i=0;i<a.length;i++)
            a[i]=Integer.parseInt(bufferedReader.readLine(),10);
        int sum=0;
        
        for(int x:a)
        {
        sum+=x;
        }
        System.out.println("sum: "+sum+"\t--"+(float)sum/num);
        
        
    }
    
}
