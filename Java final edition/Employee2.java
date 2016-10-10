//Entity class
class Employee2
{
//class field/static/shared data member
private  int empid;
private String name;
private int age;
private static int id=0;
public Employee2(String name,int age,int id )
{
this.id=id;
this.name=name;
this.age=age;
this.empid=id++;
}
public void show()
{
System.out.println("empid: "+empid);
System.out.println("name: "+name);
System.out.println("age: "+age);
}
public void showNextID()
{
System.out.println(id);
}
protected void finalize()
{
System.out.print("hey");
--id;
}


}