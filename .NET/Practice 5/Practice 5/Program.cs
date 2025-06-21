using System.Xml.Linq;

namespace OverloadingHidingAndOverriding
{
    internal class Program
    {
        static void Main()
        {
            DerivedClass derivedClass = new DerivedClass();
            derivedClass.Display1(); //calls base class method
            derivedClass.Display1("Sam"); //calls derived class overloaded method 
            derivedClass.Display2();
            Console.WriteLine("\n");

            SubderivedClass derivedClass2 = new SubderivedClass();
            derivedClass2.Display1();
            derivedClass2.Display1("Shriram");
            derivedClass2.Display2();
            derivedClass2.Display3();
            Console.WriteLine("\n");
            
            SubSubDerived subderivedClass3 = new SubSubDerived();
            subderivedClass3.Display1();
            subderivedClass3.Display1("ZomHun");
            subderivedClass3.Display2();
            subderivedClass3.Display3();
        }
    }

    public class BaseClass
    {
        public void Display1()
        {
            Console.WriteLine("base display1");
        }

        //Any base class method can be hidden
        public void Display2()
        {
            Console.WriteLine("base display2");
        }

        public virtual void Display3()
        {
            Console.WriteLine("This method will be overloaded");
        }
    }

    public class DerivedClass : BaseClass
    {
        //Overloading
        public void Display1(string name)
        {
            Console.WriteLine("Derived Class Display1 " + name);
        }

        //hiding
        public new void Display2() // without new keyword warning is shown
        {
            Console.WriteLine("This method hides base class method");
        }

        //gidves error if base class method doesn't have
        //override, virtual or abstract in it's method signature
        public override void Display3() 
        {
            Console.WriteLine("Overridden method");
        }

        // public override void Display1() { }
        // error as Display1 is not declared as override, abstract or virtual in base class 
    }

    public class SubderivedClass : DerivedClass
    {
        public new void Display2()
        {
            Console.WriteLine("SubDerived Class Display2");
        }

        public sealed override void Display3()
        {
            Console.WriteLine("Subderived Class Display3 (Overridden and Sealed)");   
        }
    }


    public class SubSubDerived : SubderivedClass
    { 
        //cannot use override keyword as Display3() is sealed (final equivalent) 
        public new void Display3()
        {
            Console.WriteLine("SubSub Derived Display3");
        }
    }
}