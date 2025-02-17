import java.util.Scanner;
class Q18 {
    public static void main(String[] args){
        //Creating an object of Scanner class
        Scanner S = new Scanner(System.in);

        //Taking input
        System.out.print("Enter temperature in Celsius: ");
        float c =  S.nextInt();

        //conversion from celsius to fahrenheit
        float f = (float) (c * 9/5) + 32;

        //Displaying result
        System.out.println(c + "°C is equal to " + f + "°F");
    }    
}
