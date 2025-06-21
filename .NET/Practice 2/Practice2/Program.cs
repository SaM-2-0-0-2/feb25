namespace InheritanceExample1
{
    internal class Program
    {
        static void Main()
        {
            BaseClass b = new BaseClass();
            b.A = 1;
            Console.WriteLine(b.A);

            DerivedClass obj2 = new DerivedClass();
            obj2.A = 2;
            obj2.B = 3;
            Console.WriteLine(obj2.A + " " + obj2.B);
        }

        public class BaseClass
        {
            public int A { get; set; }
        }

        public class DerivedClass : BaseClass
        {
            public int B { get; set; }
        }
    }
}