class BinaryFromDecimal
{
public static void main(String[] args)
{
java.util.Scanner sin= new java.util.Scanner(System.in);
int n=sin.nextInt();
int temp,j;
for(j=1 ,temp=0;n>0;n/=10)
{
temp+=n%10*j;
if(n%10!=0&&n%10!=1)
{
System.exit(0);
}
j*=1
}
System.out.print(temp);
}
}