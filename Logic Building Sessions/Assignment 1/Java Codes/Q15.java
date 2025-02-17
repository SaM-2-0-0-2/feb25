import java.util.Scanner;
class Q15 {
    public static void main(String[] args){
        //Integer variable to store the result
        int res=1;

        //Creating an object of Scanner class
        Scanner S = new Scanner(System.in);

        //Taking input
        System.out.print("Enter a number: ");
        int a = S.nextInt();

        //Factorial logic
        for(int i=1; i<=a; i++){
            res = res * i;
        }

        //Displaying output
        System.out.println("Factorial of " + a + " is " + res);
    }    
}
