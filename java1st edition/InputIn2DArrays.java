import java.util.Scanner;
import java.util.Arrays;
class InputIn2DArrays
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter no rowa");
int m=sin.nextInt();
System.out.println("column");
int n=sin.nextInt();
int[][] arr=new int[m][n];
int sum=0;
int count=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=sin.nextInt();
sum+=arr[i][j];
count++;
}
}
System.out.println("sum is:"+sum+"\navg :"+(float)sum/count);

for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{

System.out.print(arr[i][j]);
}
System.out.println();
}




}
}