class DeepCopy {
    private int[] data;

    public DeepCopy(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            data[i] = values[i];
        }
    }
	
	void changenCopy(){
		data[0]=100;	
	}

    public void printData() {
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

public class DeepCopyMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3};
        DeepCopy obj = new DeepCopy(values);
        DeepCopy obj2 = new DeepCopy(values); // Deep Copy
	
        obj.printData();
        obj2.printData();
		obj.changenCopy();
        values[0] = 10; // Modify original array
		for(int i=0; i<values.length; i++){
			System.out.print(values[i] + " ");
		}
		System.out.println();
        obj.printData();
        obj2.printData();
    }
}