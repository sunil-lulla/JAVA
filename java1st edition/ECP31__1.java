import java.util.Scanner;
class ECP31__1
{
public static void main(String args[])
{
System.out.println("enter any number");
Scanner sin=new Scanner(System.in);

int num=sin.nextInt();
System.out.println("enter its miltiple");
int mul=sin.nextInt();
System.out.println(num+mul-num%mul);



}
}