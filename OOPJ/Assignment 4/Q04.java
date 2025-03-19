public class Q04{
	public static void main(String[] args){
		Complex num1 = new Complex(1,-2);
		Complex num2 = new Complex(1.2,-2.989);
		//complex num1 = new complex(Integer.MAX__VAUE,Integer.MIN_VALUE);

		Complex sum = num1.add(num2);
		Complex product = num1.multiply(num2);
		sum.display();
		product.display();
	}
}

class Complex{
	private double real;
	private double imaginary;
	
	Complex(){
		this.real = 0;
		this.imaginary = 0;
	}
	
	Complex(double real){
		this.real = real;
		this.imaginary = 0;
	}
	
	Complex(double real, double imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}
	
	Complex add(Complex other){
		double newreal = this.real + other.real;
		double newimaginary = this.imaginary + other.imaginary;
		return new Complex(newreal, newimaginary);
	}
	
	Complex multiply(Complex other){
		double newreal = (this.real * other.real) - (this.imaginary * other.imaginary);
		double newimaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
		return new Complex(newreal, newimaginary);
	}
	
	void display(){
		System.out.println(this.real + " " + (this.imaginary >= 0 ? "+" : "-") + " " + this.imaginary + "i");
	}
}