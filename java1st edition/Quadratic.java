import java.lang.StrictMath;
import java.util.Scanner;
class Quadratic
{
public static void main(String args[])
{

System.out.println("Ax2+Bx+C");
Scanner sin=new Scanner(System.in);
System.out.println("Enter value for A");
int a=sin.nextInt();
System.out.println("Enter value for B");
int b=sin.nextInt();
System.out.println("Enter value for C");
int c=sin.nextInt();
int d1=(int)((StrictMath.pow(b,2))-(4*a*c));
double x1,x2;
if(d1<0)
{

System.out.println("roots are imaginary");


}


else
{
if(d1==0)
{

x1=(-b)/(2*a);
x2=b/(2*a);
System.out.println("roots are"+x1+"  "+x2);


}


else
{
x1=(((-b)+StrictMath.pow(d1,0.5))/(2*a));

 x2=(((-b)-StrictMath.pow(d1,0.5))/(2.0*a));
System.out.println("roots are"+x1+"  "+x2);

}
}

System.out.close();
sin.close();
}

}