import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
class DB2DB2
{
public static void main(String[] args)
{

try
{
Class.forName("com.ibm.db2.jcc.DB2Driver");
System.out.print("Connected");
Connection conn=DriverManager.getConnection("jdbc:db2://localhost:50000/SAMPLE","Sam","windows7");
System.out.print("Connected");


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