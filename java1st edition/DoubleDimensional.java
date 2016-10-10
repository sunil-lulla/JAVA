import java.util.Scanner;
import java.util.Arrays;
class DoubleDimensional
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter rowss");
int m=sin.nextInt();
System.out.println("enter columns");
int n=sin.nextInt();
int[][] arr=new  int[m][n];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.println("enter value"+i+" "+j+"th value");
arr[i][j]=sin.nextInt();
}
}
for(int[] x:arr)
{
for(int y:x)
{
System.out.print(y);
}
System.out.println();

}


}


}