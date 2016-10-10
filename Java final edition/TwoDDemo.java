/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finaledition;

/**
 *
 * @author Sam
 */
public class TwoDDemo {
    public static void main(String[] args) {
        
        int[][] arr= new int[3][3];
        arr=new int[][]
        {
            {2,3,4},
            {5,6,7},
            {8,9,10}
        };
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.printf("%-3d",arr[i][j]);
            }
            System.out.print("\n");
        }
        
    }
}
