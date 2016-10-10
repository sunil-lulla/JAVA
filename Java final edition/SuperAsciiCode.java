import java.io.*;
class SuperAsciiCode
{
public static void main(String[] args) throws IOException
{
BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
int T=Integer.parseInt(buf.readLine());
int[] count; 
String S;
for(int i=0;i<T;i++)
{
S=buf.readLine();
count=new int[25];
for(int j=0;j<S.length();j++)
{
char ch=S.charAt(j);
count[ch-97]++;
}
for(int k=0;k<count.length;k++)
{
System.out.println(count[k]);
}

}
}
}