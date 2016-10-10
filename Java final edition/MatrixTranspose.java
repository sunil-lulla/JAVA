/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaledition;

/**
 *
 * @author Sam
 */
public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        arr=new int[][]
        {
            {2,3,4},
            {5,6,7},
            {8,9,10},
            {11,2,9}    
        };
        
        
        
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
            
                System.out.printf("%4d",arr[j][i]);
            }
            System.out.print("\n");
        }
        
        
        
    }
    
}
