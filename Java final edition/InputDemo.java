import java.util.*;
class InputDemo
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.print("efjs");
int d=0;
try{
d=sin.nextInt();
}
catch(InputMismatchException a)
{
System.out.print(a.getMessage());
}
System.out.print(d);






}
}