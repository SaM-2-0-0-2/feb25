/* 
    public class DoWhileIncorrectCondition { 
        public static void main(String[] args) { 
            int num = 0; 
            do { 
                System.out.println(num); 
                num++; 
            } while (num > 0);     
        } 
    }   

    Error: run-time error - loop iterates infinately
    Explanation:
    In this code, loop runs indefinately as code is written in such away that exit 
    condition never occurs (i iterates from 0 to infinity). To solve this error, we 
    to change the condition in a way that it is satisfied at some point of time, 
    thereby resolving the error. 
    The Do-while loop in Java, is executed atleast once before checking the condtion.
*/

//Fixed Code:
public class Snippet03 { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num == 0); 
    } 
} 
