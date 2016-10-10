import java.util.Scanner;
class AtmReplica
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int[] pin={1,2,3,4};
String p=null;
boolean isInvalid=false;

for(;;)
{
System.out.println("Enter the pin");
p=sin.next();
for(int i=0;i<p.length();i++)
{
if(pin[i]!=p.charAt(i)-48)
{
System.out.println(pin[i]+"\t"+p.charAt(i));
isInvalid=true;
break;
}
}

if(isInvalid)
{
System.out.println("Invalid Pin");
System.out.println("Do you want to continue..");
String choice=sin.next();
if(choice.equals("yes")==false)
{
System.out.println("Good Bye");
System.exit(0);
}
}
else
break;
}

System.out.println("WElcome");








}
}