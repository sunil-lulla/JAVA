import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
public class Brokerage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintStream pw=System.out;
		double costprice=0;
		int quantity=0;
		double sellingprice=0;
		double brokerage=0;
		BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
		try {
			
			pw.println("enter brokerage");
			brokerage=(Double.parseDouble(bufferedReader.readLine()));
			pw.println("enter cost price of shares");
			costprice=(Double.parseDouble(bufferedReader.readLine()));
						pw.println("enter selling price of shares");
			sellingprice=(Double.parseDouble(bufferedReader.readLine()));
			pw.println("enter quantity of shares");
			quantity=(Integer.parseInt(bufferedReader.readLine()));
		} 
		catch (NumberFormatException | IOException e) 
		{
			
			System.err.print("Invalid Input");
			System.exit(0);
		}
		
		
		double brokeragechargecp=brokerage*(costprice*quantity)/100f;
		
		double servicetax=10.36*brokeragechargecp/100f;	
		
		double brokeragechargesp=brokerage*(sellingprice*quantity)/100f;
				double totalamountonbuy=servicetax+brokeragechargecp;
		
	//-----------------------service tax--------
		
		double stt=0.025*(sellingprice*quantity)/100f;
		
		double totalamountonsell=servicetax+brokeragechargesp+stt;
			
		//---
		double totalamounttopay=totalamountonbuy+totalamountonsell;
		
		double totalturnover=0.006*(costprice*quantity+sellingprice*quantity)/100f;
		
		totalamounttopay=totalturnover+totalamounttopay;
		double value;
		if(costprice>sellingprice)
		{
			
			value=((costprice*quantity-sellingprice*quantity)-totalamounttopay);
			
		
		}
		else
		{
			
			value=((sellingprice*quantity-costprice*quantity)-totalamounttopay);
			
		}
		
		if(value>0)
		{
			
			pw.printf("Profit \n%.2f",value);
		}
	
		else if(value==0)
		{
			pw.print("no profit no loss");
			
		}
		else
			System.out.printf("Loss\n%.2f", value*-1);
	
	
	}
		
				
		
		
}
	
