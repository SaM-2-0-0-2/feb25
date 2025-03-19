public class Q06{
	public static void main(String[] args){
		String name = "Sam";
		double d = 340.85;
		ElectricityBill eb = new ElectricityBill();
		double billAmount = calculateBillAmount();
		System.out.println("Customer: " + name + ", Units Consumed: " + d + ", Bill: " + billAmount);
	}
}

class ElectricityBill{
	String customerName;
	double unitsConsumed;
	double billAmount=0;
	
	ElectricityBill(String name, double unitsConsumed){
		this.customerName = name;
		this.unitsConsumed = unitsConsumed;
	}
	
	double calculateBillAmount(){
		if(unitsConsumed>=300){
			billAmount = 1900 + ((unitsConsumed-300)*10);
		} else if(unitsConsumed<300 && unitsConsumed>100){
			billAmount = 500 + ((unitsConsumed-100)*7);
		} else {
			billAmount = unitsConsumed*5;
		}
		return billAmount;
	}
}