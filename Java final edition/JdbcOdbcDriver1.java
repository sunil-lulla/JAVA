import sun.jdbc.odbc.*;
import java.sql.*;
class JdbcOdbcDriver1
{
public static void main(String[] args)
{
try{
Class c=Class.forName("sun.jdbc.odbc.JdbcOdbc");
System.out.print("connect");
JdbcOdbc jo=(JdbcOdbc)c.newInstance();





}
catch(Exception e)
{
System.out.print(e);
}
}
}