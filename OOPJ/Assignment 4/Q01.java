import java.util.Scanner;
//RoomDemo class from Question
public class Q01{ 							
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Room[] room = new Room[3];
		float h,w,b;
		for( int i=0; i<room.length; i++){
			System.out.print ("Enter width, breadth and height of a room: ");
			w = sc.nextFloat();
			h = sc.nextFloat();
			b = sc.nextFloat();
			room[i] = new Room(h, w, b);
		}
		
		for(Room r : room){
			r.display();
			System.out.printf("\t Volume: %.2f%n",r.findVolume());
		}
		
		sc.close();
	}
}

class Room{
	private float height, width, breadth;	
	private double volume;
	
	Room(float h, float w, float b){
		this.height = h;
		this.width = w;
		this.breadth = b;
	}
	
	double findVolume(){
		this.volume = height*breadth*width;
		return volume;
	}
	
	void display(){
		System.out.print("Room Dimensions: " + width + ", " + breadth + ", " +  height);
	}
}

/* Sample Output:
	Enter width, breadth and height of a room: 5.3 63.9 8
	Enter width, breadth and height of a room: 8.3 9.6 5
	Enter width, breadth and height of a room: 5.2 3 6
	Room Dimensions: 5.3, 8.0, 63.9  Volume: 2709.36
	Room Dimensions: 8.3, 5.0, 9.6   Volume: 398.40
	Room Dimensions: 5.2, 6.0, 3.0   Volume: 93.60
*/