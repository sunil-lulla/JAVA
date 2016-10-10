class NewFib
{
public static void main(String args[])
{
java.util.Scanner sin= new java.util.Scanner(System.in);
int a=sin.nextInt();
int c =0,d=1;
while(a-->0)
{
System.out.print("\n"+d);
d=c+d;
c=d-c;
}


}
}