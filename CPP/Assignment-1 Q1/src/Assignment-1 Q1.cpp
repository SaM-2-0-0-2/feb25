/*============================================================================
 Q1. Create a class called Student with the following private data members:
 1. name (string): to store the name of the student.
 2. rollNumber (int): to store the roll number of the student.
 3. marks (float): to store the marks obtained by the student.
 4. grade (char): to store the grade calculated based on the marks.
 Implement getter and setter member functions for each data member
 Create a member function calculateGrade() that calculates the grade based on the following
 grading scale:
 A: 90-100
 B: 80-89
 C: 70-79
 D: 60-69
 F: Below 60
 Implement a menu-driven program in the main() function with the following options:
 1. Accept Information
 2. Display information
 3. Calculate Grade
 4. Exit the program.
 ============================================================================*/

#include <iostream>
#include <string>
using namespace std;

class Student {

private:
	string name;
	int rollno;
	float marks;
	char grade;

public:
	char getGrade() {
		return grade;
	}

	void setGrade(char grade) {
		this->grade = grade;
	}

	float getMarks() {
		return marks;
	}

	void setMarks(float marks) {
		this->marks = marks;
	}

	void setName(string name) {
		this->name = name;
	}

	string getName() {
		return name;
	}

	int getRollno() {
		return rollno;
	}

	void setRollno(int rollno) {
		this->rollno = rollno;
	}

	void calculateGrade() {
		if (marks >= 90 && marks <= 100) {
			setGrade('A');
		} else if (marks >= 80) {
			setGrade('B');
		} else if (marks >= 70) {
			setGrade('C');
		} else if (marks >= 60) {
			setGrade('D');
		} else if (marks <60) {
			setGrade('F');
		}

		cout << "Your Grade: " << getGrade() << endl;
	}

	void takeInput(){
		cout << "Enter your Name: ";
		cin.ignore();
		getline(cin,name);
		setName(name);

		cout << "Enter your Roll No: ";
		cin >> rollno;
		setRollno(rollno);

		cout << "Enter your Marks: "<< endl;
		cin >> marks;
		setMarks(marks);
	}

	void showDetails(){
		cout << "Name:" << getName() << endl;
		cout << "Roll No: " << getRollno() << endl;
		cout << "Marks" << getMarks() << endl;
		calculateGrade();
	}
};

int main() {
	Student s;
	int x;
	do{
		cout << "\n=================================" << endl;
		cout << "MENU" << endl;
		cout << "1. Enter details" << endl;
		cout << "2. Show details" << endl;
		cout << "3. Calculate grade" << endl;
		cout << "4. Exit" << endl;
		cout << "=================================" << endl;
		cout << "Your Choice: ";
		cin >> x;

		switch(x){
			case 1: s.takeInput();
					break;
			case 2: s.showDetails();
					break;
			case 3: s.calculateGrade();
					break;
			case 4: cout << "EXITING PROGRAM..." << endl;
					break;
			default:cout << "INVALID OPTION! TRY AGAIN, AMIGO" << endl;
		}
	} while(x!=4);
	return 0;
}
