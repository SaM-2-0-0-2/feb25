import java.util.Scanner;
class Q12 {
    public static void main(String[] args){
        //a variable for storing result
        long res=0;

        //Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking an input
        System.out.print("Enter a number: ");
        long x = sc.nextLong();

        //storing the original number for printing it later
        long z = x;

        //Cheacking for special cases
        if(x%10==0)
            System.out.println("Error can't reverse a number ending with trailing zeroes");
        //Digit extraction and construction 
        else {
            while(x!=0){
                res = res * 10 + x % 10;
                x = x / 10;
            }
        //Printing Output
        System.out.println("\nThe reverse of " + z + " is " + res);
        }
    }
}
