import java.io.PrintStream;
import java.util.Scanner;
strictfp class L77c
{
public strictfp static void main(String args\u005b\u005d)
{
PrintStream p=System.out;
Scanner sin = new Scanner(System.in);
p.println("enter year");
int year=sin.nextInt();
if(year%4==0)
p.println("laeap year");
else
p.println("no");




}
}