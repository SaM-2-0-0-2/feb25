/*
    public class OffByOneDoWhileLoop { 
        public static void main(String[] args) { 
            int num = 1; 
            do { 
                System.out.println(num); 
                num--; 
            } while (num > 0); 
        } 
    }   
    Error: incorrect initialization of identifier to get the expected results.
    Explanation:
    In this code, identifier num is initialized with integer literal 1, this will not yeild the 
    expected result. To get the desired result, identifier num should be assigned with integer
    literal 5.

*/
public class Snippet08 { 
    public static void main(String[] args) { 
        int num = 5; 
        do { 
            System.out.println(num); 
            num--; 
        } while (num > 0); 
    } 
} 
