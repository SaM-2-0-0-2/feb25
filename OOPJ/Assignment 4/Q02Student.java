import java.util.Scanner;
public class Q02Student{
	private static String name;
	private static int[] marks =  new int[3];
	
	static void setval(){
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		for(int i=0; i<marks.length; i++){
			marks[i]=sc.nextInt();
		}
	}
	
	static float[] compute(){
		int total=0;
		float average;
		for(int i=0; i<marks.length; i++){
			total += marks[i];
		}
		average = total/marks.length;
		return new float[]{total,average};
	}
	
	static void display(float total, float average){
		System.out.println("Total: " + total + " Average: " + average);
	}
	
	public static void main(String[] args){
		setval();
		float[] arr = compute();
		display(arr[0], arr[1]);
	}
}

