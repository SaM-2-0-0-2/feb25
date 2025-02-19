public class Q06 {
    public static void main(String[] args) {
        int count=0, num=2;
        while(count<5){
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime =false;
                    break;
                } 
            }

            if(isPrime){
                count++;
                System.out.print(num + " ");
            }
            num++;
        }
    }
}

//Sample Output: 2 3 5 7 11