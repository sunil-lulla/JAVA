import java.util.Date;
class DateNew
{
public static void main(String[] args)
{

Date b=new Date();
Date a= new Date(666666666L);
System.out.print(a.before(a.clone()));



}
}