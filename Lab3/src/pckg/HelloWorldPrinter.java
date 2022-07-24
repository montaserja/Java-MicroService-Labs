package pckg;

public class HelloWorldPrinter {
	
	public void print_wihtout_loop() {
		System.out.println("1. Hello world");
		System.out.println("2. Hello world");
		System.out.println("3. Hello world");
		System.out.println("4. Hello world");
		System.out.println("5. Hello world");
		System.out.println("6. Hello world");
		System.out.println("7. Hello world");
		System.out.println("8. Hello world");
		System.out.println("9. Hello world");
		System.out.println("10. Hello world");
	}
	
	
	public void print_with_for_inc(int num) { // print Hello World using for loop (num) times
		for(int i = 0 ; i < num ; ++i) {
			System.out.println((i+1) + ". Hello world");
		}
	}
	
	public void print_with_for_dec(int num) { // print Hello World using for decremental loop (num) times
		for(int i = num ; i > 0 ; --i) {
			System.out.println((i) + ". Hello world");
		}
	}
		
	public void print_with_while_inc(int num) { // print Hello World using while loop (num) times
		int i = 0;
		while( i < num) {
				System.out.println((i+1) + ". Hello world");
				++i;
			}	
	}
	
	public void print_with_while_dec(int num) { // print Hello World using while decremental loop (num) times
		int i = num;
		while( i > 0) {
				System.out.println((i) + ". Hello world");
				--i;
			}	
	}
	
	
}
