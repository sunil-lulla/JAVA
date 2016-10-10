import java.util.Formatter;
class MinimumFieldWidth
{
public static void main(String args[])
{
float a=2.13f;
Formatter f=new Formatter();
f.format("%n%10f \n%20f \n%10f \n%10f \n%5f",a,a,a,a,a);
System.out.println(f);
f.close();
System.out.close();
}


}