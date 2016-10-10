import java.util.Scanner;
class ConcatenateDemo
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
System.out.println("enter how many Strings u want 2 enter");
int t_string=sin.nextInt();
String kk=new String();
String temp;
for(int i=0;i<=t_string;i++)
{
temp=sin.nextLine();
kk=kk+" "+temp;
}
System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n"+kk);




}




}