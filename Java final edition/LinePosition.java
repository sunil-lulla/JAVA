import java.util.Scanner;
class LinePosition
{
float getPosition(float ... x)
{

return x[0]*x[1]-(x[2]*x[3]);
}
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter three points for p0 , p1 and p2");
float x0=sin.nextFloat();
float y0=sin.nextFloat();

float x1=sin.nextFloat();
float y1=sin.nextFloat();

float x2=sin.nextFloat();
float y2=sin.nextFloat();
LinePosition lp= new LinePosition();
int pos;
pos=(int)lp.getPosition(x1-x0,y2-y0,x2-x0,y1-y0);

if(pos>0)
System.out.print("Left");
else if(pos<0)
System.out.print("right");
else
System.out.print("Same");
}
}