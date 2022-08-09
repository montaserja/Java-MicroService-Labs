package view;

import model.Log;

public class Logger {
	private String driverName;
	
	public Logger(String driverName) {
		// TODO Auto-generated constructor stub
		this.driverName = driverName;
	}
	
	
	public static void log(Log l) { // prints Log obj details
		System.out.println(l.getData());
	}
	
	public Log[] getLogs() { // coming soon !!
		return null;
	}
}
