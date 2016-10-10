import java.util.Scanner;
class IntersectionPoint
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter points for line one");
float x1=sin.nextFloat();
float y1=sin.nextFloat();
float x2=sin.nextFloat();
float y2=sin.nextFloat();
System.out.println("Line one points are ("+x1+","+y1+")  ("+x2+" ,"+y2+" )");
float a1=y1-y2;
float b1=x1-x2;
float c1=(y1-y2)*x1-(x1-x2)*y1;
System.out.println("Enter points for line two");
 x1=sin.nextFloat();
 y1=sin.nextFloat();
 x2=sin.nextFloat();
y2=sin.nextFloat();
System.out.println("Line one points are ("+x1+","+y1+")  ("+x2+" ,"+y2+" )");

float a2=y1-y2;
float b2=x1-x2;
float c2=(y1-y2)*x1-(x1-x2)*y1;

float x= (c1*b2-b1*c2)/(a1*b2-a2*b1);
float y= (a1*c2-c1*a2)/(a1*b2-a2*b1);
System.out.println(x+" "+y);


}
}