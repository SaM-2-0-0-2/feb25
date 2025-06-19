/*
1. Declare a List of Employee class objects 
        
Accept details for Employees in a loop. Stop accepting based on user input (yes/no)'
Display the Employee with highest Salary
Accept EmpNo to be searched. Display all details for that employee.
Display details for the Nth Employee where N is a number accepted from the user.


2. Create an array of Employee objects. Convert it to a List<Employee>.  Display all the Employees in the list.

3. Create a List<Employee>. Convert it to an array. Display all the array elements.
*/


using System.Collections;

namespace Assignment5
{
    internal class Program
    {
        static void Main1()
        {
            List<Employee> emp = new List<Employee>(5);
            bool flag=true;
            int i = 0;
            while (flag)
            {
                Console.WriteLine("Enter Employee Name:");
                string? name = Console.ReadLine();
                Console.WriteLine("Enter Employee Salary:");
                decimal sal = Convert.ToDecimal(Console.ReadLine());
                emp.Add(new Employee(name, sal));
                Console.WriteLine("Would you like to add another employee?(Y/N)");
                string? choice = Console.ReadLine();
                if(choice != "Y" )
                {
                    flag=false;
                }
                Console.WriteLine();
            }
            
            emp.ForEach(x => Console.WriteLine(x));
            
            Console.WriteLine();

            decimal maxsal = emp.Max(e => e.Salary);
            List<Employee> Emp = emp.FindAll(e => e.Salary == maxsal);
            Emp.ForEach(x => Console.WriteLine(x));
            Console.WriteLine();
            Console.WriteLine("Enter the employee number to be searched:");
            
            int empNo = int.Parse(Console.ReadLine()!);
            Employee result = emp.Find(e => e.EmpNo == empNo);
            Console.WriteLine(result);

            Console.WriteLine();
            Console.WriteLine("Enter the employee's index whose info, you want to fetch: ");
            int index = Convert.ToInt32(Console.ReadLine());

            Console.WriteLine(emp[index]);
        }
        
        static void Main2()
        {
            Employee[] emp = new Employee[5];
            emp[0] = new Employee("Shrinivas", 50000);
            emp[1] = new Employee("Shubham", 40000);
            emp[2] = new Employee("Shriram", 45000);
            emp[3] = new Employee("Shreeyash", 30000);
            emp[4] = new Employee("Shriraj", 48000);

            List<Employee> emp1 = emp.ToList();
            foreach (Employee employee in emp1)
            {
                Console.WriteLine("\n" + employee);
            }
        }
        
        static void Main3()
        {
            List<Employee> emp =  new List<Employee>();
            emp.Add(new Employee("Arjun", 80000));
            emp.Add(new Employee("Akash", 75000));
            emp.Add(new Employee("Bill", 60000));
            emp.Add(new Employee("Darshan", 50000));

            Employee[] emp1 = emp.ToArray();


            foreach (Employee employee in emp1)
            {
                Console.WriteLine("\n" + employee);
            }
        }
        ArrayList arr;
    
    }

    public class Employee
    {
        private int empNo;
        private static int counter=0;
        private string name;
        private decimal salary;

        public Employee(string name="unknown", decimal salary=0)
        {
            EmpNo = ++counter;
            this.Name = name;
            this.salary = salary;
        }

        public override string ToString()
        {
            return "Employee No.: " + this.EmpNo + "\nEmployee Name: " + this.Name + "\nSalary: " + this.Salary;
        }

        public int EmpNo { get { return empNo; } private set { empNo = value; } }
        public string Name { get { return name; } set { name = value; } }
        public decimal Salary { get { return salary; } set { salary = value; } }

    }
}