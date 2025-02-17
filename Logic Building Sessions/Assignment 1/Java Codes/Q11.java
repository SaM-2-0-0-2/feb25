import java.util.Scanner;
class Q11 {
    public static void main(String[] args){
        //Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking input
        System.out.print("Enter first number: ");
        int x = sc.nextInt();
        System.out.print("Enter second number: ");
        int y = sc.nextInt();
        System.out.print("Enter third number: ");
        int z = sc.nextInt();
        
        //Program Logic
        if(x>y && x>z){
            System.out.println("\nThe largest number is " + x);
        } else if(y>z && y>x){
            System.out.println("\nThe largest number is " + y);
        } else {
            System.out.println("\nThe largest number is " + z);
        }
    }    
}
