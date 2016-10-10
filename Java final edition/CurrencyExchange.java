import java.util.Scanner;
class CurrencyExchange
{
String getConvertedValue(float amount,float rs,int type )
{
if(type==0)
return amount*rs+"rs";
if(type==1)
return amount/rs+"$";
return null;
}
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
System.out.println("Enter the exchange rate from dollars to Indian rs:");
float a=sin.nextFloat();
System.out.println("Enter 0 to convert dollars to Indian rs and 1 vice versa:");
int type=sin.nextInt();
System.out.println("Enter amount:");
float amount =sin.nextFloat();
System.out.println(new CurrencyExchange().getConvertedValue(amount,a,type));




}
}