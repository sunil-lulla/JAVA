import java.util.Scanner;
class ReactanglePoints
{
public float getDistance(float x1,float y1,float x2,float y2)
{
	return (float)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
}
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
float x1=sin.nextFloat();
float y1=sin.nextFloat();
float w1=sin.nextFloat();
float l1=sin.nextFloat();
System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
float x2=sin.nextFloat();
float y2=sin.nextFloat();
float w2=sin.nextFloat();
float l2=sin.nextFloat();
ReactanglePoints rp= new ReactanglePoints();
float dist=rp.getDistance(x1,x2,y1,y2);
System.out.print(dist);
if(dist+w2/2<w1/2&&dist+l2<l1)
System.out.println("Inside");








}
}