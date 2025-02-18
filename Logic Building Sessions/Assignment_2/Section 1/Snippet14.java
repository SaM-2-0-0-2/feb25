/*  
    public class Main { 
        public static void main(String[] args) { 
            double num = "Hello"; 
            System.out.println(num); 
        } 
    }       

    Error:  Type mismatch: String literal "Hello" is assigned to an double variable
    Explanation: 
    An double can only hold double(numeric) values. Assigning a string value to an 
    double type variable causes a type mismatch error because both types 
    are incompatible with each other. 
*/

//Fixed Code:
public class Snippet14 { 
    public static void main(String[] args) { 
        double num = 86.79; // Assigning a double literal
        System.out.println(num); 
    } 
} 