import java.util.Scanner;
class ArrayConfusion
{
public static void main(String args[])
{
int[] arr=new int[11];

System.out.println(arr.length);
Scanner sin=new Scanner(System.in);
int temp=0;
for(int i=0;i<arr.length;i++)
{

System.out.println("enter no"+i+" position");
arr[i]=sin.nextInt();

}
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{

if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{

System.out.println(arr[i]);

}


}



}