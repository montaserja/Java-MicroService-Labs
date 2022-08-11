package runner;

import controller.Bank;
import controller.Client;
import controller.GoldClient;
import controller.PlatinumClient;
import controller.RegularClient;
import model.Account;

import java.util.concurrent.ThreadLocalRandom;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String line = "=======================================";
		 String[] names = {"Adams"
				,"Baker"
				,"Clark"
				,"Davis"
				,"Evans"
				,"Frank"
				,"Ghosh"
				,"Hills"
				,"Irwin"
				,"Jones"
				,"Klein"
				,"Lopez"
				,"Mason"
				,"Nalty"};
		
		
		Bank bank = Bank.getInctance();

		
		for(int i = 0 ; i < names.length ;++i) {
			int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
			
			switch(randomNum) {
				case 1:
					bank.addClient( new RegularClient(i,names[i],0));
			    break;
			  case 2:
					bank.addClient( new GoldClient(i,names[i],0));
			    break;
			  case 3:
				  bank.addClient( new PlatinumClient(i,names[i],0));
			break;
			
			default:
				bank.addClient( new RegularClient(i,names[i],0));
			}
		}
		
		System.out.println( "\n" + line + " prints current bank clients " + line);
		bank.printClientList();
		
		
		System.out.println( "\n" + line + " adding random accounts to the clients " + line);

		Client[] clients = bank.getClients();
		
		for(int i = 0 ; i < clients.length ; ++i) {
			float randomBalance ;
			int randomNum = ThreadLocalRandom.current().nextInt(1, 6);
			if(clients[i] != null) {
				for(int j = 0 ; j < randomNum ; ++j) {
					randomBalance = ThreadLocalRandom.current().nextFloat(1000, 20000);
					clients[i].addAccount(new Account(j, randomBalance));
				}
			}
		}
		
		System.out.println( "\n" + line + " bank balance " + line);

		System.out.println(bank.getBalance());
		
		
		System.out.println( "\n" + line + "  withdraw and deposit " + line);
		
		for(int i = 0 ; i < clients.length ; ++i) {
			float randomBalance ;
			int randomNum = ThreadLocalRandom.current().nextInt(1, 3);
			if(clients[i] != null) {
					randomBalance = ThreadLocalRandom.current().nextInt(1000, 5000);
					switch(randomNum) {
						case 2: 
							clients[i].withdraw(randomBalance);
						break;
						default:
							clients[i].deposit(randomBalance);
							
					}
							
			}
		}
		
		
		System.out.println( "\n" + line + " bank balance " + line);

		System.out.println(bank.getBalance());
		
		System.out.println( "\n" + line + " remove client id : 1 " + line);
		bank.removeClient(clients[1]);
		
		System.out.println( "\n" + line + " bank totalCommission" + line);
		System.out.println(Bank.getTotalCommission());

	}

}
