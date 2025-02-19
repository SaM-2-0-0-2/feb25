public class Q11 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c= a++ + --a * b-- - ++b;
        System.out.println("Result: " + c);   
    }
}

//Sample Output: Result: 190
