import java.io.*;
class Geometry
{
public static void main(String[] args) throws IOException
{
BufferedReader bud= new BufferedReader(new InputStreamReader(System.in));
int a =Integer.parseInt(bud.readLine());
int b =Integer.parseInt(bud.readLine());
int c=(int)Math.sqrt(Math.pow(b,2)+Math.pow(a,2));
if(c>10) 
System.out.println("outside");
else 
System.out.println("inside");

}
}