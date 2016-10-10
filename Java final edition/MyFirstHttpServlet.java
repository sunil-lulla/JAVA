import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class MyFirstHttpServlet extends HttpServlet
{

public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
resp.setContentType("text/html");
PrintWriter pw= resp.getWriter();
pw.println("<h1> This is m y first Http based servlet</h1>");
pw.close();
}
}