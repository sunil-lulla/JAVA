import java.util.Formatter;
class FormatDemo2
{
public static void main(String args[])
{

int a=1;
Formatter fout=new Formatter();
fout.format("%d %d %d",a,a,a);
System.out.println(fout);
fout.close();
System.out.close();
}


}