import java.util.*;
class DoWhileDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String chc;
do{
System.out.println("enter value for a");

try{
int a=s.nextInt();
System.out.println("enter value for b");

int b=s.nextInt();
int sum=a+b;
System.out.println("sum is"+sum);}
catch(InputMismatchException e)
{
System.out.println("plz enter only integer value");

}

System.out.println("do u want to continue");
s.nextLine();
chc=s.nextLine();


}
while(chc.equalsIgnoreCase("y"));
}

}