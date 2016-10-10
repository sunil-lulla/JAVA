import java.util.Scanner;
import java.util.Formatter;
import java.io.PrintStream;
class TableWhile
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
Formatter fout=new Formatter();
fout.format("plzzz enter the number whose table you want..");
PrintStream sout=System.out;
sout.println(fout);
fout.close();
int num=s.nextInt();
int i=0;
while(i++<10)
{
sout.println(num+"*"+i+"="+(num*i));


}

sout.close();
s.close();
}



}