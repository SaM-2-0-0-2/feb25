public class Q15{
	public static void main(String[] args){
		swapper(10);
		swapper(9);
	}
	
	public static void swapper(int x){ 
	    int evenBits = (x & 0xAAAAAAAA) >> 1; // Get even bits and shift right
        int oddBits = (x & 0x55555555) << 1;   // Get odd bits and shift left
        int res = (evenBits | oddBits);   
		System.out.println(res);
	} 
}	

// 1001
// 10101010 10101010 10101010 10101010
//                                1001
// 00000000 00000000 00000000 00001000
// 00000000 00000000 00000000 00000100

// 01010101 01010101 01010101 01010101
//                                1001
// 00000000 00000000 00000000 00000001
// 00000000 00000000 00000000 00000010
// 00000000 00000000 00000000 00000010
// 00000000 00000000 00000000 00000100
// 00000000 00000000 00000000 00000110




