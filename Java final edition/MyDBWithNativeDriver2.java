import oracle.jdbc.driver.OracleDriver;
import java.sql.*;
class MyDBWithNativeDriver2
{
public static void main(String[] args) throws SQLException
{
DriverManager.registerDriver(new OracleDriver());
System.out.println("registered and loaded successfully");
}
}