import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/): ");
        char ch = sc.next().charAt(0);
        
        switch(ch){
            case '+': System.out.println("Sum: " + (a+b));
                      break;
            case '-': System.out.println("Difference: " + (a-b));
                      break;
            case '*': System.out.println("Product: " + (a*b));
                      break;
            case '/': if(b!=0){
                        System.out.println("Division: " + ((float)a/(float)b));
                      } else {
                        System.err.println("Can't divide a number by Zero");
                      }
                        break;
            default:  System.out.println("Invalid Operand");
                      break;
        }
    }    
}
