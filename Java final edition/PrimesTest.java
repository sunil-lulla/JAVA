import java.io.*;
class PrimesTest
{
public static void main(String[] args) throws IOException
{
BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
System.out.format("how many primes");
int totalPrimes=Integer.parseInt(a.readLine(),10);
Primes.generate(totalPrimes);
}
}