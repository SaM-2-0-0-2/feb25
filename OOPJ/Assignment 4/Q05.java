import java.util.Scanner;

public class Q05{
	public static void main(String args[]){
		BMICalculator bc = new BMICalculator();
		System.out.println("Enter your height(in m) and weight(in Kg): ");
		bc.setval();
		double arr[] = bc.getval();
		System.out.println("Height: " + arr[0] + " Weight: " + arr[1]);
		double ans = bc.calculateBMI();
		bc.display(ans);	
	}
}

class BMICalculator{
	private double height, weight;
	
	BMICalculator(){
		this.height = 0;
		this.weight = 0;
	}
	
	void setval(){
		Scanner sc = new Scanner(System.in);
		this.height = sc.nextDouble();
		this.weight = sc.nextDouble();	
	}
	
	double[] getval(){
		return new double[]{height, weight};  
	}
	
	double calculateBMI(){
		double BMI = weight/ (height*height);
		return BMI;
	}
	
	void display(double ans){
		System.out.printf("BMI: %.2f",ans);
	}
}