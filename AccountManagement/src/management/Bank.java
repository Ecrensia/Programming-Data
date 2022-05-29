package management;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	
	private List<Account> accountList = new ArrayList<Account>();
	
	// 계좌생성
	public void createAccount(int accountNumber, String accountName, int money) {
		if(this.findAccount(accountNumber) == 0) {
			accountList.add(new Account(accountNumber, accountName, money));
			System.out.println("결과: 계좌가 생성되었습니다.");
		}
		else {
			System.out.println("결과: 이미 등록된 계좌입니다.");
		}
	}

	// 계좌목록출력
	public void accountList() {
		for(int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i).getAccountNumber()+" "+accountList.get(i).getAccountName()+" "+accountList.get(i).getMoney());
		}
	}
	
	// 예금하기
	public void deposit(int accountNumber, int money) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNumber() == accountNumber) {
				accountList.get(i).setMoney(accountList.get(i).getMoney() + money);
			}
		}
	}
	
	// 출금하기
	public void withdraw(int accountNumber, int money) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNumber() == accountNumber) {
				accountList.get(i).setMoney(accountList.get(i).getMoney() - money);
			}
		}
	}
	
	// 매개변수(계좌번호)와 동일한 Account 객체 찾기
	private int findAccount(int accountNumber) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNumber() == accountNumber) {
				return 1;
			}
			else return 0;
		}
		return 0;
	}
}