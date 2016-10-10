import java.util.Scanner;
class TrianglePoint
{
public float getArea(float x1,float y1,float x2,float y2,float x3,float y3 )
{
return (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2; 
}
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
float x4=sin.nextFloat();
float y4=sin.nextFloat();
TrianglePoint tp= new TrianglePoint(); 
float area=tp.getArea(0,0,0,100,200,0);
float area2=tp.getArea(0,0,x4,y4,200,0);
float area3=tp.getArea(0,0,10,30,x4,y4);
float area4=tp.getArea(10,30,x4,y4,200,0);
System.out.println(area+"area2 "+area2+"area3 "+area3+"area4"+area4);
System.out.println(area2+area3+area4);
if(area==(area2+area3+area4))
System.out.println("inside triangle");


}
}


