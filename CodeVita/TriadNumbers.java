class TriadNumbers
{
public static void main(String args[])
{

	long start=System.currentTimeMillis();
int d1,d2,d3,num,num2,num3,k=0;

sam:
for(int i=100;i<334;i++)
{
	
	for(num=i;num<=i*3;num+=i)
	{
		k=num;
	d1=k%10;k/=10;
	d2=k%10;k/=10;
	d3=k%10;k/=10;
	
	if(d1==d2||d2==d3||d1==d3)
		continue sam;
		
	
	}
	for(num=i;num>0;num/=10)
	{
		d1=num%10;
		for(num2=(i+i);num2>0;num2/=10)
	{
			
			
		d2=num2%10;
		for(num3=(i+i+i);num3>0;num3/=10)
			{
			d3=num3%10;
			if(d1==d2||d2==d3||d1==d3)
				continue sam;
			
			}
		
	}	
	}
	System.out.println(i+" "+i*2+" "+i*3);
	
	

}
long end=System.currentTimeMillis();
System.out.print(end-start);
}
}