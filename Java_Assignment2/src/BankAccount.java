
public class BankAccount 
{
	public static void main(String[] args) {
		int a1,a2,TotalCash;
		BankAccount b1=new SavingsAccount();
		BankAccount b2= new CurrentAccount();
		a1=((SavingsAccount) b1).cash();
		a2=((CurrentAccount) b2).cash();
		TotalCash=a1+a2;
		System.out.println("Total cash in the bank is Rs."+TotalCash);
	}

}
class SavingsAccount extends BankAccount
{
	int cash()
	{
		int FixedDeposit=300000;
		return FixedDeposit;
		
	}
}
class CurrentAccount extends BankAccount
{
	int cash()
	{
		int CashCredit=200000;
		return CashCredit;
	}
}
