/*  
    public class Main { 
        public void display() { 
            System.out.println("No parameters"); 
        } 
        public void display(int num) { 
            System.out.println("With parameter: " + num); 
        } 
        public static void main(String[] args) { 
            display(); 
            display(5); 
        } 
    }       

    Error: The display() methods are instance methods and are being called from 
           the static main method.
    Explaination: 
    In Java, instance methods belong to an object of the class, not the class 
    itself. The main method is static, which means it belongs to the class, and 
    it cannot directly call non-static (instance) methods. These methods should 
    be made static for code to work.
*/

//Fixed Code:
public class Snippet10 { 
    public static void display() { 
        System.out.println("No parameters"); 
    } 
    public static void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
}  
