/*
    public class MissingBreakCase { 
        public static void main(String[] args) { 
            int level = 1; 
            switch(level) { 
                case 1: 
                    System.out.println("Level 1"); 
                case 2: 
                    System.out.println("Level 2"); 
                case 3: 
                    System.out.println("Level 3"); 
                default: 
                    System.out.println("Unknown level"); 
            } 
        } 
    }

    Error: undesirable result - fall-through behaviour.
    Explanation:
    All cases are executed as there are no break statements in the switch cases. In Java, when 
    a case matches, execution continues sequentially through the subsequent cases until a break 
    or the end of the switch block is reached. This behavior is called fall-through. The break 
    statement changes the flow of execution by jumping the control flow out of the switch case.
 */

//fixed code
public class Snippet24 { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
                break; //added break statement
            case 2: 
                System.out.println("Level 2"); 
                break; //added break statement
            case 3: 
                System.out.println("Level 3"); 
                break; //added break statement
            default: 
                System.out.println("Unknown level");
                break; //added break statement 
        } 
    } 
}