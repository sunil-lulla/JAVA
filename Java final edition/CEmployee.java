class CEmployee
{
private String name=null;
private static  int id=0;
private final int empid;
CEmployee()
{
empid=++id;
}
public void setData(String name)
{
this.name=name;
}
public String getName()
{
return name;
}
public int  getID()
{
return empid;
}







}