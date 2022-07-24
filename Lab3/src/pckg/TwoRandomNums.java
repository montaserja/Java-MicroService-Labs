package pckg;

public class TwoRandomNums {
	int min;
	int max;
	
	public TwoRandomNums() {
		// TODO Auto-generated constructor stub
		this.min = (int)(Math.random() *  101) ;
		this.max = (int)(Math.random() *  101) ;
		check();
	}
	
	private void check() {
		if(this.min > this.max) {
			int temp = this.max;
			this.max = this.min;
			this.min = temp;
		}
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

	@Override
	public String toString() {
		return "TwoRandomNums [min=" + min + ", max=" + max + "]";
	}
	
	public void generate_new(int minVal ,int maxVal) {
		this.min = (int)(minVal + (Math.random() *  (maxVal + 1))) ;
		this.max = (int)(minVal + (Math.random() *  (maxVal + 1))) ;
		check();
	}
	
	
	
	public void print_all() {
		for(int i= this.min ; i < this.max ; ++i) {
			System.out.print(i + ", ");
		}
		System.out.println(this.max);
	}
	
	
	public void print_numd_devided() {
		for(int i = 0; i < this.max ; ++i) {
			if(i % this.min == 0)
				System.out.print(i + ", ");
		}
		if(this.max % this.min == 0)
			System.out.println(this.max);
	}
	

}
