import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CompilerDesign {

	
	public static void main(String[] args) throws IOException 
	{
			BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
			byte T=0;
			System.out.println("enter no of test cases");
			try {
				T=Byte.parseByte(bufferedReader.readLine());
				if(T>100)
				{
					throw new NumberFormatException();
				}
			} 
			catch (NumberFormatException | IOException e) {
				
				System.out.println("Invalid Input");
			}	
			String L;
			for(int i=0;i<T;i++)
			{
				System.out.println("enter your program");
			 L=bufferedReader.readLine();			
			
			 char a[]=L.toCharArray();
			
			
			 
			
			if(L.charAt(0)!='{')
			{
				System.out.print("Compilation Error");
				Runtime.getRuntime().exit(0);
			}
			int curli=-1;
			int main=-1;
			int k1=-1;
			for(int k=0;k<a.length;k++)
			{
				switch(a[k])
				{
				
				case '{':
					curli=curli+2;
					break;
				
				case '}':	
					curli--;
					break;
				
				case '<':
					main=main+2;
					k1=k;
					break;
					
				case '>':
				{
					main--;
					if(k1>k||k1==-1)
					{
					System.out.print("invalid");	
					}
					break;
				
				}	
				}	
				
				
				
				
				
				
			}
			if(curli==0||main==0)
				System.out.print("sam");
			
			
			
			
			
			
			}
			
			
			
	}

}
