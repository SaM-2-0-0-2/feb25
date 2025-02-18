import java.util.Scanner;
public class Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.print("Enter the width: ");
        int b = sc.nextInt();

        System.out.println("Area of Square: " + (l*b));

    }
}
