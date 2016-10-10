class CompareToDemo
{
public static void main (String[] args)
{

String a=new String("san");
String b=new String("sam");
int ch=a.compareTo(b);
System.out.print(ch);
System.out.print(ch==0 ? "equals" : (ch>0) ? "a is big" : "b is big");


}
}