import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
public class RegistrationServlet extends HttpServlet
{
private Connection con=null;
private PreparedStatement ps=null;
public void init() throws ServletException
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("loaded");
con=DriverManager.getConnection("jdbc:oracle:thin:@//Sam-pc:1521/xe","system","sam");
ps=con.prepareStatement("insert into login values(?,?)");
System.out.println("init run");
}
catch(ClassNotFoundException e)
{
System.out.println("class not found"+e.getMessage());
}
catch(SQLException e)
{
System.out.println("sql"+e.getMessage());
}
}

public void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{

PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
pw.println("<html><body>");
try{
int name=Integer.parseInt(req.getParameter("nameTB"));
String pass=req.getParameter("passTB");
ps.setInt(1,name);
ps.setString(2,pass);
int c=ps.executeUpdate();
if(c!=0)
{
pw.println("<h1>successfully registered<h1>");
pw.println("<a href='login.html'>go to login </a>");
}
else
pw.println("<h1><a href='Registration.html'>try again</a></h1>");
}
catch(SQLException e)
{
System.out.print("sql me prob");
throw new ServletException(e.getMessage()+"sql me prob");
}
catch(NumberFormatException e)
{
pw.print("<h1>please enter valid data</h1>");
}
pw.println("</head></html>");
}
public void  destroy()
{
try{
con.close();
}
catch(SQLException e)
{

}
} 

}