import java.util.Scanner;
class Table
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int num;
for(;;)
{
System.out.println("Enter a number");
num=sin.nextInt();
for(int i=1;i<=10;i++)
System.out.printf("%3d * %3d= %-3d\n",num,i,i*num);
System.out.println("Do you want to continue (yes/no)");
if(sin.next().equals("yes"))
continue;
System.out.println("Good bye");
break;
}
}
}