import java.util.Scanner;
import java.io.PrintStream;
class ECP77E1
{
public static void main(String args[]) throws Exception
{

/*
*
*
*
*@author Sam insomniac
*
*
*
*/

PrintStream p=System.out;
p.println("this is a semiconductor manufacture company which sells\n"+String.format("%c  8-bit microprocessors\n%<c 16-bit microprocessors \n%<c 32-bit microprocessors",16) );
Scanner sin=new Scanner(System.in);
p.println("enter type of customer\ni for industry\n g for government\n u for university");
char ch=(char)System.in.read();
p.println("enter which type of microprocessor u want");
int type_of_mp=sin.nextInt();
p.println("enter your amount of your order");
int amount_order=sin.nextInt();
double discount=0;
if(type_of_mp==32)
{
if(amount_order<=50000)
{
if(ch=='i')
discount=5;
else if(ch=='g')
discount=6.5;
else
discount=10;
}
else if(amount_order>50000&&amount_order>100000)
{
if(ch=='i')
discount=7.5;
else if(ch=='g')
discount=8.5;
else
discount=10;
}
else
{
discount=10;
}
}
/*
*
*
* 2nd if for 16 bit
*
*/

if(type_of_mp==16)
{
if(amount_order<=10000)
{
}
if(amount_order>=10000)
{
if(ch=='g')
{

discount=6;


}
else
{

discount=5;

}



}



}
/*
*
*
* 3rd if for 8 bit
*
*/
if(type_of_mp==8)
discount=10;

p.println("u have got a discount of"+discount+"%");
p.println("you have to pay"+(amount_order*((100-discount)/100)));










p.close();


}


}