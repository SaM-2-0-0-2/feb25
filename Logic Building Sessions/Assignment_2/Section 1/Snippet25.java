/*  
    public class Switch { 
        public static void main(String[] args) { 
            double score = 85.0; 
            switch(score) { 
                case 100: 
                    System.out.println("Perfect score!"); 
                    break; 
                case 85: 
                    System.out.println("Great job!"); 
                    break; 
                default: 
                    System.out.println("Keep trying!"); 
            } 
        } 
    }         

    Error: Type Mismatch - switch statement in Java does not support the double type.
    Explanation: 
    Java's switch statement only supports integral types (byte, short, int, char), their 
    corresponding wrapper classes. Since double is not one of these types, using it as the 
    switch expression causes a compilation error.
*/

//Fixed Code:
public class Snippet25 { 
    public static void main(String[] args) { 
        int score = 85; //changed the value of literal to 85 and identifier's data-type to int
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}  