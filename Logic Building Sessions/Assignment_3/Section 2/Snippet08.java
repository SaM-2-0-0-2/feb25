public class Snippet08 { 
    public static void main(String[] args) { 
        int count = 0; 
        for (int i = 0; i < 4; i++) { 
            count += i++ - ++i; 
        } 
        System.out.println(count); 
    } 
}
/*
    Output: -4

    Dry Run:
        step 01: count=0, i=0 
        step 02: count=0, i=0
        step 03: count=0, i=1 
        step 04: count=-2,i=2
        step 05: count=-2,i=3
        step 06: count=1, i=3
        step 07: count=1, i=4
        step 08: count=-4,i=5
        step 09: count=-4
 */