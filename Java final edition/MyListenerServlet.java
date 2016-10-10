import javax.servlet.*;
import javax.servlet.http.*;
public class MyListenerServlet extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException
{
System.out.println("Hey there");

}
}