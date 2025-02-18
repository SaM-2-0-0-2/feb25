/*  
    public class Main { 
        public static void main(String[] args) { 
            int x = y + 10; 
            System.out.println(x); 
        } 
    }     

    Error: Unresolved Variable - The variable y is used but never declared.
    Explaination: 
    In Java, every variable must be declared before it is used. The code 
    tries perform arithmetic operations involving y, but since y is 
    not declared anywhere, an error occurs saying it cannot find the symbol y.
*/

//Fixed Code:
public class Snippet06 { 
    public static void main(String[] args) { 
        int y = 0;  //Declared variable y of integer type and initialized it with 0.
        int x = y + 10; 
        System.out.println(x); 
    } 
} 
