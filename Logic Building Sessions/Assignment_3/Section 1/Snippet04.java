/* 
    public class OffByOneErrorForLoop { 
        public static void main(String[] args) { 
            for (int i = 1; i <= 10; i++) { 
                System.out.println(i); 
            } 
            // Expected: 10 iterations with numbers 1 to 10 
            // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
        } 
    }   

    Error: off by one error
    Explanation:
    The loop in the code iterates n times where it is expected to iterate n-1 or n+1 times only. 
    This error is called off by one error which arises due to improper use of relational operators
    in loop condition. Proper relational operators are used to resolve this error.
*/

//Fixed Code:
public class Snippet04 { 
    public static void main(String[] args) { 
        for (int i = 1; i < 10; i++) { 
            System.out.println(i); 
        } 
        // Expected: 10 iterations with numbers 1 to 10 
        // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
    } 
} 