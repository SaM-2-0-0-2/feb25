class IfDemo {
    public static void main(String[] args){
        
        int age = 20;
        if(age==18){
            System.out.println("became eligible for voting");
        } else if(age>18){
            System.out.println("eligible");
        } else {
            System.out.println("Not eligible for voting");
        }

        if(true){
            System.out.println("true");
        } else {
            //will not execute
        }
    }    
}
