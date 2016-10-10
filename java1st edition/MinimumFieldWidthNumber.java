import java.util.Formatter;
class MinimumFieldWidthNumber
{
public static void main(String args[])
{
int a=2;
Formatter f=new Formatter();
f.format("%n%10d \n%20d \n%10d \n%10d \n%5d",a,a,a,a,a);
System.out.println(f);
f.close();
System.out.close();
}


}