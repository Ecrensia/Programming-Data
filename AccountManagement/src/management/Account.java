package management;

public class Account {
	
	//Ŭ�������� ����(���¹�ȣ, ������, �ܾ�)
	private int accountNumber;
	private String accountName;
	private int money;
	
	//������ (�Ű����� 3)
	public Account(int accountNumber, String accountName, int money) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.money = money;
	}
	
	//���¹�ȣ get �޼ҵ�
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//���¹�ȣ set �޼ҵ�
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//������ get �޼ҵ�
	public String getAccountName() {
		return accountName;
	}
	
	//������ set �޼ҵ�
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	//�ܾ� get �޼ҵ�
	public int getMoney() {
		return money;
	}
	
	//�ܾ� set �޼ҵ�
	public void setMoney(int money) {
		this.money = money;
	}
	
}