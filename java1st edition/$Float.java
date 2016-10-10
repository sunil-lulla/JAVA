import java.util.Formatter;
import java.io.PrintStream;
strictfp class  $Float
{
public static strictfp void main(String args\u005b\u005d)
{
float a=4.57f;
PrintStream ps=System.out;
ps.println(String.format("%n%g",a));
Formatter fout=new Formatter();
fout.format("%n%a",a);
ps.println(fout);
ps.printf("%n"+fout);
ps.printf("%n%h",ps);
ps.printf("%n%x",10);
ps.printf("%n%o",10);

ps.printf("%n%e",10.8989);
fout.close();
ps.close();
System.out.close();

}
}