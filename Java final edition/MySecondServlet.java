import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.*;
import java.util.Date;
public class MySecondServlet extends GenericServlet
{
public void service(ServletRequest req,ServletResponse resp)
{
resp.setContentType("text/html");
PrintWriter pw=null;
try
{
pw=resp.getWriter();
pw.print(getServletName()+"hug");
pw.close();
}
catch(Exception e)
{
System.out.print(e);
}



}
} 