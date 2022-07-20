package lab1;

import java.time.LocalTime;

public class Test1 {
	
	private int minutes;
	
	public Test1() {
		this.minutes = 100 + (int)(Math.random()*251);
	}
	
	public int getMinutes() {
		return this.minutes;
	}
	
	public void printMinutes() {
		System.out.println("Movie time = " + minutes + " minutes");
	}
	
	public void printHoures() {
		LocalTime time = LocalTime.of((int)(minutes / 60),(minutes%60));  
		System.out.println("Movie time = " + time + " hours");
	}
}
