import java.util.Scanner;
class Employee{
	int id;
	int salary;
	String address;
	long mobile;
	String name;
	
	public void insert(int id, String name, int salary, String address, long mobile){
		this.id = id;
		this.salary = salary;
		this.mobile = mobile;
		this.address = address;
		this.name = name;
	}
	
	public void print(){
		System.out.print("Employee id: " + id);
		System.out.print("\tEmployee name: " + name);
		System.out.print("\tSalary: " + salary);
		System.out.print("\tPhone Number: " + mobile);
		System.out.print("\tAddress: " + address);
	}
}
		
public class EMS{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		Employee[] emp = new Employee[n];
		for(int i=0; i<n; i++){
			emp[i] = new Employee();
		}
		
		for(Employee e : emp){
			System.out.print("\nEnter employee id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter employee name: ");
			String name = sc.nextLine();
			System.out.print("Enter salary: ");
			int sal = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter address: ");
			String addr = sc.nextLine();
			System.out.print("Enter phone number: ");
			long ph = sc.nextLong();
			e.insert(id,name,sal,addr,ph);
		}
		
		System.out.println("\nEmployee Details: ");	
		for(Employee e : emp){
			e.print();
			System.out.println();
		}
	}
}
	