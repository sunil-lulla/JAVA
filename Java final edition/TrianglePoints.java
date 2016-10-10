import java.util.Scanner;
class TrianglePoints
{
double area;

public TrianglePoints()
{
area=0;
}
public double getDistance(int x1,int y1,int x2,int y2)
{
double dist;
	 
 dist =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
return dist	;
}
public double getArea(double a,double b,double c)
{
double s=0;
s=(a+b+c)/2;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));		
	
}
public static void main(String[] args)
{
double a,b,c;
int x1,y1;
TrianglePoints tp=new TrianglePoints();
Scanner sin= new Scanner(System.in);
System.out.println("x1,y1");
x1=sin.nextInt();
y1=sin.nextInt();
int x2,y2;
System.out.println("x2,y2");
x2=sin.nextInt();
y2=sin.nextInt();
System.out.println("x3,y3");
int x3,y3;
x3=sin.nextInt();
y3=sin.nextInt();
a=tp.getDistance(x2,y2,x1,y1);
b=tp.getDistance(x3,y3,x1,y1);
c=tp.getDistance(x3,y3,x2,y2);
double areaABC=tp.getArea(a,b,c);
System.out.println("Enter point p");
int x4,y4;
x4=sin.nextInt();
y4=sin.nextInt();
a=tp.getDistance(x1,y1,x2,y2);
b=tp.getDistance(x1,y1,x4,y4);
c=tp.getDistance(x2,y2,x4,y4);
double areaAPB=tp.getArea(a,b,c);
a=tp.getDistance(x1,y1,x3,y3);
b=tp.getDistance(x1,y1,x4,y4);
c=tp.getDistance(x3,y3,x4,y4);
double areaAPC=tp.getArea(a,b,c);
a=tp.getDistance(x2,y2,x3,y3);
b=tp.getDistance(x4,y4,x2,y2);
c=tp.getDistance(x4,y4,x3,y3);
double areaBPC=tp.getArea(a,b,c);
if((int)areaABC==(int)(areaBPC+areaAPC+areaAPB))
System.out.println("Inside the triangle");
else
System.out.println("Outside the triangle");
}
}