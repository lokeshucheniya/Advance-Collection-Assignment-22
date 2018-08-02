package in.co.capgemini;

public class SavingAccount implements Comparable<SavingAccount>{
	private double acc_balance;
	private int acc_id;
	private String accountHolderName;
	private boolean isSalaryAccount;
	
	public SavingAccount(double acc_balance, int acc_id, String accountHolderName, boolean isSalaryAccount) {
		super();
		this.acc_balance = acc_balance;
		this.acc_id = acc_id;
		this.accountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}
	
	public double getAcc_balance() {
		return acc_balance;
	}
	public void setAcc_balance(double acc_balance) {
		this.acc_balance = acc_balance;
	}
	public int getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	
	
	public void withdraw(double withdraw) {
		
		if(isSalaryAccount == true) {
			if(withdraw < acc_balance ) {
				this.acc_balance -= withdraw;
			}
			//else {
			//	System.out.println("insufficient balance");
			//}
		}
		
		
	}
	
	
	public void deposit(double deposit) {
		
		this.acc_balance += deposit;
	
	}

	@Override
	public String toString() {
		return "SavingAccount [acc_balance=" + getAcc_balance() + ", acc_id=" + getAcc_id() + ", accountHolderName="
				+ getAccountHolderName()  + "]";
	}

	@Override
	public int compareTo(SavingAccount sa) {
		
		return acc_id-sa.getAcc_id();
	}
	
	
}
