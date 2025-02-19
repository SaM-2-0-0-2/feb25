public class Snippet01 { 
    public static void main(String[] args) { 
        for (int i = 1; i <= 3; i++) { 
            for (int j = 1; j <= 2; j++) { 
                System.out.print(i + " " + j + " "); 
            } 
            System.out.println(); 
        } 
    } 
}
/*
    Output:
        1 1 1 2 
        2 1 2 2 
        3 1 3 2

    Dry Run:
        step 1: i=1, j=1
        step 2: i=1, j=2
        step 3: i=2, j=1
        step 4: i=2, j=2
        step 5: i=3, j=1
        step 6: i=3, j=2
 */