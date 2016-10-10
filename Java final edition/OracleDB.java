import oracle.jdbc.driver.OracleDriver;
import java.sql.*;
class OracleDB1
{
public static void main(String[] args)
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.print("Connected");
DriverManager.registerDriver(new OracleDriver());
System.out.print("Connected");

}
catch(SQLException e)
{
System.out.print(e.getMessage());
}

catch(ClassNotFoundException e)
{
System.out.print(e.getMessage());
}
OracleDriver a= new OracleDriver();
System.out.print("bang");


}
}