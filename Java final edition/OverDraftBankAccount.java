class OverDraftBankAccount extends BankAccount
{
private  double limit;
public OverDraftBankAccount(String name,int acctid,double bal,double limit)
{
super(name,acctid,bal);
this.limit=limit;
}


public double getLimit()
{
return this.limit;
}
public void withdraw(double bal)
{
if(getBal()+limit>bal)
{
super.withdraw(bal-limit);
}
else
System.out.println("Invalid Balance");
}












}