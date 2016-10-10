import java.util.Scanner;
class ECP126B1
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
int Rtod=10000;
int Wtod=1000;

float a=0.01f,b=0.005f,c=0.00001f,d=0.01f;
System.out.println("Enter no of days");
int days=sin.nextInt();
for(int i=1;i<1001;i++)
{

Rtod=(int)Math.round((1+a)*Rtod-c*Rtod*Wtod);
Wtod=(int)Math.round((1-b)*Wtod+c*d*Rtod*Wtod);
if(i%25==0)
System.out.println("at"+i+"day"+"\nrabbits are"+Rtod+"\nwolfs are:"+Wtod);

}

}

}