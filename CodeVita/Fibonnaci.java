class Fibonnaci 
{
public static void main(String[] args) 
{
int a=1;
int b=1;
java.util.Scanner sin= new java.util.Scanner(System.in);
System.out.print("number of values you want");
byte cd=0;
try
{
 cd=sin.nextByte();
}
catch(java.util.InputMismatchException e)
{
System.exit(0);
}
System.out.print(a);
for(int i=0;i<cd-1;i++) {
System.out.print("\n"+b);
b=a+b;
a=b-a; 
}
}
}