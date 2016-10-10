import java.sql.*;
class GetInfo
{
public static void main(String[] args)
{

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
CallableStatement cst=conn.prepareCall("{?=call getInfo(?,?,?)}"); 
cst.registerOutParameter(1,Types.INTEGER);
cst.setInt(2,2);
cst.registerOutParameter(3,Types.VARCHAR);
cst.registerOutParameter(4,Types.INTEGER);
cst.execute();
if(cst.getInt(1)==1)
System.out.print(cst.getString(3)+"\t"+cst.getInt(4));
else
System.out.print("Not found");
}
catch(Exception e)
{
System.out.print(e);
}
}
}