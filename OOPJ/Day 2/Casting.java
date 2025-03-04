public class Casting{
	public static void main(String[] args){
		
		// Widening type casting (Implicit type casting)
		// byte -> short -> int -> long -> float -> double
		// OR
		// char -> int -> long -> float -> double
		
		char ch = 'A'; //ASCII A=65
		int i = ch;    //i = 65
		System.out.println(i);
		float f = i;   // f = 65.0
		int num = 100; 
		double d = num; //d =100.0
		System.out.println(f + " " + d);
		
		
		// Narrowing type casting (Explicit type casting)
		//  double -> float -> long -> int -> short -> byte
		double db = 9999.99;
		int number = (int)db;
		System.out.println(db + " lossy conversion " + number); 
		
	}
}