/*  
    public class Main { 
        public static void main(String[] args) { 
            int class = 10; 
            System.out.println(class); 
        } 
    }      

    Error: Keyword 'class' is used as an identifier.
    Explaination: 
    In Java, Keywords are the predefined and reserved words with special meaning 
    for a compiler. These words can't be used as identifiers as doing so means 
    we are trying to assign a new meaning to a keyword which is not allowed.
*/

//Fixed Code:
public class Snippet9 { 
    public static void main(String[] args) { 
        int x = 10; //changed the identifer from class to x
        System.out.println(x); //use of identifer x 
    } 
} 
