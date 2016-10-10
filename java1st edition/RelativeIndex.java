import java.util.Formatter;
class RelativeIndex
{
public static void main(String args[])
{
int a=10,b=20;
Formatter fout=new Formatter();
fout.format("%d %<d %2$d %<d",a,b);
System.out.println(fout);
}


}