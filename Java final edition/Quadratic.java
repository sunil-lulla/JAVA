import java.io.*;
class Quadratic
{
public static void main(String[] args)
{
int d=0;
double r1=0.0f;
BufferedReader buf=  new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter x2,x,constant");
try{
int a=Integer.parseInt(buf.readLine(),10);
int b=Integer.parseInt(buf.readLine(),10);
int c=Integer.parseInt(buf.readLine(),10);
d=b*b-4*a*c;
if(d<0)
{
System.out.println("Equation hass no real roots avilable");
System.exit(0);
}
if(d==0)
{
r1=-b/(2*a);
System.out.println("Equation has only one root avilable"+r1);
System.exit(0);
}
r1=(-b+Math.sqrt(d))/2*a;
System.out.print(r1+"\t");
r1=(-b-Math.sqrt(d))/2*a;
System.out.print(r1);



}
catch(NumberFormatException e)
{
System.out.print("invalid i/p");
}
catch(IOException e)
{
System.out.print("invalid i/p");
}

}
}