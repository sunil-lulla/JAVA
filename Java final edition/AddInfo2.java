import java.sql.*;
class AddInfo2
{
public static void main(String[] args)
{

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
CallableStatement cst=conn.prepareCall("{call addDetails(?,?,?)}"); 
cst.setString(1,"A");
cst.setInt(2,2);
cst.setInt(3,23000);
cst.execute();
}
catch(Exception e)
{
System.out.print(e);

}



}
}