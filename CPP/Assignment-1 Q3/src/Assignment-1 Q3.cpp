/*============================================================================
 Q3. Imagine you are tasked with creating a program to simulate a toll booth. The toll booth
 keeps
 track of the number of vehicles that have passed through it and the total amount of money
 collected. You need to implement a class TollBooth with appropriate data members and
 member functions to accomplish this.

 Here are the details for the TollBooth class:
 1. Data Members: - totalVehicles: An integer to keep track of the total number of vehicles that have
 passed through the toll booth. - totalRevenue: A double to store the total revenue collected from tolls.

 2. Member Functions:
 1. void reset(): Resets both the totalVehicles and totalRevenue to zero.
 2. void vehiclePayingToll(int vehicleType, double tollAmount): Accepts an integer
 vehicleType and a double tollAmount. The vehicleType represents the type of car (1
 for standard car, 2 for truck, 3 for bus). The function should increment totalVehicles
 by 1 and add tollAmount to totalRevenue based on the car type.
 3. int getTotalVehicles() : A getter method that returns the total number of vehicles
 passed through the booth.
 4. double getTotalRevenue() : A getter method that returns the total revenue collected.
 3. Menu-Driven Program:

 Write a menu-driven program in main() that allows the user to interact with the TollBooth
 class: - Display a menu with the following options:
 1. Add a standard car and collect toll
 2. Add a truck and collect toll
 3. Add a bus and collect toll
 4. Display total cars passed
 5. Display total revenue collected
 6. Reset booth statistics
 7. Exit

 - Implement the logic for each menu option using appropriate member functions of the TollBooth class.
 - Continue displaying the menu until the user chooses to exit.
 - Define a fixed toll amount for each type of car (e.g., $2 for standard cars, $5 for trucks, $10 for buses).
 =============================================================================*/

#include<iostream>
using namespace std;

class TollBooth {
private:
	int totalvehicles;
	double totalrevenue;

public:

	TollBooth(){
		this->totalvehicles = 0;
		this->totalrevenue = 0.00f;
	}

	void reset() {
		this->totalrevenue = 0.00f;
		this->totalvehicles = 0;
		cout << "Values are reinitialized to 0" << endl;
	}

	double getTotalrevenue() const {
		return totalrevenue;
	}

	int getTotalvehicles() const {
		return totalvehicles;
	}

	void vehiclePayingToll(int vehicleType, double tollAmount) {
		this->totalvehicles += 1;
		this->totalrevenue += tollAmount;
		if(vehicleType==1){
			cout << "Vehicle Type: Standard Car \nToll Amount: $" << tollAmount << endl;
			cout << "HAPPY JOURNEY !!!" << endl;
		} else if(vehicleType==2){
			cout << "Vehicle Type: Truck \nToll Amount: $" << tollAmount << endl;
			cout << "HAPPY JOURNEY !!!" << endl;
		} else {
			cout << "Vehicle Type: Bus \nToll Amount: $" << tollAmount << endl;
			cout << "HAPPY JOURNEY !!!" << endl;
		}
	}
};

int main() {
	int choice;
	char warningChoice;
	TollBooth tollBooth;
	do {
		cout << "==========MENU==========" << endl;
		cout << "1. Add a standard car and collect toll" << endl;
		cout << "2. Add a truck and collect toll" << endl;
		cout << "3. Add a bus and collect toll" << endl;
		cout << "4. Display total cars passed" << endl;
		cout << "5. Display total revenue collected" << endl;
		cout << "6. Reset booth statistics" << endl;
		cout << "7. Exit" << endl;
		cout << "========================" << endl;
		cout << "Your choice: ";
		cin >> choice;

		switch (choice) {
			case 1: tollBooth.vehiclePayingToll(1, 2.00f);
					break;
			case 2: tollBooth.vehiclePayingToll(2, 5.00f);
					break;
			case 3: tollBooth.vehiclePayingToll(3, 10.00f);
					break;
			case 4: cout << "Total Cars Passed Since Last Reset: " << tollBooth.getTotalvehicles() << endl;
					break;
			case 5: cout << "Total Revenue Collected Since Last Reset: $" << tollBooth.getTotalrevenue() << endl;
					break;
			case 6: cout << "Warning: Do you want to reset data? (Y,N)" << endl;
					cin >> warningChoice;
					if(warningChoice=='Y' || warningChoice=='y'){
						tollBooth.reset();
					}
					break;
			case 7: cout << "Exiting Program..." << endl;
					break;
			default: cout << "Invalid Choice, Choose again" << endl;
		}
	} while (choice != 7);
	return 0;
}
