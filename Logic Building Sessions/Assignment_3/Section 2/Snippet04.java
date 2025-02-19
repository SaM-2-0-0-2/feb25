public class Snippet04 { 
    public static void main(String[] args) { 
        int i = 1; 
        do { 
            System.out.print(i + " "); 
            i++; 
        } while (i < 5); 
        System.out.println(i); 
    } 
} 
/*
    Output: 1 2 3 4 5

    Dry Run:
        step 01: count=1 
        step 02: count=2
        step 03: count=3
        step 04: count=4
        step 05: count=5
 */