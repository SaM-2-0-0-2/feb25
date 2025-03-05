public class LogicalOpDemo{
	public static void main(String args[]){
		int a=7, b=9;
		if(a==7 && b==9){
			System.out.println("1");
		}
		
		if(a<b || a==b){ //short circuit evaluation
			System.out.println("2");
		}
		
		boolean check = false;
		if(!check){
			System.out.println("3");
		}
	}
}	