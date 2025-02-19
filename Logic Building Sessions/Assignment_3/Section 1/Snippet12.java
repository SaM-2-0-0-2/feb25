/*
    public class LoopVariableScope { 
        public static void main(String[] args) { 
            for (int i = 0; i < 5; i++) { 
                int x = i * 2; 
            } 
            System.out.println(x); // Error: 'x' is not accessible here 
        } 
    } 
    Error: identifier x is used out of its scope.
    Explanation:
    The code will result in an error because the identifier x is declared inside 
    the for loop and thus is not accessible outside of it. In Java, the scope of 
    a variable declared inside a loop is limited to the loop itself. To fix this
    issue we need to declare variable x before and outside of loop body.

*/

public class Snippet12 { 
    public static void main(String[] args) { 
        int x = 0; //Declared x out of loop body and intialized it with zero.
        for (int i = 0; i < 5; i++) { 
            x = i * 2; 
        } 
        System.out.println(x); 
    } 
}