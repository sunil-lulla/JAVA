import java.util.Formatter;
class FormatterDemo
{
public static void main(String args[])
{int a=9;
Formatter fout=new Formatter();
fout.format("formatt is %d",a);
System.out.println(fout);
fout.close();
}

}