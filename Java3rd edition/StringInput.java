import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class StringInput
{
public static void main(String args[]) throws IOException
{
BufferedReader kb = new BufferedReader(new InputStreamReader(System.in),1);
String sam= kb.readLine();
System.err.print(sam);




}

}