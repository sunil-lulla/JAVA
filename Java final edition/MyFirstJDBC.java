import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
class MyFirstJDBC
{
public static void main(String args[])
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");	
System.out.format("Successfully initialised the class in memory");
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","System","sam");
System.out.print("connection obtained");
}
catch(ClassNotFoundException e)
{
System.out.format("failed to load the class");
}
catch(SQLException e)
{
System.out.print(e);
}

}

}