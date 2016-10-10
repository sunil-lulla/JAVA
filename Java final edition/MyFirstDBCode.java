import java.sql.DriverManager;
import java.sql.SQLException;
class MyFirstDBCode
{
public static void main(String args[])
{
try
{
//Class.forName("oracle.jdbc.driver.OracleDriver");
//DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
System.out.print("driver loaded successfully");
DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE","system","sam");
System.out.print("connection obtained successfully");
}

catch(SQLException e)
{
System.out.print(e);
}


}
}