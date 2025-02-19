/*
    public class IncorrectLoopUpdate { 
        public static void main(String[] args) { 
            int i = 0; 
            while (i < 5) { 
                System.out.println(i); 
                i += 2; // Error: This may cause unexpected results in output 
            } 
        } 
    }  
    Error: loop increments by 2 instead of 1.
    Explanation:
    In the given code, loop iterates 2 times whereas it is expected to loop 5 times. This 
    happens because i incremrents by 2 after each iteration. To, resolve this i should be
    incremented only by 1 which can be done with the help of post increment operator. 

*/

public class Snippet11
{ 
    public static void main(String[] args) { 
        int i = 0; 
        while (i < 5) { 
            System.out.println(i); 
            i++; //i increments by 1 only 
        } 
    } 
}
