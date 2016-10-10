/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaledition;

/**
 *
 * @author Sam
 */
public class ThreeDDemo {

    public static void main(String[] args) {
        int[][][] arr= new int[][][]{
            {
                {2,3,4},
                {5,6,7}          
            },
            
            {
                {5,6,7},
                {8,9,10},       
                    {4,5,6}  
            },
            
            {
                {11,12,13},
                {14,56,87}           
            }       
        };
        
        
        for(int i=0;i<arr.length;i++)
        {
        
        for(int j=0;j<arr[i].length;j++)
        {
        
        for(int k=0;k<arr[i][j].length;k++)
        {   
        System.out.print(" "+arr[i][j][k]);
        }
        System.out.print("\n");
        
        }
        System.out.print("\n");
        
        
        }
        }
}
