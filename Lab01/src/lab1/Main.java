package lab1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String line = " /******************************/ ";
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 1" + line + "\n");
		Printer p = new Printer();
		System.out.println(p);
		
		/*****************************************************************************************/
		System.out.println("\n" + line + "Question 2" + line + "\n");
		System.out.println("adding visitors by 2 directly : ");
		p.visitors +=2;// increment by + 2 direct
		System.out.println(p);
		
		/*the right way I think by creating a method which called "add_visitors(int)" with takes number of extra visitors to add
		or "update_visitors(int) which updates the number of visitors and make visitors as a private"
		*/  
		System.out.println("adding visitors by 3(add func) : ");
		p.add_visitors(3);
		System.out.println(p);
		System.out.println("update visitors number to 7(update func) : ");
		p.update_visitors(7);
		System.out.println(p);
		
		/*****************************************************************************************/
		
		
		
		
		
	}

}
