import java.io.*;
class NewClass
{
public static void main(String args[]) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int a=Integer.parseInt(br.readLine(),10);

char ch=br.readLine().charAt(0);
String d=br.readLine();
System.out.print(a+"\t----\t"+ch+"\t"+d);
}
}