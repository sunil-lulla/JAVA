import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LCM {

	
	public static void main(String[] args) throws IOException
	{
	
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(bufferedReader.readLine());
		int b=Integer.parseInt(bufferedReader.readLine());
		
		for(int i=a>b?a:b;i<=a*b;i++)
		{
			
			if(i%a==0&&i%b==0)
			{
				System.out.print(i);
				break;
			}
			
			
		}
		int hcf=1;
		for(int i=2;i<=a;i++)
	
		{
			
			if(a%i==0&&b%i==0)
				hcf=i;
			
			
		}
		
		System.out.print(hcf);
		
		
		
	}

}
