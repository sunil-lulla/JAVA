class Fact
{
public static void main(String[] args)
{
java.util.Scanner sin= new java.util.Scanner(System.in);
int n=sin.nextInt();
System.out.print("Factorial of "+n+"=");
n=n==0?1:n;
for(int i=n;i!=1;n*=--i);
System.out.print(n);
}
}