public class Q17 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<n; i++){
            for(int j=n; j>=n-i; j--){
                System.out.print(" ");
            }
            for(int j=n-i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*Sample output:
   ***** 
    **** 
     *** 
      ** 
       * 
*/
