package lab2;

public class Q1 {
	
	protected int rand;
	
	public Q1() {
		this.rand = (int)(Math.random()*101);
	}
	
	public void bingo() {
		if(this.rand > 50)
			System.out.println("Big");
		else if(this.rand < 50)
			System.out.println("Small");
		else
			System.out.println("Bingo!");
	}

	@Override
	public String toString() {
		return "Q1 [rand=" + rand + "]";
	}
	
	
	
}
