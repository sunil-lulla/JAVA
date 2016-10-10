import java.util.Formatter;
class FormatManipulate
{

public static void main(String args[])
{

int a=29999;


Formatter f=new Formatter();
f.format("%,d",a);
System.out.println(f);
f.flush();
f.out();
int b=10;
f.format("%,d",b);
System.out.println(f);

}
}