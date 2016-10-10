import java.io.*;
class LoanAmount
{
public static void main(String[] args) throws IOException
{
BufferedReader bf = new  BufferedReader(new InputStreamReader(System.in));
System.out.format("enter loan amount");
int loanAmount=Integer.parseInt(bf.readLine(),10);
System.out.format("enter annual interest rate");
int annualInterestRate=Integer.parseInt(bf.readLine(),10);
System.out.format("enter number of years");
int numberOfYears=Integer.parseInt(bf.readLine(),10);
int monthlyInterestRate=annualInterestRate/1200;
int monthlyPayment=(loanAmount*monthlyInterestRate)/1-(1/(int)Math.pow(1+monthlyInterestRate,numberOfYears*12));
int totalPayment=monthlyPayment*numberOfYears*12;

System.out.print(totalPayment+" "+monthlyPayment);











}
}