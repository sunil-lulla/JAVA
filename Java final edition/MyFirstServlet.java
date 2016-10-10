import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.*;
public class MyFirstServlet extends GenericServlet
{

public void service(ServletRequest req,ServletResponse resp)
{
resp.setContentType("text/html");
try{
PrintWriter pw=resp.getWriter();
pw.println("This is my First Servlet");
pw.close();
}
catch(IOException e)
{
System.out.print(e);
}

}
}