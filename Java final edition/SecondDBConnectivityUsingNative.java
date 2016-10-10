import java.sql.*;
class SecondDBConnectivityUsingNative
{
public static void main(String[] args)
{
try{
DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
System.out.print("done2");
}
catch(Exception e)
{
System.out.print(e);

}
}
}