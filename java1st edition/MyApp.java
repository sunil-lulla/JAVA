import java.awt.*;
import java.applet.Applet; 

/*
<Applet
     code="MyApp.class"
     Height=400
     Width=400>
</Applet>
*/


public class MyApp extends Applet
{


public void start()
{
s+="start";

for(int i=50;i<251;i+=i+50)

{
 int r=0;
int g=0;
int b=i;

Color c=new Color(r,g,b);
setBackground(c);
}


} 


private String s = "";
public void paint(Graphics p)
{
s+="\npaint";

Font f=new Font("Arial",1+2,20);
p.setFont(f);

p.drawString(s,50,50);

}



public void init()
{




setForeground(Color.black);


s+="init";


}



}