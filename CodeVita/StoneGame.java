import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;


public class StoneGame {

	
	public static void main(String[] args) 
	{
	
		PrintStream so= System.out;
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		short T=0;//test cases
		
		try {
			T=Short.parseShort(bufferedReader.readLine());	
		} 
		catch (NumberFormatException e) 
		{
				System.exit(0);
			
		}
		catch(IOException e)
		{
			System.exit(1);	
		}
	
		if(T>10||T<1)
		{
			System.exit(1);
			
		}
		for (short i =0; i < T; i++){
			Boolean alice = true;
			short N=0;//stones
			
				try {
					N=Short.parseShort(bufferedReader.readLine());
				} catch (NumberFormatException e) {
					continue;
				} catch (IOException e) {
					continue;
				}
				
				if(N>10000||N<1)
					continue;
			
			
	while(N>0){
		if(N % 4==1 && alice == true){
			so.println("No");
			break;
		}
		else if(N % 4 == 1 && alice == false){
			so.println("Yes");
			break;
		}
		else if(N % 4 == 2){
			N -= 1;
		}
		else if(N % 4 == 3){
			N -= 2;
		}
		else if(N % 4 == 0)
			N -=3;
		if (alice == true)
			alice = false;
			else
				alice = true;
	}
		
		
		}
	}

}
