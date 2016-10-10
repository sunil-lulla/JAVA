import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class VerifyServlet extends HttpServlet
{

private Connection conn=null;


public void init() throws ServletException
{
ServletContext sc=super.getServletContext();
conn=(Connection)sc.getAttribute("conn");
}


public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException
{
try
{
PreparedStatement ps= conn.prepareStatement("select * from login where username=? and password=?");
String name=req.getParameter("userTB");
String password=req.getParameter("passwordTB");
ps.setString(1,name);
ps.setString(2,password);
ResultSet rs=ps.executeQuery();
if(rs.next())
System.out.print("hey");
else
System.out.print("no hey");
}
catch(SQLException e)
{
System.out.println(e);
}

}
}