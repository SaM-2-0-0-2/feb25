import java.util.*;
public class Q01{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(findDuplicates(arr));
	}	
	
	//Index Marking - Negation technique	
	public static List<Integer> findDuplicates(int arr[]){
		List<Integer> dups = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			int index = Math.abs(arr[i])-1; // get the zero based index
			if(arr[index]<0){
				dups.add(Math.abs(arr[i]));
			} else{
				arr[index] *= -1;	
			}
		}
		return dups.isEmpty()? Arrays.asList(-1): dups;
	}
}