import java.io.*;
class Demographic
{
public static void main(String[] args) throws IOException
{
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
int sex=(char)br.read();
br.readLine();
String name=br.readLine();
System.out.print(sex+"\t---\t"+name);


}
}