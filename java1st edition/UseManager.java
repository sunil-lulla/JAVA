class Employee extends Object
{
private String name;
private double sal;
private int age;
public void setData(String name,double sal,int age)
{
this.name=name;
this.sal=sal;
this.age=age;

}
public String getName()
{
return name;


}
public double getSal()
{
return sal;


}


}
class Manager extends Employee
{
private double bonus;
public  void setBonus(double bonus)
{
this.bonus=bonus;


}
public double getIncome()
{
double amount;
amount=getSal()+bonus;
return amount;
}
}

class Ceo extends Manager
{

private double overtimesal;
public void setOverTimeSal(double ots)
{
this.overtimesal=ots;

} 
public double getOverTimeSal()
{

double sall;
sall=getIncome()+overtimesal;
return sall;
}

}

class UseManager

{
public static void main(String args[])

{

Ceo k=new Ceo();

k.setData("Sam",25000.0,21);
k.setBonus(5000.0);
k.setOverTimeSal(500);

System.out.println("Employee name is"+k.getName());
System.out.println("Employee Salary is is"+k.getIncome());
System.out.println("Employee Salary is is"+k.getOverTimeSal());

}



}

