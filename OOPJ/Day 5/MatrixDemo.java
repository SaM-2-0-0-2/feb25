import java.util.Scanner;
public class MatrixDemo{
	public static void main(String args[]){
		
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		
		setval(arr1);
		System.out.println("---------------");
		setval(arr2);
		System.out.println("---------------");
		matrixadd(arr1, arr2);
		System.out.println("---------------");
		matrixsub(arr1, arr2);
		System.out.println("---------------");
		transpose(arr1);
		System.out.println("---------------");
		transpose(arr2);
		System.out.println("---------------");
		product(arr1, arr2);
		
	}
	
	public static void setval(int[][] arr){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public static void matrixadd(int[][] ar1, int[][] ar2){
		System.out.println("Matrix Addition: ");
		for(int i=0; i<ar1.length; i++){
			for(int j=0; j<ar1[i].length; j++){
				System.out.print(ar1[i][j] + ar2[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void matrixsub(int[][] ar1, int[][] ar2){
		System.out.println("Matrix Subtraction: ");
		for(int i=0; i<ar1.length; i++){
			for(int j=0; j<ar1[i].length; j++){
				System.out.print(ar1[i][j] - ar2[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void transpose(int[][] ar1){
		System.out.println("Transpose of a matrix: ");
		int res[][]= new int[3][3];
		for(int i=0; i<ar1.length; i++){
			for(int j=0; j<ar1[i].length; j++){
				res[i][j] = ar1[j][i];
			}
		}
		for(int i=0; i<res.length; i++){
			for(int j=0; j<res[i].length; j++){
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	
	public static void product(int[][] ar1, int[][] ar2){
		System.out.println("Matrix Dot product: ");
		int[][] res = new int[3][3];
		for(int i=0; i<ar1.length; i++){
			for(int j=0; j<ar1[i].length; j++){
				for(int k=0; k<ar1.length; k++){
					res[i][j] += ar1[i][k] * ar2[k][j];
				}
			}
		}
		for(int i=0; i<res.length; i++){
			for(int j=0; j<res[i].length; j++){
				System.out.print(res[i][j] + "\t");
			}
			System.out.println();
		} 
	}
	
	
	
}