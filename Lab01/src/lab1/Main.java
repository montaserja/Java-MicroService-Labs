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
		
		System.out.println("\n" + line + "Question 3" + line + "\n");
		Test t1 = new Test();
		System.out.println("t1 : " + t1);
		System.out.println("the sum of the numbers = " + t1.sum());
		System.out.println("the average value = " + t1.average());
		System.out.println("remainder a by 10 = " + t1.remainA());
		System.out.println("remainder b by 10 = " + t1.remainB());
		System.out.println("the rec area = " + t1.recArea());
		
		/*****************************************************************************************/

		System.out.println("\n" + line + "Question 4" + line + "\n");
		
		Test1 t2 = new Test1();
		t2.printMinutes();
		t2.printHoures();
		
		/*****************************************************************************************/

		System.out.println("\n" + line + "Question 5" + line + "\n");
		
		BiggerOfTwoRandom b = new BiggerOfTwoRandom();
		System.out.println(b);
		System.out.println("the bigger number is : " + b.biggerNum());
		
	}

}
