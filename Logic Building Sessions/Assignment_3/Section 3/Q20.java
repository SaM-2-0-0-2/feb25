public class Q20 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(n-j);
                if(j<i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}



/*Sample Output:
    5
    5*4
    5*4*3
    5*4*3*2
    5*4*3*2*1
*/