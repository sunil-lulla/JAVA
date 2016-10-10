import java.io.*;
class ISBN
{
public static void main(String[] args) throws IOException
{
long temp=0;
int a=0;
BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter 9 digits ISBN number");
String num=buf.readLine();
for(int i=0;i<num.length();i++)
{
a=num.charAt(i)-48;
temp=temp+a*(i+1);
}

temp=temp%11;
if(temp==10)
System.out.print("The 10 digit ISBN number is: "+num+"X");
else
System.out.print("The 10 digit ISBN number is: "+num+temp);









}
}