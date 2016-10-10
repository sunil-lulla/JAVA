import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
public class MyServlet2 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
{
PrintWriter a= resp.getWriter();
resp.setContentType("text/html"); 
a.println("<h1>Sam</h1>");
}
}
