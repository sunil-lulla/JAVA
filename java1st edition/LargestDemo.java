import java.util.Scanner;
class SmallestDemo
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
int size=sin.nextInt();
System.out.println("enter size of the array");
int[] arr=new int[size];
int min;
for(int i=0;i<size;i++)
{
System.out.println("enter any number");
arr[i]=sin.nextInt();
}
min=arr[0];
for(int i=1;i<size;i++)
{

if(min>arr[i])
{
min=arr[i];
}
}
System.out.println("minimum no is:"+min);

}


}