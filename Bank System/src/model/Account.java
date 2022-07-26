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
		
		
		Log log = new Log(System.currentTimeMillis(), id, m, balance);
		Logger.log(log);
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this)
			return true;
		
		if(obj instanceof Account && obj !=null && (((Account)obj).getId()==this.id))
			return true;
		else
			return false;
	}
	
	

}
