import java.io.*;
class CircleTest
{
public static void main(String[] args) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.format("enter the radius");
int radius=Integer.parseInt(br.readLine(),10);
Circle a= new Circle();
a.setRadius(radius);
System.out.println("area:"+a.getArea());
System.out.println("cir:"+a.getCircumference());







}
}