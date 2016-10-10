import java.io.*;
class Employee
{
public static void main(String args[]) throws Exception
{
	/**

	employeee

	*/
	/*

	*/

	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter id");
	int id=Integer.parseInt(x.readLine());
	System.out.println("\nenter sex");
	char sex=(char)x.read();
	x.readLine();
	System.out.println("enter name");
	String name=x.readLine(); 
	System.out.println("\nid:"+id+"\nsex:"+sex+"\nname:"+name);
	//System.out.println("\n\\n");
}

}