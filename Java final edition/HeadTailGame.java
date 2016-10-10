import java.util.*; 
class HeadTailGame
{
public static void main(String[] args)
{
Scanner  sin= new Scanner(System.in);
int a=(int)(Math.random()>0.5d?1:0);
int guess=sin.nextInt();
System.out.print(a);
if(a==guess)
System.out.print("gzb");
}
}