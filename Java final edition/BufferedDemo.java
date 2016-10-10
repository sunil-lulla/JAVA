strictfp class  BufferedDemo
{
public static strictfp void main(String args\u005b\u005d) throws java.io.IOException
{
java.io.BufferedReader a= new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
if(a.readLine().charAt(0)==32||a.readLine().charAt(0)==13)
System.out.print("space");
}
}