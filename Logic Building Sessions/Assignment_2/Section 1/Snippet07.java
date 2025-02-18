/*  
    public class Main { 
        public static void main(String[] args) { 
            int x = "Hello"; 
            System.out.println(x); 
        } 
    }      

    Error:  Type mismatch: String literal "Hello" is assigned to an int variable
    Explanation: 
    An int can only hold integer values. Assigning a string value to an 
    integer type variable causes a type mismatch error because both types 
    are incompatible with each other.
*/

//Fixed Code:
public class Snippet07 { 
    public static void main(String[] args) { 
        String x = "Hello"; 
        System.out.println(x); 
    } 
} 
