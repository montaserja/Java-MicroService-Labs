package controller;

import model.Account;
import model.Log;
import view.Logger;

public abstract class Client {
	public final static int ACCOUNTS_NUM = 5;
	private int id;
	private String name ;
	private float balance;
	private Account[] accounts;
	protected final float commisionRate ;
	protected final float interestRate;
	public Logger logger;
	
	public Client(int id , String name , float balance , float commisionRate , float interestRate) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.commisionRate = commisionRate;
		this.interestRate = interestRate;
		this.logger = new Logger("ClientLogger");
		accounts = new Account[ACCOUNTS_NUM];
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	public void addAccount(Account account) {//adds on the first null place
		for(int i = 0 ; i < ACCOUNTS_NUM ; ++i) {
			if(accounts[i] == null) {
				accounts[i] = account;
				this.logger.log(new Log(1, this.getId() , "account update – opened" , account.getBalance()));
				return;
			}
			if(accounts[i].getId() == account.getId())//I'm thinking about reorder accounts when removes one so the null accounts would be at the last of the array (maybe set or map data structure would make the work!!)
				this.logger.log(new Log(1, this.getId() , "account with same id already exist" , account.getBalance()));
		}
		this.logger.log(new Log(1, this.getId() , "account update – can't add account you already have 5 accounts" , account.getBalance()));
		
	}
	
	
	public Account getAccount(int id) {
		for(int i = 0 ; i < ACCOUNTS_NUM ; ++i) {
			if(accounts[i]!=null && accounts[i].getId() == id)
				return accounts[i];
		}
		
		return null;
	}
	
	public void removeAccount(Account account) {
		Account accountToRemove;
		for(int i = 0 ; i < ACCOUNTS_NUM ; ++i) {
			if(accounts[i]!=null && accounts[i].equals(account)) { // removes account and shift right the array 
				accountToRemove = accounts[i];
				this.setBalance(this.getBalance() + accountToRemove.getBalance());
//				accounts[i] = null;
				for(int j = i ; j < ACCOUNTS_NUM-1 ; ++j) {
					accounts[j] = accounts[j+1];
				}
				accounts[ACCOUNTS_NUM-1] = null;
				this.logger.log(new Log(1,account.getId() , "account update – closed" , accountToRemove.getBalance()));
			}
		}
	}
	
	
	public void deposit(float amount) { // ???
		this.balance +=(amount - this.commisionRate);
	}
	
	public void withdraw(float amount) { 
		
		float newBalance = this.balance -(amount + (amount * this.commisionRate));
		if(newBalance < 0) {
			System.out.println("there is no enough money");
		}
		else {
			this.balance = newBalance;
			Bank.updateTotalCommission(Bank.getTotalCommission() + ((amount * this.commisionRate)));
		}
		
		
	}
	
	public void autoUpdateAccounts() {
		for(int i = 0 ; i < ACCOUNTS_NUM ; ++i) {
			if(this.accounts[i] !=null) {
				// need to do
			}
		}
	}
	
	public float getFortune() {
		float sum = this.balance;
		
		for(int i = 0 ; i < ACCOUNTS_NUM ; ++i) {
			if(this.accounts[i] != null)
				sum += this.accounts[i].getBalance();
		}
		
		return sum;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj)
			return true;
		if(obj != null && obj instanceof Client) {
			if(((Client)obj).getId() == this.getId())
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + "]";
	}  
	
	
	
	
	
	
	
	
	

}
