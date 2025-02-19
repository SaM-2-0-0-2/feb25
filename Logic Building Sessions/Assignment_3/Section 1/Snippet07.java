/*
    public class UninitializedWhileLoop { 
        public static void main(String[] args) { 
            int count; 
            while (count < 10) { 
                System.out.println(count); 
                count++; 
            } 
        } 
    }  
    Error: identifier count is not initialized.
    Explanation:
    In Java, To perform arithmetic operations with an identifier we first need to initialized
    it by assigning it with a value. In this code count variable is used without initialization.
    To resolve this issue, count variable is initialized with zero.

*/

public class Snippet07 { 
    public static void main(String[] args) { 
        int count=0; 
        while (count < 10) { 
            System.out.println(count); 
            count++; 
        } 
    } 
}
