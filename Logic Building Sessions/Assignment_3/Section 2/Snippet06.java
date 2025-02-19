public class Snippet06 { 
    public static void main(String[] args) { 
        int x = 5; 
        int y = ++x - x-- + --x + x++; 
        System.out.println(y); 
    } 
}
/*
    Output: 8

    Dry Run:
        step 01: x=5
        step 02: x=6, y=6  
        step 03: x=5, y=0 
        step 04: x=4, y=4
        step 05: x=4, y=8
        step 06: x=5, y=8
 */