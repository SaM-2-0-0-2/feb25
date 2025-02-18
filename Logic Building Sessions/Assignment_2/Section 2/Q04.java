import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        float discount=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amt = sc.nextInt();
        sc.nextLine();
        if(amt>=1000){
            discount = ((20/100f) * (float)amt);
        } else if(amt>=500 && amt<=999){
            discount = ((10/100f)) * (float)amt;
        } else if (amt<500 && amt>0){
            discount = ((5/100f)* (float)amt);
        } else {
            System.out.println("Invalid Input");
        }

        System.out.print("Has Membership? (Yes/No): ");
        String s = sc.nextLine();
        
        if(s.equals("Yes")){
            discount = discount + ((5/100f)* (float)amt);
        } 

        System.out.printf("Discount: %.2f%n",discount);
        
    }    
}
