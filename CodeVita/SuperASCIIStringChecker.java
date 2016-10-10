import java.util.ArrayList;
import java.util.Scanner;
public class SuperASCIIStringChecker {
	public static Scanner s = new Scanner(System.in);
	public static void main(String args[]){
		try{
			System.out.println("Enter the number of strings to be checked");
			String stringT = s.next();
			int T = Integer.parseInt(stringT);
			if (T > 100){
				System.out.println("Invalid Input");
				System.exit(0);
			}
			ArrayList<String> inputs = new ArrayList<String>();
			System.out.println("Enter the Strings");
			for (int i = 0; i < T; i++){
				inputs.add(s.next());
			}
			for (String parts: inputs){
				ArrayList<Integer> intParts = new ArrayList<Integer>();
				int invalidFlag = 0;
				for (int i = 0; i < parts.length(); i++){
					char c = parts.charAt(i);
					int temp = (int)c-96;
					if(temp > 0 && temp < 27 || !(intParts.size() >= 500))
						intParts.add(temp);
					else{
						invalidFlag = 1;
						break;
					}	
				}
				if (invalidFlag !=0){
					System.out.println("Invalid Input");
					break;
				}
				else{
					int compared = 0;
					int superS = 1;
					ArrayList<Integer> tally = new ArrayList<Integer>();
					for (int i = 0; i < intParts.size() - 1; i++){
						int counter = 0;
						int unique = 1;
						for(int k: tally){
							//System.out.println("Tally " + k);
						}
						for (int j: tally){
							//System.out.println("i " + i + "j " + j);
							if (intParts.get(i) == j){
								compared = 1;
								break;
							}
						}
						
						if (compared == 1)
							break;
						else{
							for (int j = i; j < intParts.size(); j++)
								if(intParts.get(i) == intParts.get(j)){
									counter ++;
									//System.out.print(counter);
								}
								
						}
						System.out.println( "\n" + intParts.get(i) + "\n");
						if (counter != intParts.get(i) && compared == 0){
							System.out.println("No");
							
							superS = 0;
							break;
						}
						for (int check: tally){
							if (check == intParts.get(i))
								unique = 0;
						}
						if (unique == 1)
							tally.add(intParts.get(i));
					}
					if (superS == 1)
						System.out.println("Yes");
				}
			}
		
		}catch(Exception e){
			System.out.println("Invalid Input");
		}
	}
}
