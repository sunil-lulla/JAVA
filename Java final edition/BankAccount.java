class BankAccount
{
private String name;
private int acctid;
private double bal;
public BankAccount(String name,int acctid,double bal)
{
this.name=name;
this.acctid=acctid;
this.bal=bal;
}

public String getName()
{
return this.name;
}

public int getAcctid()
{
return this.acctid;
}


public double getBal()
{
return this.bal;
}


public void deposit(double bal)
{
if(bal>0)
this.bal+=bal;
else
System.out.println("Invalid Balance");
}


public void withdraw(double bal)
{
System.out.println("In main bank "+bal);
if(this.bal>bal)
this.bal-=bal;
else
System.out.println("Invalid Balance");
}




}