import java.util.InputMismatchException;
import java.util.Scanner;


public class CyclicPalindrome2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		
		
		
		
		
		
		
		
		
		
	}

}
