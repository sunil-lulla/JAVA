
import java.io.*;
import java.util.ArrayList;
public class LastFibonacciStanding {

	public static void main(String[] args) {
		PrintStream so = System.out;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 0;
		try {
			T = Integer.parseInt(br.readLine());
		} catch (Exception e) {
			System.exit(0);
		}
		if (T > 10 || T < 1){
			System.exit(0);
		}	
		int a,b,L,x,y;
		for(int i = 0; i < T; i ++){
			try {
				String line2 = br.readLine();
				String[] arrLine2 = line2.split(" ");
				if(arrLine2.length != 3)
					throw new Exception(); 
				 a = Integer.parseInt(arrLine2[0]);
				if (a < 1 || a > 1000)
					throw new Exception();
				 b = Integer.parseInt(arrLine2[1]);
				if(b < a || b > 1000)
					throw new Exception();
				 L = Integer.parseInt(arrLine2[2]);
				if(L < 1 || L > 10000)
					throw new Exception();
				 x = 1; y = 1;
				ArrayList<Integer> fibo = new ArrayList<Integer>();
				fibo.add(1);
				fibo.add(1);
				while (fibo.size() < b){
					
					fibo.add(x + y);
					int temp = x + y;
					x = y;
					y = temp;
					
				}
				for(int z =0; z< a; z++){
					fibo.remove(z);
				}
				while (fibo.size() > 1)
				for (int k = a - 1; k < fibo.size(); k++){
					fibo.remove(L -1);
				}
				for (int parts : fibo)
				so.println(parts);
				
			} catch (Exception e) {
				continue;
			}
			
			
		}
	}

}
