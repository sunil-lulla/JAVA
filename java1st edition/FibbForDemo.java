import java.util.Scanner;
class FibbForDemo
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter 1 st number");
int n1=sin.nextInt();

System.out.println("enter  2nd number");
int n2=sin.nextInt();

System.out.println("enter range");

int range=sin.nextInt();
int temp=0;
System.out.println(n1+"\n"+n2);
outer:
for(;temp<range;)
{

temp=n1+n2;
n1=n2;
n2=temp;



if(temp<range)
System.out.println(temp);
else
break outer;
}



}


}