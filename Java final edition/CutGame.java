import java.util.*;
class CutGame
{
public static void main(String[] args)
{
System.out.println("Enter Scissor(0) Rock(1) Paper(2)");
String msg="The Computer is ";
Scanner  sin= new Scanner(System.in);
int ch=(int)(Math.random()*2);
int input=sin.nextInt();
String usrmsg="You Lose";
if(ch==input)
usrmsg="Its a draw";
else if(ch<input&&input-2!=ch)
{
usrmsg="You won";
}
for(int i=1;i<=2;i++){
switch(ch)
{
case 0:
	System.out.print(msg+"scissor. ");
	break;
case 1:
	System.out.print(msg+"rock. ");
	break;

case 2:
	System.out.print(msg+"paper. ");
	break;

}
ch=input;
msg="You are ";
}
System.out.print(usrmsg);


}
}