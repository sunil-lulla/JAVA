import java.io.*;
class CounterTest
{
public static void main(String[] args) throws IOException
{
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
int[] arr= new int[10];
for(int i=0;i<arr.length;i++)
arr[i]=Integer.parseInt(bf.readLine(),10);
System.out.format("enter the number");
int[] brr;
int num=Integer.parseInt(bf.readLine(),10);
brr=Counter.count(arr,num);
System.out.println("values equal to"+num+"are"+brr[0]);
System.out.println("values  greater than"+num+"are"+brr[1]);
System.out.println("values less than"+num+"are"+brr[2]);






}

}