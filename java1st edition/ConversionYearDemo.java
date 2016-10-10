import java.util.Scanner;
class ConversionYearDemo
{
public static void main(String args[])
{
System.out.println("enter any number");
Scanner sin=new Scanner(System.in);
int num=sin.nextInt();
if(num<365)
{
if(num>=30)
{
int month=num/30;
num=num%30;
System.out.println(month+"months");
System.out.println(num+"days");
}
else
{

System.out.println(num+"days");

}
}
else
{
int year=num/365;
num=num%365;
int month=num/30;
num=num%30;
System.out.println(year+"years");
System.out.println(month+"months");
System.out.println(num+"days");

}


}



}