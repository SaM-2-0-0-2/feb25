/* 
    public class IncorrectWhileLoopControl { 
        public static void main(String[] args) { 
            int num = 10; 
            while (num = 10) { 
                System.out.println(num); 
                num--; 
            } 
        } 
    }     

    Error: Type mismatch error - cannot convert from int to boolean.
    Explanation:
    The error occurs as condition in while loop is incorrect. This is because assignment 
    operator is used in the condition part which is not allowed as the condition evaluates 
    to either true or false. The end result is boolean literal while an assignment operator
    is used to assign a value. To resolve this issue we need relational operator like == 
    or !=. 
*/

//Fixed Code:
public class Snippet10 { 
    public static void main(String[] args) { 
        int num = 10; 
        while (num == 10) { 
            System.out.println(num); 
            num--; 
        } 
    } 
} 