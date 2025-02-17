import java.util.Scanner;
class Q19 {
    public static void main(String[] args) {
        //Declaring a variable to store the result
        int res = 1;
        
        //Creating an object of Scanner class
        Scanner Sc =  new Scanner(System.in);
        
        //Taking input from user
        System.out.print("Base: ");
        int b =  Sc.nextInt();
        System.out.print("Power: ");
        int p =  Sc.nextInt();
        
        //Computing the result
        for(int i=1; i<=p; i++){
            res = res * b;
        }
        
        //Displaying the result
        System.out.println(b + " raised to power " + p + " is " + res);
    }
}
