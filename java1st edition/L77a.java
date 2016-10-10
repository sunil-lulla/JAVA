import java.io.PrintStream;
import java.util.Scanner;
strictfp class L77a
{
public strictfp static void main(String args\u005b\u005d)
{
PrintStream p=System.out;
Scanner sin = new Scanner(System.in);
double cp=sin.nextDouble();
double sp=sin.nextDouble();
if(cp<sp)
p.println("u are in profit of rs"+(sp-cp));
else
p.println("u are in loss of rs"+(cp-sp));





}
}