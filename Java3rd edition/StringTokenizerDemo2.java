import java.util.StringTokenizer;
import java.io.*;
class StringTokenizerDemo2
{
public static void main(String args[]) throws IOException
{


BufferedReader bf = new BufferedReader( new InputStreamReader(System.in));
String str = bf.readLine();
StringTokenizer st =  new StringTokenizer(str,",",true);
System.out.println(st.nextToken());
System.out.println(st.nextToken());
System.out.println(st.nextToken());
System.out.println(st.hasMoreTokens());
System.out.println(st.countTokens());
System.out.println(st.nextToken());
System.out.println(st.countTokens());
}

}