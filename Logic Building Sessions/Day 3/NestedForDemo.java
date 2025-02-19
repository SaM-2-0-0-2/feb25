class NestedForDemo{
	public static void main(String[] args) {
		for(int a=10; a>=5; a--){
			for(int b=10; b>=5; b--){
				System.out.println(a);
			}
		}

		System.out.println();

		for(int a=10; a>=5; a--){
			for(int b=10; b>=5; b--){
				System.out.println(b);
			}
		}

		System.out.println();

		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println();

		int count=0;
		for(int i=0; i<=5; i++){
			for(int j=0; j<=i; j++){
				System.out.print(++count + " ");
			}
			System.out.println();
		}

		System.out.println();

		count=64;
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print((char)++count  + " ");
			}
			System.out.println();
		}

		System.out.println();
		for(int i=0; i<5; i++){
			for(int j=0; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}