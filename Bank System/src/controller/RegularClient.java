package controller;

public class RegularClient extends Client {

	public RegularClient(int id, String name, float balance) {
		super(id, name, balance , 0.03f , 0.001f);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + this.getName() +" ,type: Regular Client, id : " + this.getId();
	}
	
	

}
