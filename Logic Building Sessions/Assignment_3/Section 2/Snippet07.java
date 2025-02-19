public class Snippet07 { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = ++a * b-- - --a + b++; 
        System.out.println(result); 
    } 
}
/*
    Output: 49

    Dry Run:
        step 01: a=10, b=5
        step 02: a=11, b=5, result=11
        step 03: a=11, b=5, result=55
        step 04: a=11, b=4, result=55
        step 05: a=10, b=4, result=45
        step 06: a=10, b=4, result=49
        step 07: a=10, b=5, result=49
 */