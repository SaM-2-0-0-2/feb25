class DataDem{
	public static void main(String[] args){
		byte b = 127;
		byte B = (byte)130;
		System.out.println(b + " " + B);
		
		short a = 22767;
		short A = -32768;
		short A1 = (short) 33000;
	
		System.out.println(a + " " + A + " " + A1);	
		
		float f = 2.145125514f;
		double d = 3.5412174512121632723135d;
		System.out.println(f + " " + d + " ");
		
		boolean True = true;
		boolean v = false;
		System.out.println(True + " " + v);
		
	}
}