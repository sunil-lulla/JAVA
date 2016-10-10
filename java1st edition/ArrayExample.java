import java.util.Scanner;
class ArrayExample
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter size of the array");
int size=sin.nextInt();
int[] arr=new int[size];
//System.out.println("length:"+arr.length);
int sum=0;
for(int i=0;i<arr.length;i++)
{
arr[i]=sin.nextInt();
sum=sum+arr[i];
}



System.out.println((float)sum/arr.length);







}


}