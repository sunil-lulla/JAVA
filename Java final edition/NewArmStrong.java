class NewArmStrong
{
public static void main(String[] args)
{
short a,temp;
for(int i=1;i<1000;i++)
{
a=(short)i;
temp=0;
while(a>0)
{	
	temp=(short)(temp+(a%10)*(a%10)*(a%10));
	a/=10;	
}
if(i==temp)
System.out.print("\n"+temp);

}
}
}