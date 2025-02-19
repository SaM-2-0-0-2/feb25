/* 
    public class MisplacedForLoopBody { 
        public static void main(String[] args) { 
            for (int i = 0; i < 5; i++) 
                System.out.println(i); 
                System.out.println("Done"); 
        } 
    }    

    Error: Absence of braces causes undesirable results.
    Explanation:
    In Java, control flow statements and decision making statements only execute the 
    next statement unless the statements to be present in loop body are enclosed with 
    the help of opening '{' and closing '}' braces. To get the desired output from this 
    code, we need to enclose both print statements within loop body wuth the help of 
    braces.  
*/

//Fixed Code:
public class Snippet06 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++){ 
            System.out.println(i); 
            System.out.println("Done"); 
        } 
    } 
}