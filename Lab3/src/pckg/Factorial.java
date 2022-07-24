package pckg;

public class Factorial {
	private int rand;
	
	public Factorial() {
		// TODO Auto-generated constructor stub
		this.rand = (int)(1 + (Math.random() *  (8))) ;
	}

	public int getRand() {
		return rand;
	}

	@Override
	public String toString() {
		return "Factorial [rand=" + rand + "]";
	}
	
	public void print_value() {
		int sum = 1;
		for(int i = 1 ; i <= this.rand ; ++i) {
			sum*=i;
		}
		System.out.println(sum);
	}
	
	public void print_inc_for() {
		
		int sum = 1;
		
		for(int i = 1 ; i < this.rand ; ++i) {
			System.out.print(i + " x ");
			sum*=i;
		}
		sum*=this.rand;
		System.out.println(this.rand + " = " + sum);
	}
	
	public void print_dec_for() {
		
		int sum = 1;
		
		for(int i = this.rand ; i > 1 ; --i) {
			System.out.print(i + " x ");
			sum*=i;
		}
		System.out.println(1 +" = " + sum);
	}
	
	
public void print_inc_while() {
		
		int sum = 1;
		int i = 1;
		while(i < this.rand ) {
			System.out.print(i + " x ");
			sum*=i;
			++i;
		}
		sum*=this.rand;
		System.out.println(this.rand + " = " + sum);
	}
	
	public void print_dec_while() {
		
		int sum = 1;
		int i = this.rand;
		while( i > 1) {
			System.out.print(i + " x ");
			sum*=i;
			--i;
		}
		System.out.println(1 +" = " + sum);
	}
	

}
