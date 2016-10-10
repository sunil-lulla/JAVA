import java.util.Scanner;
class InputTest77
{
public static void main(String args[])
{
System.out.println("enter ur name");
Scanner sin=new Scanner(System.in);
String s=sin.nextLine();
System.out.println("enter ur age");
int a=sin.nextInt();

System.out.println("enter ur aggregate si");
float f=sin.nextFloat();

System.out.println("enter ur name is"+s+"\n ur age is"+a+"\n Next year u will be"+(a+1)+"\n ur aggregate is:"+f);

}


}