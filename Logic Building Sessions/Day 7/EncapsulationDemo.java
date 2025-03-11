
class Employee{
	private int id;
	private String name;
	
	//Getter method
	public String getName(){
		 return name;
	}
	//Setter method
	public void setName(String name){
		this.name = name;
	}
}
public class EncapsulationDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		e.setName("Shriram");
		System.out.println("Employee name = "+e.getName());
		//System.out.println(id); //Error: private variable can't be accessed out of the class in which it is declared.
	}	
}
