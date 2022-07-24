package pckg;

public class Boom {
		
	public boolean checkDigit7(int num) {
		while(num != 0 ) {
			if(num%10 == 7)
				return true;
			num /=10;
		}
		
		return false;
		
	}
	
	public boolean checkDevided7(int num) {
		if(num % 7 == 0)
			return true;
		return false;
		
	}
	
	
	public void printBoom() {
		for(int i = 1 ; i <= 100 ; ++i) {
			if(checkDigit7(i) || checkDevided7(i))
				System.out.println("Boom!");
			else
				System.out.println(i);
		}
	}
	
}
