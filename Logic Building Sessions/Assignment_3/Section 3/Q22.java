public class Q22{
    public static void main(String[] args) {
        //upper half of the pattern
        for(int i=5; i>=1; i--){
            for(int j=0; j<(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half of the pattern
        for(int i=2; i<=4; i++){
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* Sample Output:
    *********
    *******
    *****
    ***
    *
    ***
    *****
    *******
*/