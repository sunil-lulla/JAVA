import java.util.InputMismatchException;
import java.util.Scanner;


public class CyclicPalindrome {

	public static void main(String[] args) 
	{
			
		
		Scanner sin = new Scanner(System.in);
		int T=0;
		try
		{
		 T=sin.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid Input");
			System.exit(1);
		}
		if(T>100||T<=0)
		{
		System.out.println("Invalid Input");
		System.exit(1);
		}
		
		
		sin.nextLine();
		mainfor:
		for(int i=0;i<T;i++)
		{
		
			
			
			
			String S=sin.nextLine();
			char[] a=S.toCharArray();
			for(int k=0;k<a.length;k++)
			{
				if(a[k]<=96||a[k]>=123)
				{
					System.out.println("Invalid Input");
					continue mainfor;	
				}
			}
			
			
			
		
			
			String reverse=new StringBuffer(S).reverse().toString();
			String ch;
			String ch2;
			if(S.equals(reverse)||S.length()==1)
			{
				
				System.out.print("0");
				continue mainfor;
			}
			
			
			for(int u=1;u<a.length;u++)
			{
			
			ch=S.substring(S.length()-1);
			ch2=S.substring(0,S.length()-1);
			 S=ch+ch2;
			 reverse=new StringBuffer(S).reverse().toString();
			if(reverse.equals(S))
			{
				
				System.out.println(u);
				continue mainfor;
			}
			else
				System.out.println("-1");
				continue mainfor;
			
			}

	}

	}}
