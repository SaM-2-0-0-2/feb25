class Demo2{
	public static void main(String[] args){
		float f = 123.456f;
		//double x = 0x123.456; //malformed floating point literal error
		double d = 123.576;  // default double
		double D = 123.456D; // explicitly double
		double d1 = 1.2e3;    // 1.2  * 10^3 = 1200.0
		System.out.println(f + " " + d + " " + D + " " + d1);
		
		char ch = 0xAAAA;
		char ch1 = '\ua11b'; // \ is required to tell the compiler that specified character is unicode characters
		char ch2 = 'a';
		// char = "a"; // String (double quotes) cannot be assigned to char type identifier.
		// char = '\x' // \x doesn't have any Unicode value.
		String str = "string";
		System.out.println(str + " " + ch2 + " " + ch + " " + ch1);
	}
}	