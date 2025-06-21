namespace ActionFuncPredicate
{
    internal class Program
    {
        static void Main()
        {
            Action o1 = Display;
            o1();

            Action<string> o2 = Display;
            o2("damn");

            Action<string, int> o3 = Display;
            o3("xoxo", 68);

            Func<int,int,int> o4 = Add;
            Console.WriteLine(o4(1, 21));

            Func<int, double> o5 = MakeDouble;
            Console.WriteLine(o5(1));

            Func<int, bool> o6 = IsEven;
            Console.WriteLine(o6(10));

            Func<Employee, bool> o7 = IsBasicGreaterThan10000;
            bool res = o7(new Employee { EmpNo = 1, Basic = 50000 });
            Console.WriteLine(res);
        
            Predicate<int> o8 = IsEven;
            Console.WriteLine(o8(2));
        
            Predicate<Employee> o9 = IsBasicGreaterThan10000;
            Console.WriteLine(o9(new Employee { EmpNo = 1, Basic = 500 }));
        }

        static double MakeDouble(int x)
        {
            return (double) x;
        }

        static bool IsEven(int a)
        {
            return a % 2 == 0;
        }

        static bool IsBasicGreaterThan10000(Employee emp)
        {
            if (emp.Basic > 10000)
                return true;
            else
                return false;
        }

        static int Add(int a, int b)
        {
            return a + b;
        }

        static void Display()
        {
            Console.WriteLine("Display");
        }

        static void Display(string s)
        {
            Console.WriteLine("Display" + s);
        }

        static void Display(string s, int a)
        {
            Console.WriteLine("Display" + s + " " + a);
        }

    }

    public class Employee
    {
        public int EmpNo { get; set; }
        public decimal Basic {  get; set; }
    }
}