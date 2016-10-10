import java.io.*;
public class SpecialArray {
	public static void main(String[] args){
		PrintStream so = System.out;
		PrintStream se = System.err;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 0;
		try {
			T = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e1) {
			//se.println("Invalid Input");
			System.exit(0);
		}
		if (T > 10 || T < 1){
			//se.println("Invalid Input");
			System.exit(0);
		}		
		for (int i = 1; i <= T; i++){
			try{
				int N = Integer.parseInt(br.readLine());
					if (N > 10000 || N < 1)
						throw new Exception();
				String A = br.readLine();
				String Ai[] = A.split(" ");
				int[] intAi = new int[Ai.length];
				for (int j = 0; j < N; j++){
					intAi[j] = Integer.parseInt(Ai[j]);
				}
				int steps = 0;
				for(int j = 0; j < intAi.length; j++){
					int newSteps = 0;
					for (int k = 0; k < intAi.length; k++){
						if (intAi[j] < intAi[k]){
							int temp = intAi[k] - intAi[j];
							newSteps += temp;
							//so.println(temp);
						}
						else {
							int temp = intAi[j]-intAi[k];
							newSteps += temp;
							//so.println(temp);
						}
					}
					//so.println(newSteps);
					if (newSteps < steps || steps ==0){
						steps = newSteps;
					}
						
				}
				so.print(steps % 1000007);
			}catch(Exception e)
			{
				continue;
			}
		}
	}

}
