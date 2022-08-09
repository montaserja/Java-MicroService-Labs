package model;

public class Log {
	private long timeStamp;
	private int clientId;
	private String description;
	private float amount;
	
	public Log(long timeStamp ,int clientId, String description , float amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		this.clientId = clientId;
		this.description = description;
		this.timeStamp = timeStamp;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

//	public void setTimeStamp(long timeStamp) {
//		this.timeStamp = timeStamp;
//	}

	public int getClientId() {
		return clientId;
	}

//	public void setClientId(int clientId) {
//		this.clientId = clientId;
//	}

	public String getDescription() {
		return description;
	}

//	public void setDescription(String description) {
//		this.description = description;
//	}

	public float getAmount() {
		return amount;
	}

//	public void setAmount(float amount) {
//		this.amount = amount;
//	}
	
	
	public String getData() {
		return "client id : " + getClientId() + " ,time : " + getTimeStamp() + " ,desc : " + getDescription() + " ,amount : " + getAmount();
	}
	
	

}
