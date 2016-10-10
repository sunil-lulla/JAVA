import static java.lang.System.out;
import java.util.Formatter;
import java.util.Scanner;
strictfp class ForDemo
{
public strictfp static void main(String args\u005b\u005d)
{

Formatter f=new Formatter();
f.format("enter any number");
out.println(f);
Scanner s=new Scanner(System.in);
int rows=s.nextInt();
out.println(String.format(" ur series are:"));
for(int i=1;i<=rows;i++)
{
for(int j=1;j<=rows;j++)
{
out.print("*");
}
out.println();

}



}


} 