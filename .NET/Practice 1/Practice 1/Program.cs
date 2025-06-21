using System.Runtime.CompilerServices;

namespace StaticMembers
{
    internal class Program
    {
        static void Main()
        {
            Class1 class1 = new Class1();
            class1.Display();
            Class1.DisplayS();

            //Cannot create an object/instance of static class
            //SClass sc = new SClass();

            SClass.Display();
        }
    }

    public class Class1 //: SClass //error static class can't be base class
    { 
        private int id;
        public int Id
        {
            get { return id; }
            set { if (id < 100) id = value; }
        }

        public Class1()
        {
            this.Id = 2;
        }

        private static int sid;
        public static int Sid
        {
            get { return sid; }
            set { if(sid != 100) sid = value; }
        }

        //static constructor is implicitly private,
        //cannot have parameters, and cannot be overloaded
        static Class1()
        {
            Sid = 1;
        }


        public void Display()
        {
            Console.WriteLine("Display " + this.id + " " +  Sid);
        }

        public static void DisplayS()
        {
            Console.WriteLine("Static Display " + Sid);
        }
    }

    static class SClass
    {
        // private int i; //error
        private static int i;
        public static int Id
        {
            get { return i; }
            set { if(i>0) i = value; }
        }

        static SClass()
        {
            i = 5;
        }

        public static void Display()
        {
            Console.WriteLine("Static Class Method " + i);
        }
    }
}