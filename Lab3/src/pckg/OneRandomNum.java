package pckg;

public class OneRandomNum {
	
	private int rand;
	
	public OneRandomNum() {
		// TODO Auto-generated constructor stub
		this.rand = (int)(Math.random() *  101) ;
	}
	
	
	public int getRand() {
		return rand;
	}
	



	@Override
	public String toString() {
		return "OneRandomNum [rand=" + rand + "]";
	}


	public void print() {
		for(int i = 1 ; i < this.rand ; ++i) {
			System.out.print(i + ", ");
		}
		System.out.println(this.rand);
	}
	
	public void generate_new(int max) {
		this.rand = (int)(Math.random() *  (max + 1)) ;
	}
	
	public void generate_new_min_max(int min , int max) {
		this.rand = (int)(min + (Math.random() *  (max + 1))) ;
	}
	
	
	public void print_even() {
		for(int i = 0 ; i < this.rand ; ++i) {
			if(i % 2 == 0)
				System.out.print(i + ", ");
		}
		if(this.rand % 2 == 0)
			System.out.println(this.rand + ", ");
	}
	
	public int count_digit() {
		int count = 0;
		int temp = this.rand;
		while(temp != 0) {
			temp/=10;
			++count;
		}
		return count;
	}
	
	public void print_digit_num() {
		int count = count_digit();
		System.out.println("number of digits is : " + count);
	}
	
	public void print_rigth_digit() {
		System.out.println("the right digit is : " + this.rand % 10);
	}
	
	public void print_left_digit() {
		int dev = (int) Math.pow(10, count_digit()-1);
		
		int digit = this.rand/dev;
		System.out.println("the right digit is : " + digit);
	}
	
	
	public void print_opposite_order() {
		int temp = this.rand;
		System.out.print("the opposite order is : ");
		while(temp != 0) {
			System.out.print(temp%10);
			temp/=10;
		}
		System.out.println();
	}
	
	public void print_digit_sum() {
		int sum = 0;
		
		int temp = this.rand;
		while(temp != 0) {
			
			sum +=temp%10;
			temp /=10;
		}
	
		System.out.println("sum of the digits is : " +sum);
	}
	
	
	public boolean isPalindrome(int num) {
		int temp = num , temp1 = 0;
		while(temp != 0) {
			temp1 *=10;
			temp1 += temp%10;
			temp /= 10;
			
		}

		return (temp1 == num) ? true:false;
	}
	
	public void print_palendome() {
		System.out.print("the num " + this.rand );
		
		if(isPalindrome(this.rand))
			System.out.print(" is");
		else
			System.out.print(" isn't");
		
		System.out.println(" Palendrome");
	}
	
	
}
