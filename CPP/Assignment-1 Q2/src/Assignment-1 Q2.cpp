/*============================================================================
 Q2. Create a C++ program for a simple banking system. You need to implement a class
 called
 1. BankAccount with the following data members:
 2. accountNumber (int): The account number of the bank account.
 3. accountHolderName (string): The name of the account holder.
 4. balance (double): The current balance in the account.

 The BankAccount class should have the following member functions:
 1. Getter and Setter Methods:
 2. deposit method: A method that allows the user to deposit money into the account. It
 should take an amount as a parameter and update the balance accordingly.
 3. withdraw method: A method that allows the user to withdraw money from the
 account. It should take an amount as a parameter and update the balance. Make sure
 to check if there is sufficient balance before allowing the withdrawal.
 4. displayAccountDetails method: A method that displays the account details (
 account number, account holder name, and balance).

 Now, create a menu-driven program in the `main` function that allows the user to perform the
 following operations:
 1. Deposit money into an existing account.
 2. Withdraw money from an existing account.
 3. Display the account details.
 4. Exit the program.
 ============================================================================*/

#include <iostream>
#include <string>
using namespace std;

class BankAccount {
private:
	int accountNumber;
	string accountHolderName;
	double balance;

public:
	string getAccountHolderName() {
		return accountHolderName;
	}

	void setAccountHolderName(string accountHolderName) {
		this->accountHolderName = accountHolderName;
	}

	int getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(int accountNumber) {
		this->accountNumber = accountNumber;
	}

	double getBalance() {
		return balance;
	}

	void setBalance(double balance) {
		this->balance = balance;
	}

	void deposit(double amount) {
		setBalance(this->balance + amount);
	}

	void withdraw(double amount) {
		if (this->balance - amount < 0) {
			cout << "Insufficient Balance" << endl;
		} else {
			setBalance(this->balance - amount);
		}
	}

	void displayAccountDetails() {
		cout << "\nAccount Holder Name " << accountHolderName << endl;
		cout << "Account Number " << accountNumber << endl;
		cout << "Your current balance: " << balance << endl;
	}

	void createAccount(string name) {
		setAccountHolderName(name);
		setAccountNumber(generateAccountNumber());
		setBalance(0.00f);
	}

	int generateAccountNumber() {
		int accountNumber;
		for (int i = 0; i < 8; i++) {
			accountNumber = accountNumber * 10 + rand();
		}
		if(accountNumber<0){
			accountNumber *= -1;
		}
		return accountNumber;
	}

};

int main() {
	string name;
	BankAccount bankAccount;
	int choice;
	double amount;

	cout << "Enter your Name: ";
	cin.ignore();
	getline(cin, name);

	bankAccount.createAccount(name);

	do {
		cout << "\n================MENU===============" << endl;
		cout << "1. Deposit Money" << endl;
		cout << "2. Withdraw Money" << endl;
		cout << "3. Display Account Details" << endl;
		cout << "4. Exit" << endl;
		cout << "\n===================================" << endl;
		cout << "Select an option: ";
		cin >> choice;
		switch (choice) {
			case 1: cout << "Enter amount to be deposited: " << endl;
					cin >> amount;
					bankAccount.deposit(amount);
					break;
			case 2: cout << "Enter amount to be withdrawn: " << endl;
					cin >> amount;
					bankAccount.withdraw(amount);
					break;
			case 3: cout << "Your Details" << endl;
					bankAccount.displayAccountDetails();
					break;
			case 4: cout << "Exiting Program...." << endl;
					break;
			default:cout << "Invalid choice, choose a correct option" << endl;
		}
	} while (choice != 4);
	return 0;
}
