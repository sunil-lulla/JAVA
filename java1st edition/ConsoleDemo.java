import java.io.Console;
class ConsoleDemo
{
public static void main(String args[])
{
Console s=System.console();
String s1=s.readLine("User name:");

char[] passwd=s.readPassword("Password");

System.out.printf("%"+passwd);
}


}