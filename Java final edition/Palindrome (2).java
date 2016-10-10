class Palindrome
{
public static void main(String[] args)
{

String s1="saas";
for(int i=0,j=s1.length()-1;i!=j;i++,j--)
{
if(s1.charAt(i)!=s1.charAt(j))
{
System.out.print("no");
}
}
System.out.print("Yes");


}
}