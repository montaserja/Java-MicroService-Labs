package lab1;

public class Printer {
	private String part1 , part2;
	int visitors;
	
	public Printer() {
		part1 = "There will be";
		visitors = 5;
		part2 = "people for dinner.";
	}

	@Override
	public String toString() {
		return part1 + " " + visitors + " " + part2;
	}
	
	public void add_visitors(int v) { // adds visitors v to the previous visitors
		this.visitors += v;
	}
	
	public void update_visitors(int v) { // update the number of visitors to v
		this.visitors = v;
	}
	
}
