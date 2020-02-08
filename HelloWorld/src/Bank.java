
public class Bank {

	private double balance=500.00;
	public double getBalance (int acctId) {
		return balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank account= new Bank();
		double value=account.getBalance(123456);
		System.out.print("the balance is.."+value);
	}

}
