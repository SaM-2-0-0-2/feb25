class Q14{
    public static void main(String args[]){
        //Declaring variables and storing first 2 numbers of a series
        int a = 0, b = 1; 

        //iterating 10 times to print 10 numbers
        for(int i=0; i<10; i++){
            //Printing the sequence one by one
            System.out.print(a + " ");

            //Programming Logic
            int c = a + b;
            a=b;
            b=c;
        }

    }
}