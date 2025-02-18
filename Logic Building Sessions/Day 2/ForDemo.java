class ForDemo {
    public static void main(String[] args) {
        for(int a=10; a>=5; a--){
            System.out.println(a);
        }

        System.out.println("");

        for(int a=10, b=20; (a>=5)&&(b>=15); a--,b--){
            System.out.println(a + " " + b);
        }

    }
}