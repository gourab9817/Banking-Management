package base;

import enums.AccountType;
import java.util.Date;

import ExceptionHandling.CustomExceptions;

import java.text.SimpleDateFormat;

public class BankAccount {
	private int AccountNo;
	private String Name;
	private AccountType AccType;
	private Date CreationDate;
	private double balance;
	public static SimpleDateFormat sdf;

	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	public BankAccount(int accountNo, String name, AccountType accType, Date creationDate, double balance) {
		super();
		AccountNo = accountNo;
		Name = name;
		AccType = accType;
		CreationDate = creationDate;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "BankAccount [AccountNo=" + AccountNo + ", Name=" + Name + ", AccType=" + AccType + ", CreationDate="
				+ sdf.format(CreationDate) + ", balance=" + balance + "]" + "\n";
	}

	public double withdraw(double amt) throws Exception {
		this.balance = this.balance - amt;
		if (balance > 1000) {
			return balance;
		} else {
			throw new CustomExceptions("Balance cannot be below 1000");
		}
	}

	public double Deposit(double amt) {
		this.balance = this.balance + amt;
		return balance;
	}

}
//Simple Banking system.
//Create BankAccount class to store
//acctNo(int), customer name, account type (enum : SAVING,CURRENT,FD,LOAN) , creationDate(Date),balance.
//Unique ID : acctNo
//Add suitable constructor & toString.
//Add business logic methods for the following
//Withdraw funds
//Deposit funds
//Transfer Funds
//Apply interest (Use Simple interest formula = period*principle*rate /100)
//Update the account balance by the applied simple interest
