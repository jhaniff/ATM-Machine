package atmmachine;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {
	private int accountNumber;
	private int accountPin;
	private int cheqAccBal = 0;
	private int savAccBal = 0;

	Scanner menuInput = new Scanner(System.in);
	DecimalFormat currencyFormat = new DecimalFormat("'$'###,##0.00");

	public void setAccountNumber(int accountNumber)  {
		this.accountNumber  = accountNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.accountPin = pinNumber;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}

	public int getPinNumber() {
		return this.accountPin;
	}

	public String getChequingAccountBalance() {
		return currencyFormat.format(cheqAccBal);
	}

	public String getSavingsAccountBalance() {
		return currencyFormat.format(savAccBal);
	}

	public void savingsDepositInput() {
		int input = 0;
		System.out.println("Savings Account Balance: " + getSavingsAccountBalance());
		System.out.println("Enter Amount To Deposit: ");
		input = menuInput.nextInt();
		
		if(input < 0) {
			System.out.println("Please enter an amount that is not negative" + "\n");
			savingsDepositInput();
		}
		else {
		this.savAccBal = this.savAccBal + input;
		System.out.println("New Balance: " + getSavingsAccountBalance());
		}
	}

	public void savingsWithdrawInput() {
		int input = 0;
		System.out.println("Savings Account Balance: " + getSavingsAccountBalance());
		System.out.println("Enter Amount To Withdraw: ");
		input = menuInput.nextInt();
		
		if(input < 0) {
			System.out.println("Please enter an amount that is not negative" + "\n");
			savingsWithdrawInput();
		}
		else if(this.savAccBal - input < 0) {
			System.out.println("Balance cannot be negative" + "\n");
			savingsWithdrawInput();
		}
		else {
			this.savAccBal = this.savAccBal - input;
			System.out.println("New Balance: " + getSavingsAccountBalance());
		}
	}

	public void chequingDepositInput() {
		int input = 0;
		System.out.println("Chequing Account Balance: " + getChequingAccountBalance());
		System.out.println("Enter Amount To Deposit: ");
		input = menuInput.nextInt();
		
		if(input < 0) {
			System.out.println("Please enter an amount that is not negative" + "\n");
			chequingDepositInput();
		}
		else {
		this.cheqAccBal = this.cheqAccBal + input;
		System.out.println("New Balance: " + getChequingAccountBalance());
		}
	}

	public void chequingWithdrawInput() {
		int input = 0;
		System.out.println("Chequing Account Balance: " + getChequingAccountBalance());
		System.out.println("Enter Amount To Withdraw: ");
		input = menuInput.nextInt();
		
		if(input < 0) {
			System.out.println("Please enter an amount that is not negative" + "\n");
			chequingWithdrawInput();
		}
		else if(this.cheqAccBal - input < 0) {
			System.out.println("Balance cannot be negative" + "\n");
			chequingWithdrawInput();
		}
		else {
			this.cheqAccBal = this.cheqAccBal - input;
			System.out.println("New Balance: " + getChequingAccountBalance());
		}
	}

}
