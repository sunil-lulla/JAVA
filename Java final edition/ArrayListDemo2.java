import java.util.*;
class ArrayListDemo2
{
public static void main(String[] args)
{
ArrayList<String> al= new ArrayList<String>();
al.add("Bhopal");
al.add("Betul");
al.add("jabalpur");
for(String a:al)
System.out.print(a);
System.out.println(al.get(0));
System.out.println(al.size());




}
}