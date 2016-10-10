import java.util.Date;
class EmployeeTest
{
public static void main(String[] args)
{
Employee a= new Employee("Sam",23000,1996,12,26);
System.out.print("name:"+a.getName()+"\nsal:"+a.getSalary()+"\ndate:"+a.getHireDay());
a.raiseSalary(345d);
System.out.print("\n"+a.getSalary());
}
}