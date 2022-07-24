package pckg;

public class Fibonacci {
	
	private long[] fibo ;
	
	public Fibonacci() {
		// TODO Auto-generated constructor stub
		fibo = new long[50];
		fibFill();
	}
	
	private void fibFill() {
	    this.fibo[0] = 1;
	    this.fibo[1] = 1;
	    for (int i = 2; i < this.fibo.length; i++) {
	        this.fibo[i] = this.fibo[i - 1] + this.fibo[i - 2];
	    }
	}
	
	
	public void print_first(int from , int to) {
		
		System.out.println("Fibonacci from " + from + " to " + to + " : ");
		
		for(int i = from - 1; i < to - 1; ++i) {
			System.out.print( this.fibo[i] + ", ");
		}
		System.out.println(this.fibo[to-1]);
		
	}
	
	public void print_random() {
		int rand = (int)(1 + (Math.random() *  (41)));
		
		System.out.println("fib(" + rand + ") = " + this.fibo[rand - 1]);
	}
	
	public void print_random_set() {
		int num = (int)(10 + (Math.random() *  (50)));
		if(num < 50)
			print_first(1, num);
		else
			System.out.println("random fault");
	}
	
}
