import java.util.Random;
class RandomID
{
private int empID;
private String name;
private int age;
private static int nextID;
static
{
Random random= new Random();
nextID=random.nextInt(1000);
System.out.format("%5s|%-10s|%5s\n","id","    Name","age");
}

{
empID=0;
name=null;
age=0;
}
public RandomID(String name,int age)
{
this.empID=nextID++;
this.name=name;
this.age=age;
}
public void getDetails()
{
System.out.format("%5d|%-10s|%5d\n",this.empID,this.name,this.age);
}
public void getNextID()
{
System.out.println(nextID);
}
}