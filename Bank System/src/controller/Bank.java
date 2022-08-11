package controller;

import model.Log;
import view.Logger;

public class Bank {
	
	private static Bank _instance = null;
	
	public final static int CLIENTS_NUM = 100;
	private Client[] clients;
	private Logger logService;
	private static float totalCommission;
	//account updater
	
	private Bank() {
		// TODO Auto-generated constructor stub
		
		clients = new Client[CLIENTS_NUM];
		logService = new Logger("bankLogger");
		totalCommission = 0;
	
	}
	
	
	public static Bank getInctance() { // Singleton
		if(_instance == null)
			_instance = new Bank();
		
		return _instance;
	}
	
	public float getBalance() {
		float sum = 0;
		for(int i = 0 ; i< CLIENTS_NUM ; ++i) {
			if(this.clients[i] != null)
				sum += this.clients[i].getFortune();
		}
		
		return sum;
	}
	
	public void addClient(Client client) {
		for(int i = 0 ; i< CLIENTS_NUM ; ++i) {
			if(this.clients[i] == null) {
				this.clients[i] = client;
				logService.log(new Log(1, client.getId(), "client added", client.getBalance()));
				return;
			}
		}
		System.out.println("there is no more place for clients in the bank !!");
	}
	
	public void removeClient(Client client) {
		for(int i = 0 ; i< CLIENTS_NUM ; ++i) {
			if(this.clients[i] != null && this.clients[i].equals(client)) {
				
				logService.log(new Log(1, client.getId(), "client removed", this.clients[i].getBalance()));
				this.clients[i] = null;
				return;
			}
		}
		
		System.out.println("there is no client with such id!!");
	}

	public Client[] getClients() {
		return clients;
	}
	
	public void viewLogs() {
		// Implementation later
	}
	
	public void startAccountUpdater() {
		// Implementation later
	}
	
	public static float getTotalCommission() {
		return Bank.totalCommission;
	}
	
	public static void updateTotalCommission(float totalComission) {
		Bank.totalCommission = totalComission;
	}
	
	
	public void printClientList() {
		for(int i = 0 ; i< CLIENTS_NUM ; ++i) {
			if(this.clients[i] != null) {
				System.out.println(this.clients[i]); 
			}
		}
	}

}
