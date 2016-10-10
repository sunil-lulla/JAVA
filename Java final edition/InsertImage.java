import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.sql.*;
class InsertImage
{
public static void main(String[] args)
{
Connection conn=null;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","system","sam");
PreparedStatement ps=conn.prepareStatement("insert into mypics values(?,?)");
System.out.print("insert the name,id,salary,Date");
File f= new File("sam.jpg");
FileInputStream fis= new FileInputStream(f);
String name=f.getName();
System.out.print(name);
ps.setString(1,name);
ps.setBinaryStream(2,fis,(int)f.length());
ps.executeUpdate();
}
catch(ClassNotFoundException|SQLException|FileNotFoundException e)
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