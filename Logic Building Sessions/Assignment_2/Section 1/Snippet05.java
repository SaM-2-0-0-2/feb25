/*  
    public class Main { 
        public static void main(String[] args) { 
            System.out.println("Main method with String[] args"); 
        } 
        public static void main(int[] args) { 
            System.out.println("Overloaded main method with int[] args"); 
        } 
    }      

    Error:  There is no error in this code.
    Explaination: 
    There are two main methods:
      1. main(String[] args) – This is the standard method that the JVM looks for and runs 
         when the program starts.
      2. main(int[] args) – This is an overloaded version of main, but the JVM won't call it 
         automatically. It can only be used if called explicitly from within the program.
    There are no errors as program will always run the main(String[] args) method by default.
*/

//Code:
public class Snippet05 { 
    public static void main(String[] args) { 
        System.out.println("Main method with String[] args"); 
    } 
    public static void main(int[] args) { 
        System.out.println("Overloaded main method with int[] args"); 
    } 
} 
