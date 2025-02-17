import java.util.Scanner;
class Q17 {
    public static void main(String args[]){
        //Creating an object of Scanner class
        Scanner S = new Scanner(System.in);
        
        //Taking input from the user
        System.out.print("Enter a number: ");
        int n = S.nextInt(); 
       
        //Printing first n natural numbers
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }
}
