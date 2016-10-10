import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;

public class EMPDBDESIGN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> employee = new ArrayList<>();
		PrintStream so = System.out;
			for (;;){
				try{
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String input= br.readLine();
					if (input == "-1")
						System.exit(0);
					String[] inputArray = input.split(" ");
					if (!inputArray[0].equals("A")  && !inputArray[0].equals("Q")){
						so.println("Exception 1");
						throw new Exception();
					}
					else if(inputArray[0].equals("A")){
						//so.println ("A Found");
						if(inputArray.length != 3)
							throw new Exception();
						else if (inputArray[1].length() < 1 || inputArray[1].length()> 50)
							throw new Exception();
						else if (Integer.parseInt(inputArray[2]) < 20 || Integer.parseInt(inputArray[2]) > 100)
							throw new Exception();
						else if(Integer.parseInt(inputArray[1]) <0)
							throw new Exception();
						else {
								employee.add(inputArray[1]);
								employee.add(inputArray[2]);
						}
					}
					else if (inputArray[0].equals("Q")){
						//so.println ("Q Found");
						if(Integer.parseInt(inputArray[1]) == 1 || Integer.parseInt(inputArray[1]) == 2){
							if (inputArray.length != 3)
								throw new Exception();
							else if(inputArray[2].length() < 1 || inputArray[2].length()> 50)
								throw new Exception();
							else if(Integer.parseInt(inputArray[2]) <0)
								throw new Exception();
							else if (Integer.parseInt(inputArray[1]) == 1){
								so.println("1 Found");
								if (employee.size()< 2){
									so.println("False");
									throw new Exception();
								}
									else{
										int size = inputArray[2].length();
										int temp =Integer.parseInt(inputArray[2]);
										so.println(size);
									for (int i = 0; i < employee.size(); i +=2){
										int temp1 =Integer.parseInt(employee.get(i));
										so.print(employee.get(i).length());
										if (size < employee.get(i).length()){
											//so.print((10 * (employee.get(i).length() - size)));
											temp1 = temp1 / (10 ^ (employee.get(i).length() - size));
										//so.println(temp + " " + temp1);
											}
										else if (temp == temp1){
											so.println("True");
											throw new Exception();
										}
									}
									so.println("False");
									throw new Exception();
								}
							}
							else if (Integer.parseInt(inputArray[1]) == 2){
								if (employee.size()< 2){
									so.println("0");
									throw new Exception();
								}
									else{
										int match = 0;
										int size = inputArray[2].length();
										int temp =Integer.parseInt(inputArray[2]);
									for (int i = 0; i < employee.size(); i +=2){
										int temp1 =Integer.parseInt(employee.get(i));
										if (size < employee.get(i).length())
											temp1 = temp1 / (10 * (employee.get(i).length() - size)) ;
										else if (temp == temp1){
											match++;
										}
									}
									so.println(match);
									throw new Exception();
								}
							}
						}
						else if(Integer.parseInt(inputArray[1]) == 3){
							if (inputArray.length != 5)
								throw new Exception();
							else if(inputArray[2].length() < 1 || inputArray[2].length()> 50)
								throw new Exception();
							else if(Integer.parseInt(inputArray[2]) <0)
								throw new Exception();
							else if (Integer.parseInt(inputArray[3]) % 10 != 0 || Integer.parseInt(inputArray[4]) % 10 != 0)
								throw new Exception();
							else if (Integer.parseInt(inputArray[3]) < Integer.parseInt(inputArray[4])){
								if (Integer.parseInt(inputArray[3]) < 1 || Integer.parseInt(inputArray[4]) > 100)
									throw new Exception();
							}
							else if (Integer.parseInt(inputArray[3]) > Integer.parseInt(inputArray[4])){
								throw new Exception();
							}
							else{
								if (employee.size()< 2){
									so.println("0");
									throw new Exception();
								}
									else{
										int match = 0;
										int size = inputArray[2].length();
										int temp =Integer.parseInt(inputArray[2]);
									for (int i = 0; i < employee.size(); i +=2){
										int temp1 =Integer.parseInt(employee.get(i));
										if (size < employee.get(i).length())
											temp1 = temp1 / (10 ^ (employee.get(i).length() - size)) ;
										else if (temp == temp1){
											if((Integer.parseInt(inputArray[3]) < Integer.parseInt(employee.get(i + 1))) && (Integer.parseInt(inputArray[4]) > Integer.parseInt(employee.get(i + 1)))){
												match++;
											}
										}
									}
									so.println(match);
									throw new Exception();
								}
							}
						}
					}
			
		}catch(Exception e){
			continue;
		}
	}
		}

}
