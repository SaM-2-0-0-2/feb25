public class Q13 {
    public static void main(String[] args) {
        int n=5; // number of rows
        
        //upper half of pattern
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
                if(j<i) System.out.print("*");
            }
            System.out.println();
        }

        //lower half of pattern
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i);
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }    
}   

/*Sample output:
    1 
    2*2 
    3*3*3 
    4*4*4*4 
    5*5*5*5*5 
    5*5*5*5*5 
    4*4*4*4 
    3*3*3 
    2*2 
    1
 */