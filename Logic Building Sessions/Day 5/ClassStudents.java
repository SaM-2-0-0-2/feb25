class Student{
    int id;
    String  name;
    long mobNo;
    static String course = "PG-DAC";

    Student(){

    }

    void display(){
        System.out.println(id+" "+course);
    }

    //we cant use non static variables in static methods
    //here id identifier was allowed as it is a local variable.
    static void display(int id){
        System.out.println(id+" "+course);
    }

    public static void main(String[] args) {
        Student s = new  Student();
        s.display();   
        s.display(1);      
    }
}

