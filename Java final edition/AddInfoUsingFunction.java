import java.sql.*;
class AddInfoUsingFunction
{
public static void main(String[] args)
{

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
CallableStatement cst=conn.prepareCall("{?=call myFunction(?,?)}"); 
cst.setInt(2,2);
cst.setString(3,"Sam");
cst.registerOutParameter(1,Types.INTEGER);
cst.execute();
if(cst.getInt(1)==1)
System.out.print("update");
else
System.out.print("not update");
}

catch(Exception e)
{
System.out.print(e);
}
}
}