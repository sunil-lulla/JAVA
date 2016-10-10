import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MathServlet extends HttpServlet
{



public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException
{
PrintWriter pw=resp.getWriter();
resp.setContentType("tex/html");
int num1=Integer.parseInt(req.getParameter("num1"));
int num2=Integer.parseInt(req.getParameter("num2"));
String operation=req.getParameter("operation");
pw.println(operation);
int c=0;
if(operation!=null)
{
pw.println("In hadi ");

switch(operation)
{
case "add":
	c=num1+num2;	
	break;
case "mul":
	c=num1*num2;
	break;
case "sub":
	c=num1-num2;
	break;
case "div":
	c=num1/num2;



}

pw.println(c);
}
}
}