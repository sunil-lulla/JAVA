import java.util.*;
class PalindromeChecker
{
public int palindrome(int num)
{
int sum=0;
while(num>0)
{
sum=sum*10+num%10;
num/=10;
}
System.out.print(sum);
return sum;
}
public boolean isPalindrome(int num)
{
if(palindrome(num)==num)
return true;
return false;
}
public static void main(String[] args)
{
PalindromeChecker s= new PalindromeChecker();
Scanner sin= new Scanner(System.in);
int num=sin.nextInt();
if(s.isPalindrome(num))
System.out.print("is palindrome");
else
System.out.print("is not palindrome");
}
}