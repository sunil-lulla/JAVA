import java.sql.Types;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
class StoredProcedures
{
public static void main(String[] args)
{

try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
CallableStatement cs=conn.prepareCall("{call add_nos(?,?,?)}");
cs.setString(1,"sam");
cs.setInt(2,4);
cs.registerOutParameter(3,Types.INTEGER);
cs.execute();
System.out.print(cs.getInt(3));
}
catch(ClassNotFoundException e)
{
e.printStackTrace();
}
catch(SQLException e)
{
e.printStackTrace();

}



}
}