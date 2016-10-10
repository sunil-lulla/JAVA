import java.util.Scanner;
class HeronsFormula
{
public float getDistance(float x1,float y1,float x2,float y2)
{
return (x2-x1)+(y2-y1);
}
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
float x1,y1,x2,y2,x3,y3;
System.out.println("x1 and y1");
x1=sin.nextFloat();
y1=sin.nextFloat();
System.out.println("x2 and y2");
x2=sin.nextFloat();
y2=sin.nextFloat();
System.out.println("x3 and y3");
x3=sin.nextFloat();
y3=sin.nextFloat();
HeronsFormula hf= new HeronsFormula();
float side1=hf.getDistance(x1,y1,x2,y2);
float side2=hf.getDistance(x2,y2,x3,y3);
float side3=hf.getDistance(x1,y1,x3,y3);
float s=(side1+side2+side3)/2.0f;
System.out.println(s);
double ak=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
System.out.println(ak);


}
}