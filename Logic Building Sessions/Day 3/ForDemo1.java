public class ForDemo1{
    public static void main(String[] args) {
        int a = 10;
        for(; a>=5; a--){
            System.out.println(a);
        }   

        System.out.println();
        a=10;
        for(System.out.println("Hello"); a>=5; a--){
            System.out.println(a);
        }

        System.out.println();
        a=10;
        for(;a>=5;System.out.println("Hello")){
            System.out.println(a);
            a--;
        }
    }
}