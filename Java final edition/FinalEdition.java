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
public class FinalEdition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
         
        
        
        
        System.out.println("enter size of array");
        int n=Integer.parseInt(bufferedReader.readLine(),10);
        
        int[] nums= new int[n];
        for(int i=0;i<nums.length;i++)
        {
           nums[i]=Integer.parseInt(bufferedReader.readLine(),10);     
        }
        System.out.println("enter sort order");
        char ch=bufferedReader.readLine().charAt(0);
        int temp=0;
        if(ch=='a')
        {
            //54321
            
            for(int i=0;i<nums.length-1;i++)
            {   
               for(int j=i+1;j<nums.length;j++)
                {
                if(nums[i]>nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                } }
            
            
            
            
            
            
        }
        else
        {
        
            for(int i=0;i<nums.length-1;i++)
            {   
               for(int j=i+1;j<nums.length;j++)
                {
                if(nums[i]<nums[j])
                {
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
                } }
        
        
        }
       for(int i=0;i<nums.length;i++)
            System.out.print("\t"+nums[i]);
        
    
    }
}
