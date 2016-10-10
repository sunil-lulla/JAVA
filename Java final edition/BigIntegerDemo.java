import java.util.*;
import java.math.BigInteger;
class BigIntegerDemo
{
public static void main(String []args)
{
Scanner  sin= new Scanner(System.in);
BigInteger a=BigInteger.valueOf(sin.nextInt());
System.out.print(a.add(BigInteger.valueOf(23).multiply(BigInteger.valueOf(2))));


}
}