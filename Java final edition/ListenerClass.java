import javax.servlet.*;
import java.sql.*;
public class DatabaseClass implements ServletContextListener
{

private Connection conn=null;
public void contextInitialized(ServletContextEvent e) 
{

ServletContext sc=e.getServletContext();

try
{
Class.forName(sc.getInitParameter("dClass"));
System.out.print("loaded");
conn=DriverManager.getConnection(sc.getInitParameter("connstring"),sc.getInitParameter("uname"),sc.getInitParameter("password"));
System.out.print("Connection obtained");
sc.setAttribute("conn",conn);
}

catch(SQLException e1)
{
System.out.print(e1);
}


catch(ClassNotFoundException e1)
{
System.out.print(e1);

}


}




public void contextDestroyed(ServletContextEvent e)
{
try
{
conn.close();
}
catch(SQLException e1)
{
System.out.print(e1);

}
}











}