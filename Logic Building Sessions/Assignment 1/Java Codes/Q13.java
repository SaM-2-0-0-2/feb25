import java.util.Scanner;

class Q13 {
    public static void main(String[] args){
        //Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter the third number: ");
        float c = sc.nextFloat();

        //Computing average and displaying output
        System.out.println("\nThe average is: " + ((a+b+c)/3));
        
    }    
}
