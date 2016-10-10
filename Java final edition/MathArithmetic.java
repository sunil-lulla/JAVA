class MathArithmetic
{
public static void main(String[] args)
{
int n1=Integer.parseInt(args[0]);
int n2=Integer.parseInt(args[2]); 
switch(args[1])
{
case "+":
	System.out.println("The sum of "+n1+" and "+n2+" is "+(n1+n2));
	break;

case "-":
	System.out.println("The subtraction of "+n1+" and "+n2+" is "+(n1-n2));
	break;

case "*":
	System.out.println("The subtraction of "+n1+" and "+n2+" is "+(n1*n2));
	break;



case "/":
	System.out.println("The division of "+n1+" and "+n2+" is "+(n1/n2));
	break;


case "%":
	System.out.println("The division of "+n1+" and "+n2+" is "+(n1%n2));
	break;

default:
	System.out.println("Invalid Operator");

}

}
}