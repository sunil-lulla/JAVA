import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
class MyOracleDBConnectivityDemo
{
private  static int id=0;
private  static int salary=5000;
private static String name="A";
public static void main(String[] args)
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Loaded");

Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","sam");
System.out.println("Connection Established");
Statement st=conn.createStatement();
System.out.println("Got the Statement");
int i=0;    			
String query;
for(;id<20;id++,name+=2,salary+=5000)
{
query="insert into Employee values("+id+",'"+name+"',"+salary+")";
  //query="insert into Employee values(1,'A',5000)";
i=st.executeUpdate(query);
System.out.println("Updated"+i);
}
conn.close();
}
catch(ClassNotFoundException e)
{
System.out.println("Class not found");
}

catch(SQLException e)
{
System.out.println(e.getMessage()+" \t"+e);

}
}
}