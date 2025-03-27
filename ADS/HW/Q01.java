import java.util.Scanner;
public class Q01{
	static double count=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum: " + calRecur(n));
	}		

	public static double calRecur(int n){
		if(n==1){                  //Base condition
			return count+1;
		}else if(n%2==0){ 
			count -= 1/(float)n;	
		} else{
			count += 1/(float)n;
		}
		return calRecur(n-1);
	}
}

//N -> input
//ans = 1 -(1/2) + 1/3 - (1/4) .... +-(1/N)
// N = 4






