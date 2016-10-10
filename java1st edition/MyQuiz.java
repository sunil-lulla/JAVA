import java.util.Scanner;
import java.util.Formatter;
strictfp class MyQuiz
{
  
public strictfp static void main(String\u005b\u005d args)
{

int score=0;
Formatter fout=new Formatter();
fout.format("welcom to my quiz"); 
System.out.println(fout);

Scanner sin=new Scanner(System.in);
fout.format("want to play quiz yes=1 or no=2"); 
System.out.println(fout);
int a=sin.nextInt();
switch(a)
{
case 1:
{
System.out.println("who is the javas developer");
System.out.println("1. sun microsystem");
System.out.println("2. microsoft");
a=sin.nextInt();

if(a==1)
++score;
else
--score;

System.out.println("java is a");
System.out.println("1. island");
System.out.println("2. car");
a=sin.nextInt();

if(a==1)
++score;
else
--score;
System.out.println("gary cornel is  ");
System.out.println("1. writer and developer");
System.out.println("2. student");
a=sin.nextInt();

if(a==1)
++score;
else
--score;
System.out.println("which command is valid");
System.out.println("1. strictfp");
System.out.println("2. strict fp");
a=sin.nextInt();

if(a==1)
++score;
else
--score;

System.out.println("dell");
System.out.println("1. 14R");
System.out.println("2. 15R");
a=sin.nextInt();

if(a==1)
++score;
else
--score;

break;
}


default:
fout.format("wrong choice");


}
System.out.println("your score is:"+score);
}
}