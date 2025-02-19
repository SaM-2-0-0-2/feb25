class IncreDecreDemo {
        public static void main(String[] args) {
            int a = 10;
            System.out.println(a);
            System.out.println(++a);
            System.out.println(a++);
            System.out.println(--a);
            System.out.println(a--);
            System.out.println(a);

            int b=20;
            int c = b++ + --b + a++ - a++;
            System.out.println("\n" + c);
        }
}
