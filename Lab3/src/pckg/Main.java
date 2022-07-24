package pckg;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String line = " /******************************/ ";
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 1" + line + "\n");
		
		HelloWorldPrinter hello = new HelloWorldPrinter();
		hello.print_wihtout_loop();

		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 2" + line + "\n");
		System.out.println("printing with for incremental loop:");
		hello.print_with_for_inc(10);
		
		System.out.println("\nprinting with for deccremental loop:");
		hello.print_with_for_dec(10);
		
		System.out.println("\nprinting with while incremental loop :");
		hello.print_with_while_inc(10);
		
		System.out.println("\nprinting with while deccremental loop :");
		hello.print_with_while_dec(10);

		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 3" + line + "\n");
		
		OneRandomNum one = new OneRandomNum();
		System.out.println(one);
		one.print();
		
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 4" + line + "\n");
		
		TwoRandomNums two = new TwoRandomNums();
		System.out.println(two);
		two.print_all();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 5" + line + "\n");
		
		one.generate_new(100);
		System.out.println(one);
		one.print_even();
		
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 6" + line + "\n");
		
		two.generate_new(1, 500);
		System.out.println(two);
		two.print_numd_devided();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 7" + line + "\n");
		
		Factorial f = new Factorial();
		System.out.println(f);
		f.print_value();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 8" + line + "\n");
		
		System.out.println("inc for loop :");
		System.out.println(f);
		f.print_inc_for();
		
		System.out.println("dec for loop :");
		f.print_dec_for();
		
		System.out.println("inc while loop :");
		f.print_inc_while();
		
		System.out.println("dec while loop :");
		f.print_dec_while();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 9" + line + "\n");
		
		one.generate_new(10000);
		System.out.println(one);
		one.print_digit_num();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 10" + line + "\n");
		
		one.generate_new(10000);
		System.out.println(one);
		one.print_rigth_digit();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 11" + line + "\n");
		
		one.generate_new(10000);
		System.out.println(one);	
		one.print_left_digit();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 12" + line + "\n");
		
		one.generate_new(10000);
		System.out.println(one);
		one.print_opposite_order();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 13" + line + "\n");
		
		one.generate_new(10000);
		System.out.println(one);
		
		one.print_digit_num();
		one.print_left_digit();
		one.print_digit_sum();
		one.print_opposite_order();
		
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 14" + line + "\n");
		
		one.generate_new(100000);
		System.out.println(one);
		
		one.print_palendome();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 15" + line + "\n");
		
		Boom boom = new Boom();
		boom.printBoom();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 16" + line + "\n");
		
		Fibonacci fib = new Fibonacci();
		fib.print_first(1, 40);
		fib.print_random();
		fib.print_random_set();
		
		/*****************************************************************************************/
		
		System.out.println("\n" + line + "Question 17 + 18 + 19" + line + "\n");
		
		 char[] arr = {'a','b','c','a','b','d','r','c'};
		 StringsQues s = new StringsQues();
		 s.printArray(arr);
		 System.out.println("there is " + s.how_many_chars(arr, 'a') + " of char 'a'");
		 
		 s.printArray(arr);
		 System.out.println("there is " + s.how_many_chars(arr, 'a') + " of char 'a' and " + s.how_many_chars(arr, 'c') + " of char 'c'");
		
		 String str = "John Bryce";
		 arr = s.convert_toChar_arr(str);
		 s.printArray(arr);
		 System.out.println("there is " + s.how_many_chars(arr, 'h') + " of char 'h' ");
		 
		 str = "Sara Shara Shir Cameach";
		 arr = s.convert_toChar_arr(str);
		 s.printArray(arr);
		 
		 
	}

}
