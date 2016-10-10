import java.util.*;
class SetDemo
{
public static void main(String[] args)
{
ArrayList al= new ArrayList();
al.add("A");
al.add("B");
al.add("C");
al.add("D");
al.add("E");
al.add("F");

String a=(String)al.set(1,"K");
System.out.print(a+"\t"+al.get(1));



}
}