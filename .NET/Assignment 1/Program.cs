/*Create a Class Employee with the following specifications

Properties
----------
string Name -> no blank names should be allowed
int EmpNo -> must be greater than 0
decimal Basic -> must be between some range
short DeptNo -> must be > 0

Methods
-------
decimal GetNetSalary() -> returns calculated net salary (Use any formula to get net salary based on Basic salary)

Create constructors to accept initial values for Employee obj
eg
Employee o1 = new Employee(1,"Amol",123465, 10);
Employee o2 = new Employee(1,"Amol",123465);
Employee o3 = new Employee(1,"Amol");
Employee o4 = new Employee(1);
Employee o5 = new Employee();
*/

namespace Assignment1
{
    internal class Program
    {
        static void Main()
        {
            Employee o1 = new Employee(1, "Amol", 123465, 10);
            Employee o2 = new Employee(1, "Amol", 123465);
            Employee o3 = new Employee(1, "Amol");
            Employee o4 = new Employee(1);
            Employee o5 = new Employee();
            o1.Display();
            o2.Display();
            o3.Display();
            o4.Name = "Amol";
            o4.Display();

            o5.Name = null;
            o5.Display();

            //Using Exception Handling
            /*try
            {
                o5.Name = null;
                o5.Display();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
            }*/
        }
    }

    public class Employee
    {
        private string name;
        private int employeeNo;
        private decimal basic;
        private short deptNo;

        public string Name
        {
            get{
                return this.name;
            } 

            set{
                if (value != "" && value != null) // can also use !string.IsNullorWhiteSpace(value) for this validation
                {
                    name = value;
                } else {
                    Console.WriteLine("\nEmployee Name shouldn't be null");
                    //Exception thrown
                    //throw new ArgumentException("Employee Name cannot be null, empty, or whitespace.");
                }
            }
        }

        public int EmployeeNo
        {
            get{
               return this.employeeNo;
            }

            set
            {
                if (value > 0)
                    employeeNo = value;
                else
                    Console.WriteLine("\nEmployee Number cannot be zero");
            }
        }
        public decimal Basic
        {
            get
            {
                return this.basic;
            }
            set
            {
                if (value > 8000 && value <= 1000000)
                    basic = value;
                else
                    Console.WriteLine("\nBasic Salary must be between 8000 and 1000000");
            }
        }
        public short DeptNo
        {
            get
            {
                return this.deptNo; 
            }

            set
            {
                if (value > 0)
                {
                    deptNo = value;
                } else {
                    Console.WriteLine("\nDepartment Number should be more than 0");
                }
            }
        }

        public Employee()
        {
            Console.WriteLine("This is a zero parameterized constructor");
        }

        public Employee(int empNo)
        {
            this.EmployeeNo = empNo;
        }

        public Employee(int empNo, string name)
        {
            this.EmployeeNo = empNo;
            this.Name = name;
        }

        public Employee(int empNo, string name, decimal basic)
        {
            this.EmployeeNo = empNo;
            this.Name = name;
            this.Basic = basic;
        }


        public Employee(int empNo, string name, decimal basic, short deptNo){
            this.Name = name;
            this.EmployeeNo = empNo;    
            this.Basic = basic;
            this.DeptNo = deptNo;
        }

        public decimal GetNetSalary()
        {
            decimal netSal = 1;
            if (this.basic <= 10000)
            {
                netSal = this.basic + (this.basic * 0.05M);
            }
            else if (this.basic > 10000 && this.basic <= 20000)
            {
                netSal = this.basic + (this.basic * 0.10M);
            }
            else if (this.basic > 20000)
            {
                netSal = this.basic + (this.basic * 0.15M);
            }
            return netSal;
        }

        public void Display()
        {
            Console.WriteLine("\nEmployee Name: " + this.name);
            Console.WriteLine("Employee Id: " + this.employeeNo);
            Console.WriteLine("Basic Salary: " + this.basic);
            Console.WriteLine("Department Number: " + this.deptNo);
            Console.WriteLine("Gross Salary: " + GetNetSalary());
        }
    }
}