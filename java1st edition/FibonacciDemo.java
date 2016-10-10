import java.util.Scanner;
class FibonacciDemo
{
public static void main(String args[])
{
Scanner sin =new Scanner(System.in);
System.out.println("Enter any number");
int n=sin.nextInt();
int n1=0,n2=1;
int temp=0;
while(n>0)
{            

temp=n1+n2;
n1=n2;
n2=temp;

    System.out.println(temp);   
--n;         

}
}


}