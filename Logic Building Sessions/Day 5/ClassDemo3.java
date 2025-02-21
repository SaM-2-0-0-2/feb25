class Laptop3{
    int ram =  2;
    static String name = "HP";
    double price = 20000.0;
    
    //init block of a class
    {
        ram = 8;
        name= "Dell";
        price = 30000.0;
        System.out.println("Initialization Block");
    }

    //static block (loaded only once in the memory)
    //used to set properties once before starting a project.
    //we cannot write instance variables in static block, only static variables can be defined in static block.
    //used to provide common properties to all instances.    
    static{
        name= "HP";
        System.out.println("Static Block");
    }

    Laptop3(){
        System.out.println("Constructor");
    }
}

public class ClassDemo3 {
   public static void main(String[] args) {
        Laptop3 obj = new Laptop3();
        System.out.println();
        Laptop3 obj2 = new Laptop3();
        System.out.println(obj.ram);
        System.out.println(obj.name);
        System.out.println(obj.price);
    } 
}
