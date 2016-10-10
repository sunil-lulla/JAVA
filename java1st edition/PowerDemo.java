import java.util.Scanner;
class PowerDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number");
int number=s.nextInt();
System.out.println("enter power");
int power=s.nextInt();
int powers=1;
for(;power-->0;)
{

powers*=number;


}

System.out.println(powers);
}



}