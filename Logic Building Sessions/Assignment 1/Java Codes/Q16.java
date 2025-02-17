import java.util.Scanner;
class Q16 {
    public static void main(String[] args){
        //Variable to check if number has other divisors
        int flag=0;
        
        //Creating an object of scanner class
        Scanner sc = new Scanner(System.in);

        //Taking Input 
        System.out.print("Enter a number: ");
        int m = sc.nextInt();

        //iterating from 2 to n
        for(int i=2; i<m; i++){
            //checking if given number has more than 2 factors
            if(m%i==0){
                flag=1;
                System.out.println("The number " + m + " is not Prime.");
                break;
            } 
        }

        //Printing output when number is prime
        if(flag==0){
            System.out.println("The number " + m + " is Prime.");
        } 

    }
}
