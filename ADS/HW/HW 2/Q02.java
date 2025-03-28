public class Q02{
	public static void main(String[] args){
		int nums[] = {1,2,3,5,8,11,15,18};
		int n = 18;
		int x = BinarySearch(nums, n);
		if(x==-1){
			System.out.println("Element doesn't exist");	
		} else {
			System.out.println("Element " + n + " found at index: " + x);
		}
	}
	
	
	public static int BinarySearch(int[] arr, int target){
		int low = 0, high = arr.length-1;
		while(low<=high){
			int mid = high - (high-low)/2;
			if(arr[mid]==target){
				return mid;
			} else if(arr[mid]>target){
				high = mid-1;
			} else {
				low = mid+1;
			}
		}		
		return -1;
	}
}