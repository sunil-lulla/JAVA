class Employee
{

// a& b are instance variables
 private int k=9;
int b;
public void display()
{

System.out.print(k+b);

}
}
public class UseEmploye
{
public static void main(String[] args)
{
//a is an reference variable constructor is used to initialize garbage values
Employee a= new Employee();
a.display();
//System.out.print("\n"+a.hashCode());

}
}