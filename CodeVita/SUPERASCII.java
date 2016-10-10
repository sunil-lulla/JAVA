import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class SUPERASCII { 
	public static void main(String args[]){
		try{
		PrintStream so = System.out;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		if(T < 1 || T > 100)
			System.exit(0);
		int counter = 0;
		testcase:
		while(counter < T){
			counter ++; int i = 0;
			String S = br.readLine();
			int[] SInt = new int[S.length()];
			if(S.length() < 1 || S.length() > 300)
				break;
			for(i = 0; i < S.length(); i++){
				int temp = (int) S.charAt(i)-96;
				if (temp < 1 || temp > 26)
					continue testcase;
				SInt[i] = temp;
			}
			/*for (int part: SInt){
				so.print(part + " ");
			}*/
			Map<Integer, Integer> occur = new HashMap<>();
			if(SInt.length > 1){
			for (i =0; i < SInt.length -1; i ++){
				int localCount = 1;
				if(SInt [i]!= 0){
				for (int j = i +1; j < SInt.length; j ++){
				if (SInt[i] == SInt[j]){
					localCount ++;
					SInt[j]=0;
				}
				}
				occur.put(SInt [i], localCount);
				}
			}
			if(SInt[SInt.length -1] !=0){
				occur.put(SInt[SInt.length -1], 1);
			}
		}
			else
				occur.put(SInt[0], 1);
			int key, value, cost =0;
			int del = 0, add=0;
			for (Map.Entry<Integer, Integer> entry : occur.entrySet()){
				key = entry.getKey();
				//so.println("key= " + key);
				value = entry.getValue();
			//so.println("value= " + value);
				if (key > value)
					add += key - value;
				else if (value > key)
					del += value - key;
			}
			if (del < add && del != 0)
			cost = 2*(add-del) + del;
			else if(del < add && del ==0)
				cost = 2* add;
			else
				cost = 3*del - 2*add;
			so.println(cost);
			//so.println(del);
			//so.println(add);
		}}catch(Exception e)
		{
			
		}
	}
}
