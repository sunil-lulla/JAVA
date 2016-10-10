import java.io.BufferedReader;
import java.io.IOException;
import java.lang.*;
import java.io.InputStreamReader;
class Person
{
private String name;
private int age;
public void accept() throws IOException
{
BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
name=bf.readLine();
age=Integer.parseInt(bf.readLine(),10);
}
public void check()
{
System.out.print(name+"\n"+age);
}
}
class PersonTest extends Object
{
public static void main(String[] args) throws IOException
{
Person a=  new Person();
a.accept();
a.check();
}

}