import java.util.Scanner;
class Q9 {
    public static void main(String[] args){
        //declaring variable to store result
        float res;

        //Declaring constant variable pie
        final float pie = 3.14159f;
        
        //Creating object of scanner class
        Scanner sc = new Scanner(System.in);

        //Taking radius of circle as input
        System.out.print("Enter the radius of circle: ");
        int r = sc.nextInt();

        //Displaying area of circle as output
        System.out.println("Area of the circle: " + (pie*r*r));
    }    
}
