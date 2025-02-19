public class Q09 {
    public static void main(String[] args) {
        int large=Integer.MIN_VALUE, num=4825;
        while(num!=0){
            int temp=num%10;
            large=(large>temp?large:temp);
            num = num / 10;
        }
        System.out.println("Largest number in 4825 is " + large);
    }
}

//Sample Output: Largest number in 4825 is 8
