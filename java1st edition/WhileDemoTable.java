import java.util.Scanner;
class WhileTableDemo
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number ");
int a=s.nextInt();
int i=0;
while(i++<10)
{
System.out.println(i+"*"+a+"="+(i*a));

}

System.out.println("Thank you \n press any key to exit... ");

}


}