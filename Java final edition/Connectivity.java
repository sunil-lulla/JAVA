import java.sql.*;
class Connectivity
{

public static void main(String args[])
{

}


public static void main(String arg)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe");
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