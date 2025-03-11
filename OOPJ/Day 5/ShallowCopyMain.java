class ShallowCopy {
    private int[] data;

    public ShallowCopy(int[] values) {
        data = values; // Reference assignment
    }

    public void printData() {
        for (int value: data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class ShallowCopyMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        ShallowCopy obj1 = new ShallowCopy(values);
        ShallowCopy obj2 = obj1; // Shallow Copy

        obj1.printData();
        obj2.printData();

        values[0] = 10; // Modify original array

        obj1.printData();
        obj2.printData();
    }
}