import java.io.*;
class GeometryRec
{
public  static void main(String[] args) throws IOException
{
BufferedReader bud= new BufferedReader(new InputStreamReader(System.in));
int x =Integer.parseInt(bud.readLine());
int y =Integer.parseInt(bud.readLine());
System.out.println("Enter the length and breadth of rectangle");
int l=Integer.parseInt(bud.readLine());
int b=Integer.parseInt(bud.readLine());
if(l/2<x||b/2<y)
System.out.println("Outside");



}
}