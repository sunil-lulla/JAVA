import java.util.Formatter;
strictfp class Test1
{
public strictfp  static void main(String args\u005b\u005d)
{
byte a=Byte.parseByte(args[0]);
short b=Short.parseShort(args[1]);
int c=Integer.parseInt(args[2]);
long d=Long.parseLong(args[3]);
float e=Float.parseFloat(args[4]);
double f=Double.parseDouble(args[5]);
Formatter fout=new Formatter();
fout.format("%nbyte%2$ d %nbyte%< d %nshort %1$ d %nint%4$ d %nlong%3$ d     ",b,a,d,c);
System.out.println(fout);
fout.close();
System.out.close();
}


}