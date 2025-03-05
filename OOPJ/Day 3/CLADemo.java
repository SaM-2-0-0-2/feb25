public class CLADemo{
	public static void main(String args[]){
		for(int i=0; i<=2; i++){ //throws error if 3 elements are not provided as command line arguments during execution
			System.out.print(args[i]+ " ");
		}
	}
}