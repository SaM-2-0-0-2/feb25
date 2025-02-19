/* 
    public class WrongInitializationForLoop { 
        public static void main(String[] args) { 
            for (int i = 10; i >= 0; i++) { 
                System.out.println(i); 
            } 
        } 
    }   

    Error: loop iterates indefinately due to incorrect loop condition.
    Explanation:
    In this code, loop runs indefinately as code is written in such away that exit 
    condition never occurs (i iterates from 0 to infinity). To solve this error, we 
    need to use post decrement operator with identifier i instead of post increment 
    operator. This will make sure that exit condition is satisfied at some point of 
    time, thereby resolving the error.
*/

//Fixed Code:
public class Snippet05 { 
    public static void main(String[] args) { 
        for (int i = 10; i >= 0; i--) { 
            System.out.println(i); 
        } 
    } 
}