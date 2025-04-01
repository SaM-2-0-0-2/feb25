public class ITPStack{
	
	Node head;
	static class Node{
		char data;
		Node next;
		Node(char ch){
			this.data = ch;
			next = null;
		}
	}
	
	public static void main(String[] args){
		String infix = "A+B*(C^D-E)";
		System.out.println("Infix Expression: " + infix);
		System.out.println("Postfix Expression: " + infixToPostfix(infix));
	}
	
	public boolean isEmpty(){
		return head==null;	
	}
	
	public void push(char ch){
		Node newNode = new Node(ch);
		if(head == null){
			head = newNode;	
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public char pop(){
		if(head==null) return '\0';
		char ch = head.data;
		head = head.next;
		return ch;
	}
	
	public char peek(){
		if(isEmpty()) return '\0';
		return head.data;
	}
	
	public static int precedence(char ch){
		if(ch=='+' || ch=='-')
			return 1;
		else if(ch=='*' || ch=='/')
			return 2;
		else if(ch=='^')
			return 3;
		else 
			return -1;
	}
	
	public static String infixToPostfix(String str){
		ITPStack stack = new ITPStack();
		StringBuffer result = new StringBuffer();
		
		//traversing the given infix expression from left to right
		for(int i=0; i<str.length(); i++){
			//Assigning current char to ch
			char ch = str.charAt(i);
			
			//check if current character is operand
			if(Character.isLetterOrDigit(ch)){
				result.append(ch); //append operand to string				
			} else if (ch=='('){
				stack.push(ch);  //push ch if it is '('
			} else if (ch==')'){
				while(!stack.isEmpty() && stack.peek()!='('){
					result.append(stack.pop()); //pop every operator inside () and append them to resultant string.
				}
				if(!stack.isEmpty()){
					stack.pop();// pop '(' from the stack without appending it to result string
				}
			} else {
				while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
					result.append(stack.pop()); //popping (from stack) and appending (to result string) the operator based on its precedence. 
				}
				stack.push(ch); //if operator has lower precedence, push it into stack.
			}
		}
		while(!stack.isEmpty()){
			result.append(stack.pop()); //appending remaining operators to result string whilst popping it from the stack.
		} 
		return result.toString(); //result the resultant string by converting StringBuffer object to string
	}
}