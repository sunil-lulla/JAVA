import java.util.Scanner;
class SearchDemo
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter size");
int size=sin.nextInt();
int[] arr=new int[size];
int i;
for( i=0;i<size;i++)
{
arr[i]=sin.nextInt();
}
System.out.println("enter any number");
int num=sin.nextInt();

for( i=0;i<size;i++)
{
if(num==arr[i])
{
System.out.println("found"+(++i));
System.exit(0);
}
}

if(i==size)
System.out.println("not found");




}
}