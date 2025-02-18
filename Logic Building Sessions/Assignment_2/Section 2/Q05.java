import java.util.Scanner;
public class Q05 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int s3 = sc.nextInt();

        switch ((s1>40)?1 : 0) {
            case 0:
                count++;
            default:
                switch ((s2 > 40)?1 : 0) {
                    case 0:
                        count++;
                    default: switch ((s3>40)?1 : 0) {
                            case 0: count++;
                        }
                }
        }

        if (count == 0) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed in " + count + " subject(s)");
        }

        sc.close();
    }
}
