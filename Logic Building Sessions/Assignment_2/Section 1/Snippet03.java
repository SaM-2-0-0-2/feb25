/*  
    public class Main { 
        public static int main(String[] args) { 
            System.out.println("Hello, World!"); 
            return 0; 
        }
    }    

    Error:  Main method must return a value of type void.
    Explanation: 
    In Java, the program starts with the main method, which must be 
    public static void main(String[] args). The JVM looks for this 
    exact method signature. If you change the return type from void 
    to int, the JVM won’t recognize it, and the program won’t run.
*/

//Fixed Code:
public class Snippet03 { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    } 
}