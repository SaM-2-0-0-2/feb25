import java.util.Scanner;
public class Q02{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printTable(n,1);
	}		

	public static void printTable(int n, int i){
		if(i==10)
			System.out.println(n + " x " + i + " = " + (n*i));
		else{
			System.out.println(n + " x " + i + " = " + (n*i));
			printTable(n, i+1);
		}
	}

}
