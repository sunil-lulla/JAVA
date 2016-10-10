import java.util.Scanner;
class ECP31_1
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter any number");
int number=s.nextInt();
System.out.println("enter multiple");
int multiple=s.nextInt();
int remainder=number%multiple;
System.out.println("remainder"+remaindern);
int sub=multiple-remainder;
System.out.println("subtraction :"+sub);

System.out.println("next multiple is :"+(number+sub));




}


}