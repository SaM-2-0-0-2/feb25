public class Q05{
    public static void main(String[] args){
        int a=0, b=1;
        for(int i=1;i<22;i++){
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

//Sample Output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 