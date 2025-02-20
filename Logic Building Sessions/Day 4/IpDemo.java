import java.util.Scanner;
public class IpDemo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float f= sc.nextFloat();
        long l = sc.nextLong();
        double d = sc.nextDouble();
        byte b = sc.nextByte();
        short s = sc.nextShort();
      //String STR = sc.nextLine(); //allows spaces
      //String str = sc.next(); //doesn't allow spaces
        char ch = sc.next().charAt(0);
         

        System.out.println("Output: ");
        
        System.out.println(a);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        System.out.println(b);
        System.out.println(s);   
        System.out.println(ch);
    }
}