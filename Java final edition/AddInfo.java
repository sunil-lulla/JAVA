import java.sql.*;
class AddInfo
{
public static void  main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
CallableStatement cst=conn.prepareCall("{call addInfo(?,?,?)}");
cst.setInt(1,27);
cst.setString(2,"sam");
cst.setInt(3,25000);
cst.execute();

PreparedStatement ps=conn.prepareStatement("drop table employee");
ps.executeUpdate();


}
catch(Exception e)
{
System.out.print(e);
}
}
}