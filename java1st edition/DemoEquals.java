class DemoEquals
{
public strictfp static void main(String\u005b\u005d args)
{
String s1="sam";
String s2=new String("sam");
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println("Yo yO HoNeY".equalsIgnoreCase("yO Yo hOnEy"));
System.out.println(s1);
}


}