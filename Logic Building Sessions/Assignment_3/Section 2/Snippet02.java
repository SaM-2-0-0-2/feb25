public class Snippet02 { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 
/*
    Output: 11

    Dry Run:
        step 01: total=0, i=5 
        step 02: total=5, i=5
        step 03: total=4, i=5
        step 04: total=4, i=4
        step 05: total=8, i=4
        step 06: total=7, i=4
        step 07: total=7, i=3
        step 08: total=10,i=3
        step 09: total=10,i=2 
        step 10: total=12,i=2
        step 11: total=11,i=2
        step 12: total=11,i=1
        step 13: total=12,i=1
        step 14: total=11,i=1
        step 15: total=11,i=0
 */