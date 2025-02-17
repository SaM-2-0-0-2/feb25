import java.util.Scanner;
class Q20 {
    public static void main(String[] args) {
        //Declaring a variable to store the results
        long res=0;

        //Creating an object of Scanner class
        Scanner sc = new Scanner(System.in);

        //Taking an input from the user
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        
        //Storing the input  number in another variable for result
        long temp = num;

        //Computing result
        while(num!=0){
            res++;
            num=num/10;
        }
        
        //Displaying the result
        System.out.println("The number " + temp + " has " + res + " digits.");
    }   
}
