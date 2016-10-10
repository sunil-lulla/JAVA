class Primes
{
public static boolean isPrime(int num)
{
int i; 
for( i=2;i<num;i++)
{
	if(num%i==0)
	break;
}
if(num==i)
return true;
return false;
}
public static void generate(int max)
{
int num=2;
int i=0;
while(i<max)
{
if(isPrime(num))
{
System.out.print(num+"\t");
++i;
}
++num;
}
}
}