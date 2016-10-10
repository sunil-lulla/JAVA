class UseAccounts
{
public static void  main(String[] args)
{
BankAccount bc= new BankAccount("Sam",123,45000);
System.out.println(bc.getName());
System.out.println(bc.getAcctid());
System.out.println(bc.getBal());
bc.deposit(12000);
System.out.println(bc.getBal());
bc.withdraw(12000);
System.out.println(bc.getBal());
bc.withdraw(100000);
System.out.println(bc.getBal());


System.out.println("----------------------------------");
OverDraftBankAccount odba=new OverDraftBankAccount("sam",1256,12000,5000);
System.out.println(odba.getName());
System.out.println(odba.getAcctid());
System.out.println(odba.getBal());

odba.withdraw(13000);
System.out.println(odba.getBal());
System.out.println(odba.getBal());




}
}