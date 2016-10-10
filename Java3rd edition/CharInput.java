import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class CharInput
{
public static void main(String args[]) throws IOException
{
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in),01);
char ch=(char)bufferedReader.read();
System.err.print(ch);


}

}