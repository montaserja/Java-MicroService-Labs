package model;

import view.Logger;

public class Account {
	
	private int id;
	private float balance;
	
	public Account(int id , float balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		String m;
		if(this.getBalance() < balance)
			m = "client balance updated – deposit";
		else
			m = "client balance updated – withdraw";

		this.balance = balance;
		
		
		Log log = new Log(1, id, m, balance);
		Logger.log(log);
	}
	
	

}
