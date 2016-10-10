import java.util.Scanner;
class DemoUIC
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("Thank you for logging in sam corporation please enter your name:");
String name=sin.next();
sin.nextLine();
System.out.println("\nhello "+name+", plz enter  any number");
int num=sin.nextInt();
System.out.println("\nu have entered "+num);
System.out.println("\nThank you");




}


}