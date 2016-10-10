class BinaryFromDecimal
{
public static void main(String[] args)
{
java.util.Scanner sin= new java.util.Scanner(System.in);
int n=sin.nextInt();
int temp;
for( int j=1,temp=0;n>0;temp+=n%10*j,j*=2,n/=10);
System.out.print(temp);

}
}