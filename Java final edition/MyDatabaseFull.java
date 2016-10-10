import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.ResultSet;
class MyDatabaseFull
{
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","sam");
Statement st= conn.createStatement();
int avg=0;
ResultSet rs=st.executeQuery("select * from Employee");
int count=0;
while(rs.next())
{
System.out.println(rs.getInt(1)+"\t"+rs.getString("name")+"\t"+rs.getInt(3));
avg+=rs.getInt(3);
count++;
}
System.out.println("The avg salary of employes is"+(float)avg/count);

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