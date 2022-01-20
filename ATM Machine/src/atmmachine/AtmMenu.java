package atmmachine;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class AtmMenu extends Accounts {
	Scanner menuInput = new Scanner(System.in);
	HashMap<Integer, Integer> accountData = new HashMap<Integer, Integer>();
	int selection  = 0;
	
	public void retrieveLogin() throws IOException {
		boolean bool = true;
		
		do {
			try {
				
				accountData.put(345666785, 8675);
				accountData.put(484883829, 2683);
				
				System.out.println("Welcome to the ATM Machine!");
				System.out.println("Enter Your Account Number: ");
				setAccountNumber(menuInput.nextInt());
				
				System.out.println("Enter Your Pin Number: ");
				setPinNumber(menuInput.nextInt());
			}
			catch (Exception  e) {
				System.out.println("\n" +  "Invalid character(s), please enter numbers only."  + "\n");
				bool = false;
			}
			
			for(Entry<Integer, Integer> entry : accountData.entrySet()) {
				if(entry.getKey() == getAccountNumber() && entry.getValue() == getPinNumber()) {
					getAccountType();
				}
			}
			System.out.println("\n" + "Wrong Account Number or Pin Number" + "\n");
		} 
		while(bool == true);
	}
	
	
	public void getAccountType() {
		System.out.println("\n" + "Select the account type you want to access: ");
		System.out.println("1. Chequing Account");
		System.out.println("2. Savings Account");
		System.out.println("3. Exit");
		System.out.println("Please enter the number corresponding to your choice: ");
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getChequing();
			break;
		
		case 2:
			getSavings();
			break;
			
		case 3:
			System.out.println("Thank you, have a nice day!");
			break;
			
		default:
			System.out.println("\n" + "Invalid option chosen" + "\n");
			getAccountType();
		}
	}
	
	
	
	public void getSavings() {
		System.out.println("Savings Account: ");
		System.out.println("1. View Balance");
		System.out.println("2. Deposit Funds");
		System.out.println("3. Withdraw Funds");
		System.out.println("4. Exit");
		System.out.println("Please enter the number corresponding to your choice: ");
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Savings Account Balance: " + getSavingsAccountBalance());
			getAccountType();
			break;
			
		case 2:
			savingsDepositInput();
			getAccountType();
			break;
		
		case 3:
			savingsWithdrawInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you, have a nice day!");
			break;
			
		default:
			System.out.println("\n" + "Invalid option chosen" + "\n");
			getAccountType();
		}
	}
	
	public void getChequing() {
		System.out.println("Chequing Account: ");
		System.out.println("1. View Balance");
		System.out.println("2. Deposit Funds");
		System.out.println("3. Withdraw Funds");
		System.out.println("4. Exit");
		System.out.println("Please enter the number corresponding to your choice: ");
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Chequing Account Balance: " + getChequingAccountBalance());
			getAccountType();
			break;
			
		case 2:
			chequingDepositInput();
			getAccountType();
			break;
		
		case 3:
			chequingWithdrawInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thank you, have a nice day!");
			break;
			
		default:
			System.out.println("\n" + "Invalid option chosen" + "\n");
			getAccountType();
		}
	}
	
}
