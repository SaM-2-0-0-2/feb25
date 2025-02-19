public class Snippet03 { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
/*
    Output: 0 1 2 3

    Dry Run:
        step 01: count=0 
        step 02: count=1
        step 03: count=2
        step 04: count=3
 */