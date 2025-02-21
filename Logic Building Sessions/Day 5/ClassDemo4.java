class Student{
    int id;
    String  name;
    long mobNo;
    static String course = "PG-DAC"; 

    Student(){
        id = 0;
        name = "XYZ";
        mobNo = 0l;
    }

    Student(int id, String name, long mobNo){
        this.id=id;
        this.name=name;
        this.mobNo=mobNo;
    }

    Student getstudent(){
        return this;
    }

    void display(){
        System.out.println(this.id+" "+this.course);
    }

    void display(int id){
        System.out.println(this.id+" "+course +" "+id);
    }

    public static void main(String[] args) {
        Student s2 = new  Student(3,"a",9l);
        Student s1 = new  Student(2,"a",9l);
        Student s = new Student();
        s.display();
        s1.display();   
        s2.display(); 
        s2.display(100);  
        Student s3 = s2.getstudent();
        s3.display();
    }
}

