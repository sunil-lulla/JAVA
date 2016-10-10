import java.sql.*;
class MetaData
{
public static void  main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
DatabaseMetaData dmd=conn.getMetaData();
System.out.println(dmd.getDriverName());
System.out.println(dmd.getDriverVersion());
System.out.println(dmd.getMaxColumnNameLength());

}
catch(Exception e)
{
System.out.print(e);
}
}
}