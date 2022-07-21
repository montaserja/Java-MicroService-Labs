package lab2;

public class Q5 extends Q4{

	public void print_smaller() {
		if(num1 < num2 && num1 < num3)
			System.out.println("the smaller number is : " + num1);
		else if(num2 < num3)
			System.out.println("the smaller number is : " + num2);
		else
			System.out.println("the smaller number is : " + num3);
	}
}
