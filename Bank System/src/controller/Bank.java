package controller;

import model.Log;
import view.Logger;

public class Bank {
	
	public final static int CLIENTS_NUM = 100;
	private Client[] clients;
	private Logger logService;
	//account updater
	
	public Bank() {
		// TODO Auto-generated constructor stub
		
		clients = new Client[CLIENTS_NUM];
		logService = new Logger("bankLogger");
	
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
	
	public void removeClient(int id) {
		for(int i = 0 ; i< CLIENTS_NUM ; ++i) {
			if(this.clients[i] != null && this.clients[i].getId() == id) {
				
				logService.log(new Log(1, id, "client removed", this.clients[i].getBalance()));
				this.clients[i] = null;
				return;
			}
		}
		
		System.out.println("there is no client with such id!!");
	}
	

}
