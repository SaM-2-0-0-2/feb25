
abstract class Shape{
	abstract void draw();
	protected void draw1()
	{
		System.out.println("Draw: Circle");
	}
}

class Circle extends Shape{
	 void draw()
	{
		System.out.println("Draw: Circle");
	}
	
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("Draw: Rectangle");
	}
}

class AbstractionDemo{
	public static void main(String args[]){
		Circle s1 = new Circle();
		s1.draw();
		s1.draw1();
		
		
		Shape s2 = new Rectangle();
		s2.draw();
		
		Rectangle s3 = new Rectangle();//Normal class execution
		s2.draw();
		
		//Shape s4 = new Shape();//Error: abstraction
		//s4.draw();
		
	}	
}