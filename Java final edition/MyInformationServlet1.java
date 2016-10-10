import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
public class MyInformationServlet1 extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{
doPost(req,resp);
}
public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServletException
{


PrintWriter pw=resp.getWriter();
resp.setContentType("text/html");
pw.print("<table align='center' bgcolor='crimson'>");


pw.println("<tr>");
pw.println("<th> PC-Name");
pw.println("</th>");
pw.println("<td>");
pw.println(req.getRemoteHost());
pw.println("</td>");
pw.println("</tr>");



pw.println("<tr>");
pw.println("<th> Ip Address");
pw.println("</th>");
pw.println("<td>");
pw.println(req.getRemoteAddr());
pw.println("</td>");
pw.println("</tr>");

pw.println("<tr>");
pw.println("<th> protocol");
pw.println("</th>");
pw.println("<td>");
pw.println(req.getProtocol());
pw.println("</td>");
pw.println("</tr>");



pw.println("<tr>");
pw.println("<th> Content length");
pw.println("</th>");
pw.println("<td>");
pw.println(req.getContentLength());
pw.println("</td>");
pw.println("</tr>");


pw.println("<tr>");
pw.println("<th> Server Name");
pw.println("</th>");
pw.println("<td>");
pw.println(req.getServerName());
pw.println("</td>");
pw.println("</tr>");



pw.println("<tr>");
pw.println("<th> Server Port");
pw.println("</th>");
pw.println("<td>");
pw.println(req.getServerPort());
pw.println("</td>");
pw.println("</tr>");

pw.println("</table>");


BufferedReader buf= req.getReader();
pw.println(buf.readLine());
pw.close();




}










}