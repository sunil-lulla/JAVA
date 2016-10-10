import java.util.GregorianCalendar;
import java.util.Date;
class Employee
{
private String name;
private int salary;
private final Date hireDay;
public Employee(String n,int sal,int year,int month,int day)
{
name=n;
salary=sal;
GregorianCalendar a = new GregorianCalendar(year,month-1,day); 
hireDay=a.getTime();
}

public String getName()
{
return name;
}
public int getSalary()
{
return salary;
}
public Date getHireDay()
{
return (Date)hireDay.clone();
}
public void raiseSalary(double byPercent)
{
salary=(int)((byPercent+100)/100*salary);
}





}