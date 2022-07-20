package lab1;

public class Test {
	
	private int a , b;
	
	public Test() {
		this.a = (int)(Math.random()*101);
		this.b = (int)(Math.random()*101);
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int sum() {
		return a+b;
	}
	
	public double average() {
		return (double)(a+b)/2;
	}
	
	public int remainA() {
		return a % 10;
	}
	public int remainB() {
		return b % 10;
	}
	
	public int recArea() {
		return a*b;
	}
	
	

}
