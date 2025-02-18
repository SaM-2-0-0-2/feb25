/*  
    public class Main { 
        public static void main(String[] args) { 
            while (true) { 
                System.out.println("Infinite Loop"); 
            } 
        } 
    }      

    Error:  Compile time error - infinite loop due to absence of exit condtion.
    Explanation: 
    In Java, any type of loop must have an exit condition to stop its execution.
    Without exit condition, loop will iterate indefinately, giving rise to a run 
    time error. An exit condition is required to avoid the pitfalls of an infinite 
    loop. 
*/

//Fixed Code:
public class Snippet12 { 
    public static void main(String[] args) { 
        int i = 0;
        while (i<=2) { 
            System.out.println("Finite Loop"); 
            i++;
        } 
    } 
}
