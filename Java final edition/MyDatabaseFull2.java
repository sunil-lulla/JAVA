import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
class MyDatabaseFull2
{
public static void main(String[] args)
{
try
{
Class.forName("com.ibm.db2.jcc.DB2Driver");
Connection conn=DriverManager.getConnection("jdbc:db2://127.0.0.1:50000/SAMPLE","Sam","windows7");
Statement st= conn.createStatement();
ResultSet rs=st.executeQuery("select * from Employee2");
while(rs.next())
System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
}
catch(SQLException e)
{
System.out.println(e);
}
catch(ClassNotFoundException e)
{
System.out.println(e);
}




}
}