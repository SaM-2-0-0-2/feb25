class SwitchDemo{
	public static void main(String[] args){
		int ch = 97;
		switch(ch){
			case 'a': System.out.println("a");
					  break;
			case 'b': System.out.println("b");
					  break;
			case 015: System.out.println("octal");
					  break;
			case 0xabcd: System.out.println("hexadecimal");
					  break;
			case 100: System.out.println("100");
					  break;
			default: System.out.println("default case");
					  break; 
		}
	}
}