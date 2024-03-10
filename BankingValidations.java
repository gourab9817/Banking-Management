package utils;

import java.util.Date;
import java.util.HashMap;
import base.BankAccount;
import enums.AccountType;
import ExceptionHandling.CustomExceptions;

public class BankingValidations {

	public static void getvalueof(int k, HashMap<Integer, BankAccount> hash) throws Exception {
		if (hash.containsKey(k)) {
			System.out.println(hash.get(k));
		} else {
			throw new CustomExceptions("Invalid Account No. ");
		}
	}

	public static void RemoveAccount(int k, HashMap<Integer, BankAccount> hash) throws Exception {
		if (hash.containsKey(k)) {
			hash.remove(k);
			System.out.println("Account Closed Sccessfuly");
		} else {
			throw new CustomExceptions("Invalid Account No. ");
		}
	}

	public static double checkBalance(double bal) throws Exception {
		if (bal > 1000) {
			return bal;
		} else {
			throw new CustomExceptions("Balance has to be above 1000 rs");
		}
	}

	public static Date checkDate(String d1) throws Exception {
		if (BankAccount.sdf.parse(d1).compareTo(BankAccount.sdf.parse("31-03-2021")) <= 0
				&& BankAccount.sdf.parse(d1).compareTo(BankAccount.sdf.parse("01-04-2020")) >= 0) {
			return BankAccount.sdf.parse(d1);

		} else {
			throw new CustomExceptions("date Must be in the current Financial Year");
		}
	}

	public static AccountType checktype(String type) throws Exception {
		String t1 = type.toUpperCase();
		if (AccountType.valueOf(t1) == AccountType.SAVING || AccountType.valueOf(t1) == AccountType.CURRENT
				|| AccountType.valueOf(t1) == AccountType.FD || AccountType.valueOf(t1) == AccountType.LOAN) {
			return AccountType.valueOf(t1);
		} else {
			throw new CustomExceptions("Select type from saving, current , FD or loan  ");
		}
	}

	public static void CalculateIntrest(double period, double principle, double Intrate) {
		double Intrest = period * principle * Intrate / 100;
		System.out.println("Intrest over " + period + "years of time will be " + Intrest);
	}

	public static void transfer(int sender, int reciever, double amount, HashMap<Integer, BankAccount> hash)
			throws Exception {
		if (hash.get(sender).getBalance() > amount) {
			System.out.println(hash.get(sender).withdraw(amount));
			System.out.println(hash.get(reciever).Deposit(amount));
		} else {
			throw new CustomExceptions("Insufficient funds in senders account");
		}
	}
}
