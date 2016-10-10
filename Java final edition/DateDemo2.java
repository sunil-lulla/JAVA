class DateDemo2
{
public static void main(String[] args)
{

java.util.Date a= new java.util.Date(-99998989800l);
java.util.Date b= new java.util.Date();
if(a.after(b))
System.out.print("true");
if(b.after(a))
System.out.print("true");
System.out.println(a);
System.out.println(b);
System.out.print(a.getDay()+"\t");
System.out.print(a.getMonth()+"\t");
System.out.print(a.getYear());

}

}