

class BigIntDemo3
{
public static void main(String args[])
{
Scanner sin=new Scanner(System.in);
//d=a+b/c%10
System.out.println("enter value for a:");
BigInteger a = BigInteger.valueOf(sin.nextInt());
System.out.println("enter value for b:");
BigInteger b = BigInteger.valueOf(sin.nextInt());
System.out.println("enter value for c:");
BigInteger c = BigInteger.valueOf(sin.nextInt());

BigInteger d = (a.add(b)).multiply(c).mod(BigInteger.valueOf(10));
System.out.println("sum :"+d);
System.out.println("compare to"+a.compareTo(c));
}

}