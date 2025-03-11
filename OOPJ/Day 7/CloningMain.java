class Cloning implements Cloneable {
    private int[] data;

    public Cloning(int[] values) {
        data = values;
    }

    public void printData() {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    @Override
    public Cloning clone() throws CloneNotSupportedException {
        Cloning cloned = (Cloning) super.clone();
        cloned.data = data.clone(); // Deep Copy for array
        return cloned;
    }
}

public class CloningMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        Cloning obj1 = new Cloning(values);

        try {
            Cloning obj2 = obj1.clone();

            obj1.printData();
            obj2.printData();

            values[0] = 10; // Modify original array

            obj1.printData();
            obj2.printData(); // No change due to deep copy
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
