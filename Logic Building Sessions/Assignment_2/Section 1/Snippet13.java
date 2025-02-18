/*  
    public class Main { 
        public static void main(String[] args) { 
            String str = null; 
            System.out.println(str.length()); 
        } 
    }       

    Error:  NullPointerException code attempts to call the .length() method on a null reference
    Explanation: 
    String str = null; statement initializes the variable str but does not assign any actual string 
    value. When print statement executes, it tries to access the length of str, which is null. Since 
    null does not have any properties, runtime error (NullPointerException) occurs.
*/

//Fixed Code:
public class Snippet13 { 
    public static void main(String[] args) { 
        String str = "Hello"; //Asigning a non null string
        System.out.println(str.length()); 
    } 
} 