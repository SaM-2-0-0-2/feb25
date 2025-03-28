import java.util.Arrays;
public class Q03{
	public static void main(String[] args){
		int arr[] = {-12,11,-13,-5,6,-7,5,-3,-6};
		System.out.println(Arrays.toString(arr));
		shiftNegatives(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void shiftNegatives(int[] arr){
		int track = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]<0){
				int temp = arr[track];
				arr[track] = arr[i];
				arr[i] = temp;
				track++;
			}
		}
	}
}
/* Sample Output:
	[-12, 11, -13, -5, 6, -7, 5, -3, -6]
	[-12, -13, -5, -7, -3, -6, 5, 6, 11]
*/