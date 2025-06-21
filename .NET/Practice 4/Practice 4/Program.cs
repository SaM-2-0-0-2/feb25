namespace InterfaceDemo
{
    internal class Program
    {
        static void Main()
        {
            Impl obj = new Impl();
            obj.Display();
            //Method-1
            obj.Insert();
            obj.Delete();
            obj.Update();


            //Method-2 (upcasting)
            IInterface Iobj = new Impl(); 
            Iobj.Insert();
            Iobj.Update();
            Iobj.Delete();
            //Iobj.Display(); //error display is not a member/ pure virtual function in Interface
        
            //Method-3 (Casting)
            ((IInterface)obj).Insert();
            ((IInterface)obj).Update();
            ((IInterface)obj).Delete();

            //Method-4 (casting - different syntax)
            (obj as IInterface).Insert();
            (obj as IInterface).Update();
            (obj as IInterface).Delete();

        }
    }

    public interface IInterface
    {
        public void Insert();
        public void Update();
        public void Delete();

    }

    public class Impl : IInterface
    {
        public Impl() { }

        public void Insert() {
            Console.WriteLine("Insert Logic");
        }

        public void Update()
        {
            Console.WriteLine("Update Logic");
        }

        public void Display()
        {
            Console.WriteLine("Display data");
        }

        public void Delete()
        {
            Console.WriteLine("Delete Logic");
        }
    }
}