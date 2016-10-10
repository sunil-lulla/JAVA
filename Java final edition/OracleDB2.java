import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
class OracleDB2
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("driver Loaded in memeory");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//Sam-PC:1521/xe","system","sam");
//DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","sam");
//DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521/xe","system","sam");
System.out.println("Connection obtained");

}
catch(ClassNotFoundException e)
{
System.out.println(e);

}
catch(SQLException e)
{
System.out.println(e);

}



}
}