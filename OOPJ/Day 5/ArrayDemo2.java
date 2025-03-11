import java.util.Scanner;

class ArrayDemo2{
			
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {11,12,13};
		int c[] = {21,22,23};
		
		int arr[][] = new int[3][];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		for(int ar[] : arr)
		{
			for(int x : ar)
			{
				System.out.print(x+"\t");
			}
			System.out.println();
		}
	}
		
		
}