import java.util.Scanner;
class ScannerDemo2
{
public static void main(String args[]) 
{

Scanner sin=new Scanner(System.in);
System.out.println("Enter a byte");
byte a=sin.nextByte();

System.out.println("Enter a short");
short b=sin.nextShort();

System.out.println("Enter a int");
int c=sin.nextInt();
System.out.println("Enter a long");
long d=sin.nextLong();

System.out.println("Enter a float");
float e=sin.nextFloat();

System.out.println("Enter a double");
double f=sin.nextDouble();


System.out.println("Enter a String");
String g=sin.next();
sin.nextLine();
System.out.println("Enter a strin wid space");
String h=sin.nextLine();



System.out.println("Enter a char");

//char i=(char)System.in.read();


//System.out.println("%nbyte is%1$d  %nshort is%3$d   %nint is%2$d %nlong is%4$d %nfloat%6$d is %ndouble is%7$d %nString//%9$d //%nStspc%5$d %nchar is%8$d  ",a,c,b,d,h,e,f,i,g);

}




}