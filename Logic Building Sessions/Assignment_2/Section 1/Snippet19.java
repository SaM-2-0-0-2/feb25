/*  
    public class Main { 
        public static void main(String[] args) { 
            int a = 10; 
            int b = 0; 
            int result = a / b; 
            System.out.println(result); 
        } 
    }         

    Error: ArithmeticException - Division by zero.
    Explanation: 
    Any value divided by 0 is undefined. Division by zero in Java causes an ArithmeticException 
    for integers and results in Infinity or NaN for floating-point numbers. Java has inbuilt 
    support to prevent this problem. When a number is divided by 0, Arithmetic expection
    occurs during run-time.
*/

//Fixed Code:
public class Snippet19 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 1; //Assign value as 1 instead of 0
        int result = a / b; 
        System.out.println(result); 
    } 
} 