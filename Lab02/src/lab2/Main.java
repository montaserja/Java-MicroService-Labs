package lab2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String line = " /******************************/ ";
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 1" + line + "\n");
		Q1 q1 = new Q1();
		System.out.println(q1);
		q1.bingo();
		
		/*****************************************************************************************/

		System.out.println("\n" + line + "Question 2" + line + "\n");
		
		Q2 q2 = new Q2();
		System.out.println(q2);
		q2.bingo();
		
		/*****************************************************************************************/

		System.out.println("\n" + line + "Question 3" + line + "\n");
		
		SalaryRaiser s = new SalaryRaiser();
		System.out.println(s);
		s.raise();
		System.out.println(s);
		
		/*****************************************************************************************/

		System.out.println("\n" + line + "Question 4" + line + "\n");

	
	}

}
