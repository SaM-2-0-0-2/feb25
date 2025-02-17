import java.util.Scanner;
class Q08 {
    public static void main(String[] args) {
        //Creating an object of scanner class
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.print("Provide First Number: ");
        int a = sc.nextInt();
        System.out.print("Provide Second Number: ");
        int b = sc.nextInt();
        
        //Displaying variable values before swapping
        System.out.println("\nBefore Swapping:");
        System.out.println("First Number: " + a + "\nSecond Number: " + b);
        
        //swapping logic
        a = a + b; // a = a ^ b 
        b = a - b; // b = a ^ b
        a = a - b; // a = a ^ b

        //Displaying variable values after swapping
        System.out.println("\nAfter Swapping:");
        System.out.println("First Number: " + a + "\nSecond Number: " + b);
        
    }
}
