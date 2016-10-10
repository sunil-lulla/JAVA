import java.sql.*;
class PreparedStatementDemo
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
PreparedStatement ps=conn.prepareStatement("insert into Employee values(?,?,?)");
ps.setInt(1,1);
ps.setString(2,"Sam");
ps.setInt(3,1000);
int a=ps.executeUpdate();
System.out.print(a+" records inserted");



}
catch(ClassNotFoundException e)
{


}

catch(SQLException e)
{


}


}
}