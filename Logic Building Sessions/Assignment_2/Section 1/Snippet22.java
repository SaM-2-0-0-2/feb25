/*  
    public class Main { 
        public static void main(String[] args) { 
            static void displayMessage() { 
                System.out.println("Message"); 
            } 
        } 
    }        

    Error: method is defined inside another method
    Explanation: 
    Java doesn't allow declaration of method inside another method. All methods 
    must be defined at the class level for proper scoping and compilation.
    
*/

//Fixed Code:
public class Snippet22 { 
    public static void main(String[] args) { 
        displayMessage();
    } 

    static void displayMessage() { 
        System.out.println("Message"); 
    } 
} 