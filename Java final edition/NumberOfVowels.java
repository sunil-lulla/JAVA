import java.util.Scanner;
class NumberOfVowels
{
public static void main(String[] args)
{
Scanner sin= new Scanner(System.in);
String str=sin.nextLine();
int count =0;
for(int i=0;i<str.length();i++)
{
switch(str.charAt(i))
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
	count++;

}

}


System.out.print(count);

}
}