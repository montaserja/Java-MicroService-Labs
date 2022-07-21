package lab2;

public class Q4 {
	
	protected int num1 , num2 , num3;
	
	public Q4() {
		// TODO Auto-generated constructor stub
		this.num1 = (int)(Math.random()*101);
		this.num2 = (int)(Math.random()*101);
		this.num3 = (int)(Math.random()*101);
	}

	@Override
	public String toString() {
		return "Q4 [num1=" + num1 + ", num2=" + num2 + ", num3=" + num3 + "]";
	}
	
	public void print_bigger() {
		if(num1 > num2 && num1 > num3)
			System.out.println("the bigger number is : " + num1);
		else if(num2 > num3)
			System.out.println("the bigger number is : " + num2);
		else
			System.out.println("the bigger number is : " + num3);
	}
	
}
