public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = new int[5];
        float[] f = new float[5];

        System.out.println(a); // prints hashcode not address
        System.out.println(b); // prints hashcode not address
        System.out.println("\n");
        System.out.println(a[0]);
        System.out.println(b[0]);
        System.out.println(f[0]);

        //values will be stored at some memory location in Java
        b[0]=10;
        b[1]=10;
        b[2]=10;
        b[3]=10;
        b[4]=10;

        for (int i = 0; i<5; i++) {
            b[i]=10;
        }

        System.out.println("\n");
        for (int i = 0; i<5; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println("\n");
        int d[][] = {{1,2,3,4},{5,6,7,8}};
        for(int i=0; i<d.length; i++){
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        } 

        int arr[][]=  new int[2][2];
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++){

            }
        }

    
    }
}
