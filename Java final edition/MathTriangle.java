import java.util.Scanner;
class MathTriangle
{
public int area(int x1,int y1,int x2,int y2,int x3,int y3, )
{
int area=0;
area=(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2;
return area;
}

public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter points for line one");

float x1=sin.nextFloat();
float y1=sin.nextFloat();

float x2=sin.nextFloat();
float y2=sin.nextFloat();

float x3=sin.nextFloat();
float y3=sin.nextFloat();

System.out.println("Enter points");





}
}
