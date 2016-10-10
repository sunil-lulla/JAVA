import java.util.Scanner;
class StringIndex
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
String name=sin.nextLine().trim();

int a=name.indexOf(' ');
System.out.println(name.substring(0,a));
System.out.println(name.substring(a+1));
}
}