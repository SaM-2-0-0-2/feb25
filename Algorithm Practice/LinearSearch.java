import java.util.Arrays;
public class LinearSearch{
	public static void main(String[] args){
		int arr[] = {23, 43, 65, 82, 4, 2, 12};
		//explicilty write printing function when asked in an interview
		System.out.println(Arrays.toString(arr));
		int target = 2;
		int res = linearSearch(arr, target);
		if(res == -1)
			System.out.println("Element not found");
		else
			System.out.println("Element " + target + " found at index " + res);
	}
	
	static int linearSearch(int[] arr, int target){
		for(int i=0; i<=arr.length; i++){
			if(arr[i] == target) return i;
		}
		return -1;
	}
}


/*
	Time Complexity:
	Best Case = O(1), when element we are searching is present at 0th index.
	Average Case = O(n)
	Worst Case = O(n), when element we are searching for is present at last 
				index or isn't present in an array at all.
				
	Space Complexity: O(1)
*/
