import java.util.*;
class Worker
{
//sam
private String name;
private double sal;
private Date hireDay;
public Worker(String n,double s,int year,int month,int day)
{
name=n;
sal=s;
GregorianCalendar gc= new GregorianCalendar(year,month-1,day);
hireDay=gc.getTime();
}

public String getName()
{
return name;
}
public double getSalary()
{
return sal;
}
public Date getHireDay()
{
return hireDay;
}
public void raisesalary(double byPercent)
{
sal=((100+byPercent)/100*sal);
}
}