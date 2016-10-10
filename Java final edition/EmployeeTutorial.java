class EmployeeTutorial
{
private String name;
private int age;
private int empId;
private static int tempId=1;

public EmployeeTutorial(String name,int age)
{
this.name=name;
this.age=age;
this.empId=tempId++;
}

public String getName()
{
return this.name;
}

public int getAge()
{
return this.age;


}

public int getEmpId()
{
return this.empId;
}








}