import java.util.Scanner;
public class Q03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<2)
			System.out.println("At least numbers are required");
		else
			System.out.println(display(num));
	}
	
	public static String display(int n){
		if(n==2){
			return "GCD(int, int)";
		} else {
			return "GCD(int, " + display(n-1) + ")";
		}
	}
}