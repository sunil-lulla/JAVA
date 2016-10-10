import java.util.Scanner;
class SuperChecker
{
public static void main(String[] args)
{
Scanner in= new Scanner(System.in);
int T=in.nextInt();
if(T<=0&&T>100)
return;

String text; 
int[] arr;
boolean isInvalid=false;
for(int i=1;i<=T;i++)
{
text=in.next();
arr=new int[26];
isInvalid=false;

for(int j=0;j<text.length();j++)
arr[text.charAt(j)-97]++;



for(int j=0;j<26;j++)
if(arr[j]!=j+1&&arr[j]!=0)
{
isInvalid=true;
System.out.println("No");
break;
}
if(isInvalid==false)
System.out.println("Yes");
}
}
}