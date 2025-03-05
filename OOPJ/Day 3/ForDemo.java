public class ForDemo{
	public static void main(String args[]){
		for(int i=0; i<=5; i++){
			System.out.print(i);
			if(i==3){
				continue;
			}
			System.out.print(i);
			if(i==4){
				break;
			}
		}
	}
}	