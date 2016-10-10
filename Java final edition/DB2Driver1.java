import java.sql.*;
import com.ibm.db2.jcc.*;
class DB2Driver1
{
public static void main(String[] args)
{
try
{
Class.forName("com.ibm.db2.jcc.DB2Driver");
System.out.print("Connect");
DriverManager.registerDriver(new DB2Driver());
System.out.print("Connect");

DB2Driver db2= new DB2Driver();
System.out.print("Connect");

}
catch(ClassNotFoundException e)
{
System.out.print(e);
}
catch(SQLException e)
{
System.out.print(e);
}



}
}