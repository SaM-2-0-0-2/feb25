/* 
    public class InfiniteForLoopUpdate { 
        public static void main(String[] args) { 
            for (int i = 0; i < 5; i += 2) { 
                System.out.println(i); 
            } 
        } 
    }   

    Error: loop increments by 2 instead of 1.
    Explanation:
    In the given code, loop iterates 2 times whereas it is expected to loop 5 times. This 
    happens because i incremrents by 2 after each iteration. To, resolve this i should be
    incremented only by 1 which can be done with the help of post increment operator.  
*/

//Fixed Code:
public class Snippet09 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i++) { 
            System.out.println(i); 
        } 
    } 
} 