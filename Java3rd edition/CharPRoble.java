import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class CharProblem

{
public static void main(String args[]) throws IOException

{

BufferedReader br= new BufferedReader(new InputStreamReader(System.in),8192);
int a= Integer.parseInt(br.readLine());
char ch= (char)br.read();
//char ch = br.readLine().charAt(0);
//br.readLine();
br.skip(-1);
int c=Integer.parseInt(br.readLine());


System.err.print(a+" "+ch+" "+c); 









}

}