import java.util.Scanner;
public class Q03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Box[] box = new Box[2];
		for(int i=0; i<box.length; i++){
			System.out.print("Enter the dimensions of box: ");
			int h = sc.nextInt();
			int w = sc.nextInt();
			int b = sc.nextInt();
			box[i] = new Box(h,w,b);
		}
		for(Box b: box){
			b.display();;
		}
		sc.close();
	}
}


class Box{
	int h, w, b;
	Box(int h, int w, int b){
		this.h = h;
		this.w = w;
		this.b = b;
	}
	
	double getVolume(){
		double volume=h*b*w;
		return volume;
	}
	
	double getArea(){
		double area=2*((w*b)+(b*h)+(h*w));
		return area;
	}
	
	void display(){
		System.out.println("Volume: " + getVolume());
		System.out.println("Area: " + getArea());	
	}
}