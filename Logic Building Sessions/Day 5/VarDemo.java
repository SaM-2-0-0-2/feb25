class Laptop2{
    int ram;
    static String name;
    double price;

    Laptop2(){;
        ram = 16;
        name = "Asus";
        price = 75000.00;
        System.out.println("Constructor" + name + " " + ram + " " + price);
    }

    Laptop2(int r, double d){;
        ram = r;
        price = d;
        System.out.println("Constructor: " + name + " " + ram + " " + price);
    }

}

public class VarDemo {
    public static void main(String[] args) {
        Laptop2 lp1 = new Laptop2();
        Laptop2 lp2 = new Laptop2(8,60000.0);
        Laptop2 lp3 = new Laptop2(32,100000.0);

        System.out.println(lp1.name);
        System.out.println(lp2.name);
        System.out.println(lp3.name);

        lp1.name = "HP";
        System.out.println(lp1.name);
        System.out.println(lp2.name);
        System.out.println(lp3.name);
    }
}
