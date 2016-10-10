public class Ab 
{
public static void main(String[] args) 
{
int x = 5;
Ab p = new Ab();
p.doStuff(x);
System.out.print(" main x = " + x); 
}
void doStuff(int x) 
{
System.out.print(" doStuff x = " + x++);
System.out.print(" dostufff x = " + x); 
}
}