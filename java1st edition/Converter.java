import java.util.Scanner; 
class Converter
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
int num=sin.nextInt();
int month=30;
int year=365,days=7;
year=num/year;
num=num%year;
month=num/month;
num=num%month;
days=num;
System.out.println("it si\n"+year+"years\n"+" "+month+" months\n"+" "+days+"days");

}


}