import java.util.Scanner;
class Reversal
{
public static void main(String args[])
{

System.out.println("enter any number");
Scanner sin=new Scanner(System.in);
int num=sin.nextInt();
int temp=0;
for(;num>0;num/=10)
{
temp=temp*10+(num%10);
}
System.out.println(temp);

/*
*
*
*
*@author Sam insomniac
*method 2
*
*
*/


System.out.println("using method 2");
num=sin.nextInt();
for(;num>0;num/=10)
{
System.out.print(num%10);
}



}


}