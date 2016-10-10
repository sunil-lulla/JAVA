class SumOFSeries
{
public static void main(String[] args)
{
java.util.Scanner sin= new java.util.Scanner(System.in);
int a=sin.nextInt();
int sum=0;
int term=1;
for(int i=1;i<=a;i++)
{
sum+=term;
term=term+i;
}
System.out.print(sum);
}
}