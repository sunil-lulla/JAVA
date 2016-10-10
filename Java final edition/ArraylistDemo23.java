import java.util.ArrayList;
import java.util.Iterator;
class ArraylistDemo23
{
public static void main(String[] args)
{

ArrayList<String> a= new ArrayList<String>();
a.add("A");
a.add("B");
a.add("A");
a.add("B");
a.add("A");
a.add("B");
a.add("A");
a.add("B");
a.add("A");
a.add("B");
a.add("A");
a.add("B");
a.add("A");
a.add("B");
for(String k:a)
System.out.println(k);
System.out.println("  ------------------------------------------------------------------------------------------------------------");
System.out.println("  -----------------------------------------using Iterator interface-------------------------------------------");
System.out.println("  ------------------------------------------------------------------------------------------------------------");

Iterator it=a.iterator();
while(it.hasNext())
{
String s=(String)it.next();
System.out.println(s);
}
}
}