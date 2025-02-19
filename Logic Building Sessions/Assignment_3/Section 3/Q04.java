public class Q04{
    public static void main(String[] args){
        int rev=0, num = 1234;
        while(num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Reversal of 1234 is " + rev);
    }
}

//Sample Output: Reversal of 1234 is 4321