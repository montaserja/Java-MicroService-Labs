package lab2;

public class SalaryRaiser {
	
	private int salary;
	
	public SalaryRaiser() {
		// TODO Auto-generated constructor stub
		this.salary = 5000 + (int)(Math.random()*1001);
	}

	@Override
	public String toString() {
		return "SalaryRaiser [salary=" + salary + "]";
	}
	
	public void raise() {
		int raise = (int) (this.salary * 0.1);
		
		if(raise + this.salary > 6000)
			raise = (int) (this.salary * 0.05);
		
		this.salary +=raise;
	}

}
