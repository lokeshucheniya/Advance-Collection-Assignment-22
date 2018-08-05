package in.co.capgemini;


import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SavingAccountTest2 {
	public static void main(String args[]) {
		
		SavingAccount savingaccount1 = new SavingAccount(300000, 990, "For", true);
		SavingAccount savingaccount2 = new SavingAccount(30000, 204, "Ben", false);
		SavingAccount savingaccount3 = new SavingAccount(200000, 18, "Chrevo", true);
		SavingAccount savingaccount4 = new SavingAccount(500000, 996, "Ast", true);
		SavingAccount savingaccount5 = new SavingAccount(60000, 523, "Ki", false);
		
		//Creating Set for Saving Account Members
		Set<SavingAccount> savingacc = new TreeSet<SavingAccount>();
		savingacc.add(savingaccount1);
		savingacc.add(savingaccount2);
		savingacc.add(savingaccount3);
		savingacc.add(savingaccount4);
		savingacc.add(savingaccount5);
		
		// Printing the values using lambda expression
		savingacc.stream().forEach(System.out::println);
		
	

	}

}
