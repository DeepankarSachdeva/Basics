package first;
/* Multi Level Inheritance
 *  Account  --- > SavingsBank ---> AccountDetails
 */
public class AccountDetails extends SavingsBank //child class of sacingsbank
{
    int withdrawl,deposit,finalbalance;
	public AccountDetails(int accNo, String nam, int mb, int b,int w ,int dep)
	{
		super(accNo, nam, mb, b);
		this.withdrawl=w;
		this.deposit=dep;
	}

	void display()
    {
            super.display();
            System.out.println ("Deposit: "+deposit);
            System.out.println ("Withdrawals: "+withdrawl);
            finalbalance=(balance +deposit) - withdrawl ;
            System.out.println("final balance"+ finalbalance);
    }
}
