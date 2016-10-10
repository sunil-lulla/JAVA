import java.util.Formatter;
import java.util.Scanner;
import java.io.PrintStream;
class ECP31E1
{
public static void main(String args\u005b\u005d)
{
Formatter fout=new Formatter();
fout.format("enter any number");
PrintStream p=System.out;
p.println(fout);
Scanner sin=new Scanner(System.in);
int number = sin.nextInt();
p.println("enter divisible value");
int div_value=sin.nextInt();
System.out.println("new no would be"+((div_value-number%div_value)+number));








fout.close();
p.close();




}


}