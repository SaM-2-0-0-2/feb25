import java.util.Scanner;
public class Q04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time (0-24)hrs: ");
        int t = sc.nextInt();

        if(t>=5 && t<12){
            System.out.println("Good Morning!");
        } else if(t<0 || t>24) {
            System.out.println("Invalid Time");
        }
    }
}
