import java.util.Scanner;
import java.util.Arrays;
public class Q04{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] st = str.toCharArray(); 	
		RevString(st, 0, st.length-1);
		
	}
	
	public static void RevString(char[] st, int l, int r){
		if(l>=r){
			System.out.println(Arrays.toString(st));	
		} else {
			char temp = st[l];
			st[l] = st[r];
			st[r] = temp;
			RevString(st, l+1, r-1);
		}
	}
}
// hello 0 4  oellh
// oellh 1 3  olleh
// olleh 2 2