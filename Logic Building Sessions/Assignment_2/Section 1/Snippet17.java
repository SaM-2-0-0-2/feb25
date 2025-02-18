/*  
    public class Main { 
        public static void main(String[] args) { 
            int a = 10; 
            int b = 5; 
            int result = a ** b; 
            System.out.println(result); 
        } 
    }        

    Error: Compile-time error - ** operator is not recognized in Java.
    Explanation: 
    Unlike some languages like Python, Java doesn't support ** operator, 
    and thereby it triggers a syntax error. Instead Java provides Math.pow(x,y) 
    method for calculating powers. use cast operator to get result as a integer.
*/

//Fixed Code:
public class Snippet17 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result =(int) Math.pow(a,b); 
        System.out.println(result); 
    } 
} 