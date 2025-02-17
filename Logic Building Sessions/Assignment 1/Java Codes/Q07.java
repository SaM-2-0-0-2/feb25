import java.util.Scanner;
class Q07{
    public static void main(String[] args) {
        //creating an object of scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking input from user
        System.out.print("Input a number: ");
        int a = sc.nextInt();
        
        //iterating from 1 to 10
        for(int i=1; i<=10; i++){
            //Displaying result
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
}
