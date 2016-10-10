import java.util.Formatter;
class Flagss
{

public static void main(String args[])
{

int a=10;
Formatter f=new Formatter();

f.format("%+d",a);
//Using + flag

System.out.println(f);
f.close();
Formatter f2=new Formatter();


f2.format("%  d",-a);
//Using + space

System.out.println(f2);
Formatter f3=new Formatter();
f3.format("%d",a);
//Using + space

System.out.println(f3);

}
}