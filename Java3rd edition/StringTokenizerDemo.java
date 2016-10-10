import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
class StringTokenizerDemo
{
public static void main(String args[]) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
StringTokenizer sT = new StringTokenizer(str);

System.out.println(sT.nextToken(","));
System.out.println(sT.nextToken());
System.out.println(sT.nextToken());
System.out.println(sT.hasMoreTokens());
System.out.println(sT.countTokens());



}

}
