class Student2 {
    int id;
    String name;
    long MobNo;
    static String course = "PG_DAC";
    
    Student2(){
        this(100);
        id=0;
        name="XYZ";
        MobNo=01;
        System.out.println("Inside 0 parameter constructor");
    }

    Student2(int id, String name, long MobNo){
        this();
        this.id =id;
        this.name=name;
        this.MobNo=MobNo;
        System.out.println("Inside 3 parameter constructor");
    }

    Student2(int id){
        System.out.println("Inside 1 parameter constructor");
    }

    public static void main(String[] args) {
        Student2 sobj = new Student2();
        Student2 s = new Student2(1,"ABC",9L);
        System.out.println(s.id);

    }
}
