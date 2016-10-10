import java.awt.*;
import java.applet.*;

/*

<Applet
      code="MyAppletThird.class"
      width=180
      height=80 >
</Applet>

*/


public class MyAppletThird extends Applet
{


public void init()
{
Color c1=new Color(200,130,160);
setBackground(c1);
setForeground(Color.cyan);

}

public void paint(Graphics g)
{

java.util.Date today =new java.util.Date();
showStatus(today.toString());
g.setFont(new Font("Edwardian Script ITC",Font.ITALIC+Font.PLAIN,23));


g.drawString("Sam Insomniac "+getParameter("SAM"),10,60);

}




}