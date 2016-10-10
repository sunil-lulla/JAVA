import java.util.*;
class Perimeter
{
public static void main(String[]  args)
{
Scanner input= new Scanner(System.in);
String d= input.nextLine();
input=new Scanner(d);
int a=input.nextInt();
int b=input.nextInt();
int c=input.nextInt();
if(a+b>=c&&b+c>=a&&a+c>=b)
System.out.print("invalid");
else
System.out.println(a+b+c);
}
}