import java.util.Scanner;
class FactorialNew
{
public static void main(String[] args)
{
int sum=1;
Scanner sin = new Scanner(System.in);
int num=sin.nextInt();
while(num>0)
sum*=num--;
System.out.print(sum);
}
}