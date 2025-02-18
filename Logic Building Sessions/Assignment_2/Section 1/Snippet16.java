/*  
    public class Main { 
        public static void main(String[] args) { 
            int num = 10; 
            double result = num / 4; 
            System.out.println(result); 
        } 
    }        

    Error:  No errors occur but code gives undesirable result.
    Explanation: 
    In the expression num/4, division is performed using integer division.
    Since both num and 4 are integers, Java performs integer division, resulting 
    in 2. This result is cast to a double, producing 2.0. Variable num should be 
    cast to double before division is performed to produce a correct result.        
*/

//Fixed Code:
public class Snippet16 { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = (double)num / 4; 
        System.out.println(result); 
    } 
}  