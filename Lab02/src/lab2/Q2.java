package lab2;

public class Q2 extends Q1 {

	

	@Override
	public String toString() {
		return "Q2 [rand=" + rand + "]";
	}
	
	@Override
	public void bingo() {
		// TODO Auto-generated method stub
		super.bingo();
		System.out.println(((rand % 2) == 0 ) ? "Even":"Odd");
	}
	
}
