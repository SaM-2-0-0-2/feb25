public class Snippet05{
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 
/*
    Output: 3

    Dry Run:
        step 01: num=1
        step 02: num=1, i=1 
        step 03: num=0, i=1
        step 04: num=0, i=2
        step 05: num=2, i=2
        step 06: num=2, i=3
        step 07: num=-1,i=3
        step 08: num=-1,i=4
        step 09: num=3, i=4
        step 10: num=3, i=5
        step 11: num=3
 */