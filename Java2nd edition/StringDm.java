class StringDm
{
public static void main(String []args)
{

String s2="insane";
String s4=new String("insane");
String s1="insane";
String s3=new String("insane");
System.out.println(s1.equals(s2));
System.out.println(s2.equals(s1));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s2==s1);

}

}