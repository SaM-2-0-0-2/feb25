// Passing Arrays to Methods

class ArrayDemo1{
			
	public static void printArray(int[] arr){
		//Printing elements of an array
		for(int num : arr){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static int[] getArray(){
		return new int[]{10,20,30,40,50};//returning array from the method
	}
	
	public static void main(String args[]){
		//Declared the array
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		//Called function: passing array reference
		printArray(arr);
		
		int[] a = getArray();
		for(int x : a){
			System.out.print(x + " ");
		}
		
	}
		
		
}







