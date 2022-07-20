package lab1;

public class BiggerOfTwoRandom {
	private int a , b;
	
	public BiggerOfTwoRandom() {
		this.a = (int)(Math.random()*101);
		this.b = (int)(Math.random()*101);
	}
	
	public int biggerNum() {
		return (a>b) ? a:b;
	}

	@Override
	public String toString() {
		return "BiggerOfTwoRandom [a=" + a + ", b=" + b + "]";
	}
	
	
}
