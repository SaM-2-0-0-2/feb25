import java.util.Scanner;
public class Q01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if(a>0){
            System.out.println("Number " + a + " is positive.");
        }
    }    
}