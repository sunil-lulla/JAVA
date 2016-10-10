import java.io.*;
class Lottery
{
public static void main(String[] args) throws IOException
{
int guess=0;
int num=0;
int k=0,c=0;
int j=0;
BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
//num=(int)(Math.random()*999);
num=38;
System.out.println(num);
System.out.println("Enter the guess");
guess=Integer.parseInt(buf.readLine(),10);
if(guess==num)
{
System.out.println("10000$");
System.exit(1);
}
else
{
while(num>0)
{
j=guess;
k=num%10;
while(j>0)
{
if(k==j%10)
c++;
j/=10;
}
num/=10;
}
System.out.println(c);


}

if(c==1||c==2)
System.out.println("1000$");
else if(c>=3)
System.out.println("5000$");
else
System.out.println("0000$");




}







}