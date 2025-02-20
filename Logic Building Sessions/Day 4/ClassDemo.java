class Laptop{
    int ram;
    String name;
    double price;

    Laptop(){;
        ram = 16;
        name = "Asus TUF F15";
        price = 75000.00;
        System.out.println("Constructor" + name + " " + ram + " " + price);
    }

    Laptop(int r, String str, double d){;
        ram = r;
        name = str;
        price = d;
        System.out.println("Constructor: " + name + " " + ram + " " + price);
    }

    void accessCamera(){
        System.out.println(" in accessCamera() ");
    }

    String Display(){
        return "Details of laptop: "+name+" "+ram+" "+price;
    }

}

class LaptopDemo{
    public static void main(String[] args) {
        Laptop lp = new Laptop(); //objects are stored in heap area in memory.
        System.out.println(lp);
        System.out.println(lp.ram);
        System.out.println(lp.name);
        System.out.println(lp.price);
        lp.accessCamera();
        System.out.println(lp.Display());
        Laptop lp2 = new Laptop(8,"Dell",50000.00);
        lp2.Display();
    }
}