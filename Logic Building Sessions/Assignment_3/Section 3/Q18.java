public class Q18 {
    public static void main(String[] args) {
        //upper half of pattern
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half of pattern
        for(int i=3; i>=1; i--){
            for(int j=0; j<=3-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*Sample Output:
       *
      ***
     *****
    *******
     *****
      ***
       *  
 */
