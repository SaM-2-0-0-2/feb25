public class SwitchDemo {
    public static void main(String[] args) {
        short a = 20;
        switch(a){
            case 10:
                System.out.println(10);
                break;
            case 20:
                System.out.println(20);
                break;
            case 30:
                System.out.println(30);
                break;
            default:
                System.out.println(" Default Case");
                break;
        }

        String b = "Shriram";
	    switch(b){
		    default:
			    System.out.println(" Default Case");
			    break;
		    case "Shriram":
			    System.out.println(10);
			    break;
		    case "c":
			    System.out.println(20);
			    break;
		    case "10":
			    System.out.println(30);
			    break;	
	    }

        System.out.println("Outside Switch");
	
    }
}
