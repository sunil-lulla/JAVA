import java.util.Scanner;
class IntersectionPoint2
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
float ax,by,c;
float x1,x2,y1,y2;
System.out.println("Enter x1,y1,x2,y2");
x1=sin.nextFloat();
y1=sin.nextFloat();
x2=sin.nextFloat();
y2=sin.nextFloat();
ax=y1-y2;
by=x1-x2;
c=ax*x1-by*y1;
float a2x,b2y,c2;
System.out.println("Enter x1,y1,x2,y2");
x1=sin.nextFloat();
y1=sin.nextFloat();
x2=sin.nextFloat();
y2=sin.nextFloat();
a2x=y1-y2;
b2y=x1-x2;
c2=a2x*x1-b2y*y1;
if(a2x+ax==0.0f&&b2y+by==0.0f)
System.out.println("parallell");
else
{
System.out.printf("% .3f\n",(by*c2-c*b2y)/(ax*b2y-a2x*by));
System.out.printf("% .3f",(ax*c2-c*a2x)/(ax*b2y-a2x*by));
}





}
}