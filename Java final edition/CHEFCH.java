import java.util.Scanner;
class CHEFCH
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
int testCase=sin.nextInt();
String testString=null;
StringBuffer testBuffer=null;
char ch1,ch2,ch3;
int counter=0;
for(int i=0;i<testCase;i++)
{
testString=sin.next();
testBuffer= new StringBuffer(testString);


if(testString.length()==2)
{
if(testBuffer.charAt(0)==testBuffer.charAt(1))
counter++;
}



else
{

for(int j=0;j<testBuffer.length()-2;j++)
{
ch1=testBuffer.charAt(j);
ch2=testBuffer.charAt(j+1);
ch3=testBuffer.charAt(j+2);
if(ch1==ch3)
	{
		if(ch1==ch2)
			{
				if(ch1=='+')
					ch2='-';
				else
					ch2='+';
			counter++;
			testBuffer.setCharAt(j+1,ch2);
			}
	}

else
	{
		if(ch1==ch2)
			{
				testBuffer.setCharAt(j,ch3);
				counter++;
			}
		else
			{
				testBuffer.setCharAt(j+2,ch1);
				counter++;
			}
	}
}
}

System.out.println(counter);
counter=0;
}



















}
}