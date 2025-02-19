public class Q07 {
    public static void main(String[] args) {
        int res=0, num=9876, temp=num;
        while(num!=0){
            res += (num%10);
            num= num / 10;
        }
        System.out.println("Sum of digits in " + temp + " is " + res);
    }
}

//Sample Output: Sum of digits in 9876 is 30