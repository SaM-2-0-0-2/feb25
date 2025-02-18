/*  
    public class Main { 
        public static void main(String[] args) { 
            int a = 10; 
            int b = 5; 
            int result = a + b * 2; 
            System.out.println(result); 
        } 
    }         

    Error: no error
    Explanation: 
    Here, result is affected due to operator precedence. In Java, * (multiplication) operator 
    has higher precedence than + (addition) operator. That's why * operation is performed first 
    and its result is added with third operand. The result is the assigned to variable result 
    and is respectively displayed with the help of print statement.
    
*/

//Fixed Code:
public class Snippet18 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
}  