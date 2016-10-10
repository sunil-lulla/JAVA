class InterestCalculator
{
public void invalidMessage()
{
System.err.println("Invalid Input");
}
public static void main(String[] args)
{
try{
float p=Float.parseFloat(args[0]);
float r=Float.parseFloat(args[1]);
float t=Float.parseFloat(args[2]);
if(p<=0||r<=0||t<=0)
{
new InterestCalculator().invalidMessage();
System.exit(0);
}
float si=0.0f;
si=(float)(p*r*(t/100));
System.out.format("Simple Interest: %.2f\n",si);
float ci=0.0f;
ci=(float)(p*Math.pow(1+r/100,t)-p);
System.out.format("Compound Interest: %.2f\n",ci);
}
catch(Exception e)
{
System.err.println("Invalid Input");
}
}
}