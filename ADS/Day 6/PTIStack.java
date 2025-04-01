public class PTIStack{
	Node head;
	Static class Node{
		char data;
		Node next;
		Node(char data)	
	}
	
	
	
	public static void main(String[] args){
		String postfix = "ABCD^E-*+";
		System.out.println("Postfix Expression: " + postfix);
		System.out.println("Infix Expression: " + postfixToInfix(postfix));	
	}
}