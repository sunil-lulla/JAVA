class StringSwapping
{
public static void main(String[] args)
{

String s1="abc";
String s2="def";
s1=s1+s2;
int pos=s1.indexOf(s2);
s2=s1.substring(0,pos);
s1=s1.substring(pos);
System.out.print(s1+"\t"+s2);

}
}