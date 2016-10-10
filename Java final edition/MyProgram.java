import java.util.Scanner;
class MyProgram
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int num=sin.nextInt();
int counter=1;
int i;
for(i=1;num>0;i++)
{
num-=counter;
counter+=2;
}
if(num==0)
System.out.print(--i);
else
System.out.print("Error");
}
}