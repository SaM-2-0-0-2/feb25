class Laptop3{
    int ram;
    static String name;
    double price;
    
    //init block of a class
    {
        System.out.println("Initialization Block");
    }

    //static block (loaded only once in the memory)
    static{
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
   } 
}
