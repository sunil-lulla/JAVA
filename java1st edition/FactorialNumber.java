import java.util.Scanner;
class FactorialNumber
{
public static void main(String args[])
{
System.out.println("enter any number");
Scanner sin=new Scanner(System.in);
int num=sin.nextInt();
int fact=1;
for(;num>0;--num)
{
fact=fact*num;
}
System.out.println(fact);



}


}