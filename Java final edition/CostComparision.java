import java.util.Scanner;
class CostComparision
{
float getCost(float w,float p)
{



return w/p;


} 
public static void main(String[]  args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter weight and price for package 1:");
float w1=sin.nextFloat();
float p1=sin.nextFloat();

System.out.println("Enter weight and price for package 2:");
float w2=sin.nextFloat();
float p2=sin.nextFloat();
CostComparision cc= new CostComparision();
float r1=cc.getCost(w1,p1);
float r2=cc.getCost(w2,p2);
System.out.println(r1+"  "+r2);
if(r1>r2)
System.out.println("package 1:");
else if(r1<r2)
System.out.println("package 2:");
else
System.out.println("Both");



}
}