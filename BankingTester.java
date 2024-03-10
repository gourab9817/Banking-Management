package tester;

import base.BankAccount;
import utils.BankingValidations;

import java.util.HashMap;
import java.util.Scanner;

//import ExceptionHandling.CustomExceptions;
import static utils.BankingValidations.*;

public class BankingTester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			HashMap<Integer, BankAccount> hash = new HashMap<>();
			boolean exit = false;
			while (!exit) {
				System.out.println(
						"Welcome\n1.Create new account\n2.Display  details of all accounts\n3.Get acct summary\n"
								+ "4.Close account\n5.Transfer Funds\n6.Apply interest on all saving type of a/cs.\n7.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// Create new account
						System.out.println("Enter Details\n1)AccountNo 2)Name 3)AccType 4)CreationDate 5)balance");
						int Account = sc.nextInt();
						BankAccount BA = new BankAccount(Account, sc.next(), checktype(sc.next()),
								BankingValidations.checkDate(sc.next()), checkBalance(sc.nextDouble()));
						hash.put(Account, BA);

						break;
					case 2:// Display details of all accounts
						System.out.println(hash);
						break;
					case 3:// Get acct summary
						System.out.println("Enter your  Account no.");
						getvalueof(sc.nextInt(), hash);
						break;
					case 4:// Close account
						System.out.println("Enter your  Account no.");
						RemoveAccount(sc.nextInt(), hash);
						break;
					case 5:// Transfer Funds
						System.out.println(
								"Enter Senders Account No., Recievers Account No. and Amount to be Transferd ");
						transfer(sc.nextInt(), sc.nextInt(), sc.nextDouble(), hash);

						break;
					case 6:// Apply interest on all saving type of a/cs.
						System.out.println("choose period in years ,  prinipcle amount of loan and interest rate ");
						CalculateIntrest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
						break;
					case 7://
						System.out.println("Thankyou!!");
						exit = true;
						break;

					default:
						System.out.println();
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				sc.nextLine();
			}
		}
	}

}
//1.  Create new account
//Input : account details
//
//2.  Display  details of all accounts
//
//3. Get acct summary ---
//Input  : acct number
//o/p --- error via custom exception if account doesn't exist OR  account details
//
//4.Close account
//Input  : acct number
//o/p --- error via custom exception if account doesn't exist OR  account details
//
//5. Transfer Funds
//Inputs : src acct no, dest acct no , transfer amount
//
//6.Apply interest on all saving type of a/cs.
//Inputs : period in years & interest rate
//
//7. Exit