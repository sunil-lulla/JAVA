import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class BreakChecker {
	public static void main(String[] args) throws IOException
	{	
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the text");
		String L=bufferedReader.readLine();
		if(L.length()>10000)
		{
			System.out.print("Invalid Input");
			
		}
		short N =0;
		try {
			System.out.print("Enter the number of words");
		
		N=Short.parseShort(bufferedReader.readLine());
		if(N>1000||N<1)
		{
		throw new  NumberFormatException();
		}
		}
		catch(NumberFormatException e)
		{
			System.out.print("Invalid Input");
			System.exit(1);
		}
		
		String[] W= new String[N];
		int i;
		for( i=0;i<N;i++)
		{
			W[i]=bufferedReader.readLine();
			
		}
		
		 i=0;
		
		String token;
		StringTokenizer stringTokenizer=new StringTokenizer(L);
		while(stringTokenizer.hasMoreTokens())
		{
			if(stringTokenizer.nextToken().equals(W[0]))
			{
				
				while(stringTokenizer.hasMoreTokens())
				{
					token=stringTokenizer.nextToken();
					if(!W[0].equals(token))
					{
					System.out.print(token+" ");
					}
				}
				break;
			}
				
				
		}
		
		
		
		
		
		
		
		
		}

}
