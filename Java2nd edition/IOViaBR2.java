import java.io.*;
class IOViaBR2
{
public static void main(String args[]) throws Exception
{


BufferedReader bufferReader =new BufferedReader(new InputStreamReader(System.in));
char c=(char)bufferReader.read();
System.out.println(c);
int a=bufferReader.read();
System.out.println((char)a);
int b=Integer.parseInt(bufferReader.readLine());
System.out.println(b+c);
//bufferReader.readLine();
//String s=bufferReader.readLine();
//System.out.println(s);
}




}