public class Bitwise{
	public static void main(String[] args){
		int x = 5;
		int res = x<<1; // value of res is double of x
		System.out.println(res); // 0101 -> 1010
		
		int y = 10;
		res = y>>1; // value of res is half of y
		System.out.println(res); // 1010 -> 0101
		
		int z = 2;
		res = z<<3; // value of z gets multiplied by 2^3=8 // res = 2x8=16 
		System.out.println(res); // 0010 -> 0010 000
		
		int a = 64;
		res = a>>3; // value of a gets divided by 2^3=8 // res = 64/8=8 
		System.out.println(res); // 1000 0000 -> 0001 000
		
		int b = -20;
		res = b>>2;
		System.out.println(res); 
		
		int c = -20;
		res = b>>>2; 
		System.out.println(res); 
	}
	
	// 00000000 00000000 00000000 00010100
}	
	// 11111111 11111111 11111111 11101011
	//                                   1
	//   

