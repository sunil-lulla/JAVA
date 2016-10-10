import java.io.*;
import java.sql.*;
class FetchImage
{
public static void main(String[] args)
{
Connection conn=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
Statement ps=conn.createStatement();
ResultSet rs=ps.executeQuery("select * from mypics");
String name;
while(rs.next())
{
name=rs.getString(1);
Blob b=rs.getBlob(2);
byte[] by=b.getBytes(1,(int)b.length());
FileOutputStream fos= new FileOutputStream("d:/"+name);
fos.write(by);
}
}
catch(ClassNotFoundException|SQLException|IOException e)
{
System.out.println(e);
}

finally
{
try{
conn.close();
}
catch(SQLException e)
{
System.out.println(e);
}

}


}
}