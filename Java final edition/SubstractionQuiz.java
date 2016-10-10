import java.util.*;
class SubstractionQuiz
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int a=(int)(Math.random()*100);
int b=(int)(Math.random()*100);
System.out.println(a+"-"+b+" will be");

int c=sin.nextInt();
if(c==a-b)
System.out.println("gud");
else
System.out.println("try next time");

}
}