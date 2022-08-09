package controller;

import model.Account;
import model.Log;
import view.Logger;

public class Client {
	public final static int ACCOUNTS_NUM = 5;
	private int id;
	private String name ;
	private float balance;
	private Account[] accounts;
	private float commisionRate ;
	private float interestRate;
	public Logger logger;
	
	public Client(int id , String name , float balance) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.commisionRate = 0;
		this.interestRate = 0;
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
	
	public void removeAccount(int id) {
		Account accountToRemove;
		for(int i = 0 ; i < ACCOUNTS_NUM ; ++i) {
			if(accounts[i]!=null && accounts[i].getId() == id) { // removes account and shift right the array 
				accountToRemove = accounts[i];
				this.setBalance(this.getBalance() + accountToRemove.getBalance());
//				accounts[i] = null;
				for(int j = i ; j < ACCOUNTS_NUM-1 ; ++j) {
					accounts[j] = accounts[j+1];
				}
				accounts[ACCOUNTS_NUM-1] = null;
				this.logger.log(new Log(1,this.getId() , "account update – closed" , accountToRemove.getBalance()));
			}
		}
	}
	
	
	
	

}
