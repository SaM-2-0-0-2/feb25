import java.util.Scanner;
class Q10 {
    public static void main(String args[]){
        //Creating an object of scanner class
        Scanner sc = new Scanner(System.in);

        //Taking the input
        System.out.print("Enter a number: ");
        int x = sc.nextInt();

        //Odd or Even Logic
        if(x%2==0)
            System.out.println("The number " + x + " is Even");
        else
            System.out.println("The number " + x + " is Odd");
    }    
}
