/*
    public - everywhere
    private - edsame class
    protected - same class, derived class
    internal - same class, same assembly(same project)
    protected internal - same class, derived class, same assembly(same project)
    private protected - same class, derived class that are in the same assembly(same project)
 */

namespace InheritanceExample1 {
    class Program
    {
        static void Main()
        {
            DerivedClass obj = new DerivedClass();
            obj.PUBLIC = 0;
            obj.PROTECTED_INTERNAL = 0;
            obj.INTERNAL = 0;
            //obj.PRIVATE, PRIVATE_PROTECTED, PROTECTED will cause errors
            obj.A=1;
            obj.B=2;
            Console.WriteLine(obj.A);
            Console.WriteLine(obj.B);
        }
    }

    public class BaseClass // : object
    {
        public int A { get; set; }
        public int PUBLIC;
        private int PRIVATE;
        protected int PROTECTED;
        internal int INTERNAL;
        protected internal int PROTECTED_INTERNAL;
        private protected int PRIVATE_PROTECTED;
    }

    public class DerivedClass : BaseClass {
        public int B { get; set; }

        void DoNothing()
        {
            this.PUBLIC = 0;
            this.PROTECTED = 0;
            this.PROTECTED_INTERNAL = 0;
            this.PRIVATE_PROTECTED = 0;
            this.INTERNAL = 0;
            //this.PRIVATE = 0; // ERROR
        }
    }
}


