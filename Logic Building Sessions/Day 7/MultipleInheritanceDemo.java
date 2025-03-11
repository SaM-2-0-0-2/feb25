interface A{
	default void msgA(){
		System.out.println("A: Method of interface A");
	}
}

interface B{
	default void msgB(){
		System.out.println("B: Method of interface B");
	}
}

class C implements A, B{
	public void msgC(){
		System.out.println("C: Method of class C");
	}
	
}


class MultipleInheritanceDemo{
	public static void main(String args[]){
		
		C c1  = new C();
		c1.msgA();
		c1.msgB();
		c1.msgC();
		
	}	
}