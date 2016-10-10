import java.util.Scanner;
class ECP31E3
{
public static void main(String args[])
{
/*
*solution_____1
*@author sam insomniac
*
*
*/

System.out.println("enter any 2 numbers");
Scanner sin = new Scanner(System.in);
int $num1=sin.nextInt();
int num2=sin.nextInt();
 $num1=$num1+num2;
 num2=$num1-num2;
 $num1=$num1-num2;
System.out.println($num1+"  "+num2);

/*
*solution_____2
*@author sam insomniac
*using 3 variables
*
*/
System.out.println("enter any 2 numbers for 2nd solution" +" using 3rd variable");
$num1=sin.nextInt();
num2=sin.nextInt();
int temp;
temp=$num1;
$num1=num2;
num2=temp;
System.out.println($num1+"  "+num2);

/*
*solution_____3
*@author sam insomniac
*using  bitwise Ex-or operator
*
*/

System.out.println("enter any 2 numbers for 3rd solution using biywise X-Or operator");
$num1=sin.nextInt();
num2=sin.nextInt();
$num1=$num1^num2;
num2=$num1^num2;
$num1=$num1^num2;
System.out.println($num1+"  "+num2);


/*
*solution_____4
*@author sam insomniac
*using  smart programming
*
*/
System.out.println("enter any 2 numbers for 4rd solution using smart programming");
$num1=sin.nextInt();
num2=sin.nextInt();
System.out.println(num2+"  "+$num1);

/*
*solution_____5 
*@author sam insomniac
*using  divide and multiply
*
*/
System.out.println("enter any 2 numbers for 5rd solution using divide and multiply ");
$num1=sin.nextInt();
num2=sin.nextInt();
 temp=$num1*num2;
$num1=temp/$num1;
num2=temp/num2;
System.out.println($num1+"  "+num2);


}


}

