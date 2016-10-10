import java.util.*;
class ChefAndChain
{
public static void main(String[] args)
{
int testCase=0;
String testString=null;
int counter=0;
char testChar;
char testChar2;
Scanner sin= new Scanner(System.in);
testCase=sin.nextInt();
StringBuffer currentString=null;
ArrayList<String> al= new ArrayList<>();
ArrayList<Integer> al2= new ArrayList<>();


for(int j=0;j<testCase;j++)
{
testString=sin.next();
if(testString.length()>100000)
continue;
currentString= new StringBuffer(testString);
counter=0;
for(int i=0;i<currentString.length()-1;i++)
{
testChar=currentString.charAt(i);
testChar2=currentString.charAt(i+1);
if(testChar=='+')
{
if(testChar2=='+')
{
currentString.setCharAt(i,'-');
counter++;
}
}

else if(testChar=='-')
{
if(testChar2=='-')
{
currentString.setCharAt(i,'+');
counter++;
}
}
}
if(counter!=0)
System.out.println(counter);
}





}
}
