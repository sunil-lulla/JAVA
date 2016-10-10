import java.io.BufferedReader;
import java.io.InputStreamReader;
strictfp class IOViaBR
{

public strictfp static void main(String []args) throws Exception
{


BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
String ch=(String)obj.read();
System.err.println(ch);

}

}