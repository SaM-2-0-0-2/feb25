public class Q13 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the upper half

        // Print the upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // Print the middle row again
        for (int i = 1; i <= rows; i++) {
            System.out.print(rows);
            if (i < rows) {
                System.out.print("*");
            }
        }
        System.out.println();

        // Print the lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

/*Sample output:
    1 
    2*2 
    3*3*3 
    4*4*4*4 
    5*5*5*5*5 
    5*5*5*5*5 
    4*4*4*4 
    3*3*3 
    2*2 
    1
 */