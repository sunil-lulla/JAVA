import java.util.Scanner;
import java.util.StringTokenizer;


public class ValidSegments {

		
	public static void main(String[] args) 
	{
		Scanner sin = new Scanner(System.in);
		String text;
		text=sin.nextLine();
		StringTokenizer stringTokenizer= new StringTokenizer(sin.nextLine());
		int words=0;
		int lowerBound=0;
		int upperBound=0;
		try{
		words=Integer.parseInt(stringTokenizer.nextToken());
		lowerBound=Integer.parseInt(stringTokenizer.nextToken());
		upperBound=Integer.parseInt(stringTokenizer.nextToken());
		}
		catch(Exception e)
		{
			
			System.out.println("Invalid Input");
			System.exit(0);
		}
		String newString[]=text.split(" ");
		
		if(newString.length>30000)
		{
			System.out.print("Invalid Input");
			System.exit(1);
		
		}
		
		if(words>newString.length||lowerBound>newString.length||upperBound>newString.length)
		{
			System.out.print("Invalid Input");
			System.exit(1);
			
		}
		
			String wordsDef[]=new String[words];
			for(int j=0;j<words;j++)
			{
			
				wordsDef[j]=sin.nextLine();
				
				
			}
		
			
			
			int l=0,n=0;int segment=0;
			mainfor:
			for(int i=0;i<newString.length;i++)
			{
				l=0;
				n=0;
				for(int j=0;j<wordsDef.length;j++)
				{
					if(wordsDef[j].equalsIgnoreCase(newString[i]))
					{
						
						l++;
						n=i;
						break;	
					}
				
				
				}
				if(l==0)
				{
					continue mainfor;
				}
				
				
				
				
				
				
				for(int k=n+1;k<newString.length;k++)
				{
					
					for(int u=0;u<wordsDef.length;u++)
					{
						if(wordsDef[u].equalsIgnoreCase(newString[k]))
						{
							
							n++;
							break;
							
						}
						else
						{
							
							n++;
							
						}
						
					}
					
					i=n;
					
					
				}
				
				
				
				
				
			}
			
			System.out.print(segment);
			
			
			}
	
}
				
				
				
				
				
				
				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			