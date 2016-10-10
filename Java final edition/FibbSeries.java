import java.util.Scanner;
class FibbSeries
{
public static void main(String[] args)
{

Scanner in= new Scanner(System.in);
int T=in.nextInt();
int f1,f2,N;
while(--T>=0)
{
f1=in.nextInt();
f2=in.nextInt();
N=in.nextInt();
if(N>1000000000)
N%=7;

while(--N>=1)
{
f2=f1+f2;
f1=f1-f2;
}
System.out.println(f2);




}
}
}