package controller;

public class GoldClient extends Client {

	public GoldClient(int id, String name, float balance) {
		super(id, name, balance , 0.02f , 0.003f);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "name: " + this.getName() +" ,type: Gold Client, id : " + this.getId();
	}

}
