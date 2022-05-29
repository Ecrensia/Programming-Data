package management;

public class Account {
	
	//클래스변수 선언(계좌번호, 계좌주, 잔액)
	private int accountNumber;
	private String accountName;
	private int money;
	
	//생성자 (매개변수 3)
	public Account(int accountNumber, String accountName, int money) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.money = money;
	}
	
	//계좌번호 get 메소드
	public int getAccountNumber() {
		return accountNumber;
	}
	
	//계좌번호 set 메소드
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	//계좌주 get 메소드
	public String getAccountName() {
		return accountName;
	}
	
	//계좌주 set 메소드
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	//잔액 get 메소드
	public int getMoney() {
		return money;
	}
	
	//잔액 set 메소드
	public void setMoney(int money) {
		this.money = money;
	}
	
}