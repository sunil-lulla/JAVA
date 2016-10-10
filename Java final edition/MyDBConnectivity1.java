import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
class MyDBConnectivity1
{
public static void main(String[] args)
{

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.print("loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@Sam-PC:1521/XE","system","sam");
System.out.println("Connection obtained");
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