import java.util.*;
class ContainsDemo
{
public static void main(String[] args)
{
ArrayList al= new ArrayList();
Scanner sin= new Scanner(System.in);
System.out.println("Enter something and press quit to stop");
String test;
do
{

test=sin.next();
if(test.equals("quit"))
break;
al.add(test);
}
while(true);
System.out.print("Press any String to check");
String check=sin.next();
if(al.contains(check))
{
System.out.print("Available  at"+(al.indexOf(check)+1)+"th position");
al.remove(check);
}
else
System.out.print("Not Available");

for(int i=0;i<al.size();i++)
System.out.println(al.get(i));




}
}