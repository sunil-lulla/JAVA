import java.util.Scanner;
public strictfp class TableDoWhile
{
public String toString()
{
return "TableDoWhile";

} 
public strictfp static void main(String args[])
{
System.out.println("enter any number");
Scanner sin=new Scanner(System.in); 
int num=0;
try
{
 num=sin.nextInt();
}
catch(Exception e)
{
System.out.println(e.toString());

}
int i=1;
do
{

System.out.println(num+"*"+i+"="+(num*i));
}
while(i++<10);

}


}