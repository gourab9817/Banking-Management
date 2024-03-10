# Banking-Management
# Banking System Java - OOPs Project

## Problem Statement

Implement a simple banking system using Java with Object-Oriented Programming principles. Create a `BankAccount` class to store account details such as account number (`acctNo`), customer name, account type (enum: SAVING, CURRENT, FD, LOAN), creation date (`Date`), and balance. The project should include suitable constructors, toString method, and business logic methods for withdrawals, deposits, fund transfers, and interest application.

### BankAccount Class

The `BankAccount` class should include the following attributes:
- `acctNo` (int)
- Customer name
- Account type (enum: SAVING, CURRENT, FD, LOAN)
- Creation date (Date)
- Balance

**Unique ID:** `acctNo`

### Business Logic Methods

Implement the following business logic methods within the `BankAccount` class:
1. Withdraw funds
2. Deposit funds
3. Transfer funds
4. Apply interest (using the Simple Interest formula: period * principle * rate / 100)

### Validation Rules

1. Balance should always be greater than 1000 in any transaction or while opening an account; otherwise, throw a custom exception.
2. Account type must be valid.
3. Account creation date must be in the current financial year.

### Data Structure

Store bank account details in a suitable data structure that ensures constant time performance for adding, retrieving, or searching data.

### Options

Provide the following options in the system:
1. Create a new account (Input: account details)
2. Display details of all accounts
3. Get account summary (Input: acct number, Output: account details or error via custom exception)
4. Close account (Input: acct number, Output: account details or error via custom exception)
5. Transfer funds (Inputs: src acct no, dest acct no, transfer amount)
6. Apply interest on all saving-type accounts
7. Exit

## Files Added

1. **BankAccount.java:** Contains private variables, a parameterized constructor, getters, setters, and toString methods.
2. **AccountType.java:** Enum containing types of bank accounts.
3. **CustomExceptions.java:** Centralized exception handling.
4. **BankingValidations.java:** Rules to perform CRUD operations, implemented as methods.
5. **BankingTester.java:** Main class with the `main` method to execute and test the banking system.

Feel free to explore the project files for a detailed understanding of the implementation.

### How to Run

1. Compile all Java files.
2. Run the `BankingTester` class.
3. Follow the on-screen instructions to interact with the banking system.

Enjoy exploring the simple yet effective banking system implemented in Java!
