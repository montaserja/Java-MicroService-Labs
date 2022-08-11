package controller;

public class PLatinumClient extends Client {

	public PLatinumClient(int id, String name, float balance) {
		super(id, name, balance , 0.01f , 0.005f);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Platinum Client, id : " + this.getId();
	}
}
