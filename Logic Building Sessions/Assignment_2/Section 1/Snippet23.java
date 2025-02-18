/*
    public class Confusion { 
        public static void main(String[] args) { 
            int value = 2; 
            switch(value) { 
                case 1: 
                    System.out.println("Value is 1"); 
                case 2: 
                    System.out.println("Value is 2"); 
                case 3: 
                    System.out.println("Value is 3"); 
                default: 
                    System.out.println("Default case"); 
            } 
        } 
    } 

    Error: undesirable result - fall-through behaviour.
    Explanation:
    The default case is executed after "Value is 2" because there are no break statements in 
    the switch cases. In Java, when a case matches, execution continues sequentially through 
    the subsequent cases until a break or the end of the switch block is reached. This 
    behavior is called fall-through.
 */

//fixed code
public class Snippet23 { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
                break; //added break statement
            case 2: 
                System.out.println("Value is 2"); 
                break; //added break statement
            case 3: 
                System.out.println("Value is 3"); 
                break; //added break statement
            default: 
                System.out.println("Default case");
                break; //added break statement 
        } 
    } 
} 