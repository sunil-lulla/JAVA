import java.sql.*;
class Connectivity2
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
CallableStatement cst=conn.prepareCall("{call sum(?,?,?)}");
cst.setInt(1,23);
cst.setInt(2,24);
cst.registerOutParameter(3,Types.INTEGER);
cst.execute();
System.out.print(cst.getInt(3));
}
catch(Exception e)
{
System.out.print(e);

}



}
}