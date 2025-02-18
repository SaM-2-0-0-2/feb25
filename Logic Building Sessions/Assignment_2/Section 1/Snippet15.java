/*  
    public class Main { 
        public static void main(String[] args) { 
            int num1 = 10; 
            double num2 = 5.5; 
            int result = num1 + num2; 
            System.out.println(result); 
        } 
    }        

    Error:  Type mismatch: The code attempts to assign the result of adding an 
            int (num1) and a double (num2) to an int variable (result).
    Explanation: 
     Double value can't be assigned to an int variable without explicitly casting it. 
     This is a loss of precision problem, so Java prevents this operation, giving rise to 
     compile time error. Changing the type of result to double will resolve this issue. If 
     integer result is needed, we can do explicit type casting but this will lead to 
     precision loss.
*/

//Fixed Code:
public class Snippet15 { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        double result = num1 + num2; 
        System.out.println(result); 
    } 
} 