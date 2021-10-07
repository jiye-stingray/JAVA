package Practice2;

public class Account {
	private String ano; //°èÁÂ¹øÈ£
	private String owner; //°èÁÂÁÖ
	private int balance;	//ÀÜ¾×
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	void transfer(Account target, int amount) {
		if(getBalance() < 0) {
			System.out.println("ÀÜ¾×ÀÌ ¾ø½À´Ï´Ù");
		}
		else {
			
			balance -= amount;
			target.balance += amount;
			
		}
	}
}
