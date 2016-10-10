import java.util.Scanner;
class ArrayDemo
{
public static void main(String args[])
{
//int[] arr=new int[5]; working
//int []brr=new int[5]; working
//int[] crr=new [5]int; error
System.out.println("enter size of the array");
Scanner sin=new Scanner(System.in);
//int size=sin.nextInt();
int[] arr=new int[5];
arr[0]=6;
arr[1]=7;
System.out.println("\n0"+arr[1]+"\n4 "+arr[4]);
int[] brr=new int[]{2,4,5,5,6};
for(int i=0;i<5;i++)
System.out.println(brr[i]);
int[] crr = {2,5,6,87,886,6};
for(int i=0;i<6;i++)
System.out.println(crr[i]);

}


}