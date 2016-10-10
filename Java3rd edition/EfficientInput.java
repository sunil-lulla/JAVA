import java.util.StringTokenizer;
import java.io.*;
class EfficientInput
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String str=br.readLine();
StringTokenizer st = new StringTokenizer(str);
String s1=st.nextToken();
String s2= st.nextToken();
s1=s1.trim();
s2=s2.trim();
int a= Integer.parseInt(s1);
int b= Integer.parseInt(s2);
System.out.println(a+b);






}
}