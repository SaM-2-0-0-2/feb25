/* 
    public class InfiniteForLoop { 
        public static void main(String[] args) { 
            for (int i = 0; i < 10; i--) { 
                System.out.println(i); 
            } 
        } 
    }  

    Error: run-time error - loop iterates infinately
    Explanation:
    In this code, loop runs indefinately as code is written in such away that exit 
    condition never occurs (i iterates from 0 to -infinity). To solve this error, we 
    need to use post increment operator with identifier i instead of post decrement 
    operator. This will make sure that exit condition is satisfied at some point of 
    time, thereby resolving the error.  



*/

//Fixed Code:
public class Snippet01 { 
    public static void main(String[] args) { 
        for (int i = 0; i < 10; i++) { 
            System.out.println(i); 
        } 
    } 
} 