package in.co.capgemini;
import java.util.ArrayList;
import java.util.List;

public class SavingAccountTest {
	
	public static void main(String args[]) {
		
		SavingAccount savingaccount1 = new SavingAccount(3000000, 1990, "Ford", true);
		SavingAccount savingaccount2 = new SavingAccount(3000000, 1204, "Benz", false);
		SavingAccount savingaccount3 = new SavingAccount(3000000, 2018, "Chrevolet", true);
		SavingAccount savingaccount4 = new SavingAccount(3000000, 1996, "Aston", true);
		SavingAccount savingaccount5 = new SavingAccount(3000000, 4523, "Kia", false);
		
		//Creating list of Saving Account members
		List<SavingAccount> savingacc = new ArrayList<SavingAccount>();
		savingacc.add(savingaccount1);
		savingacc.add(savingaccount2);
		savingacc.add(savingaccount3);
		savingacc.add(savingaccount4);
		savingacc.add(savingaccount5);
		
		// Printing the values
		for (SavingAccount savingaccount : savingacc) {
			System.out.println(savingaccount);
		}
		
		System.out.println("");
		System.out.println("######################################################################################");
		savingaccount1.deposit(20500);
		savingaccount2.deposit(20141);
		savingaccount3.deposit(1230);
		savingaccount4.deposit(456);
		savingaccount5.deposit(186);
		
		// Printing the values using lambda expression
		savingacc.stream().forEach(System.out::println);
		
		System.out.println("######################################################################################");
		
		savingaccount1.withdraw(5666);
		savingaccount2.withdraw(3666);
		savingaccount3.withdraw(266);
		savingaccount4.withdraw(166);
		savingaccount5.withdraw(126);
		
		// Printing the values using lambda expression
		savingacc.stream().forEach(System.out::println);
		

	}
}
