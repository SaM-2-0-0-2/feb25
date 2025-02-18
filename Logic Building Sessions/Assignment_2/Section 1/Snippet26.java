/*
    public class Switch { 
        public static void main(String[] args) { 
            int number = 5; 
            switch(number) { 
                case 5: 
                    System.out.println("Number is 5");
                    break; 
                case 5: 
                    System.out.println("This is another case 5"); 
                    break; 
                default: 
                    System.out.println("This is the default case"); 
            } 
        } 
    } 

    Error: duplicate case labels
    Explanation:
    The code will not run because there are two case 5: labels in the switch statement. 
    In Java, each case label within a switch statement must be unique; otherwise, the 
    compiler throws an error.    
 */

//Fixed Code:
public class Snippet26 { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 4: //changed duplicate case 5 to case 4  
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} 