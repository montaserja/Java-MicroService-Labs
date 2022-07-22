package lab2;

public class TaxCalculator {
	
	public void calculate(int salary) {
		if(salary < 0)
			return;
		
		double taxRate;
		int tax;
		if(salary < 23000)
			taxRate = 0.1;
		else if(salary < 50000)
			taxRate = 0.2;
		else if(salary < 100000)
			taxRate = 0.3;
		else
			taxRate = 0.4;
		
		tax = (int) (salary * taxRate);
		System.out.println("salary before tax : " + salary);
		System.out.println("the tax is : " + tax);
		System.out.println("salary after tax : " + (salary - tax));
		
		
	}
}
