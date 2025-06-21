namespace ConstructorInheritance
{
    internal class Program
    {
        static void Main()
        {
            B b1 = new B();
            Console.WriteLine(b1.i + " " + b1.j);
            B b2 = new B(1234, 5678);
            Console.WriteLine(b2.i + " " + b2.j);
            B obj3  = new B(1243657097);
            Console.WriteLine(obj3.i);
        }
    }

    public class A
    {
        public int i;
        public A()
        {
            Console.WriteLine("\nBase class non parameterized ctor");
            i = 10;
        }

        public A(int a)
        {
            Console.WriteLine("\nBase class parameterized ctor");
            i = a;
        }
    }

    public class B : A
    {
        public int j;
        public B()
        {
            Console.WriteLine("sDerived class non parameterized ctor");
            j = 20;
        }

        public B(int a)
        {
            Console.WriteLine("Derived class parameterized ctor");
            i = a;
        }

        public B(int a, int b) : base(a)
        {
            Console.WriteLine("Derived class parameterized ctor");
            j = b;
        }

    }
}