/*  
    public class Main { 
        public static void main(String[] args) { 
            int[] arr = {1, 2, 3}; 
            System.out.println(arr[5]); 
        }
    }          

    Error:  Code is trying to access index 5 of array containg only 3 elements.
    Explanation: 
    Array indexing starts from zero and ends at n-1, n being the size of an array.
    In this snippet, through arr[5] we are trying to access index 5 but given array 
    only has 3 indices, giving rise to runtime error. To resolve this issue, statement 
    should only try to access the index within boundry of an array. 
*/

//Fixed Code:
public class Snippet11 { 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3}; 
        System.out.println(arr[2]); //Accessing index inside the bounds of array 
    }
} 
