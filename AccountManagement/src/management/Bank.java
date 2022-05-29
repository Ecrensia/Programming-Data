package management;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	
	private List<Account> accountList = new ArrayList<Account>();
	
	// ���»���
	public void createAccount(int accountNumber, String accountName, int money) {
		if(this.findAccount(accountNumber) == 0) {
			accountList.add(new Account(accountNumber, accountName, money));
			System.out.println("���: ���°� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("���: �̹� ��ϵ� �����Դϴ�.");
		}
	}

	// ���¸�����
	public void accountList() {
		for(int i = 0; i < accountList.size(); i++) {
			System.out.println(accountList.get(i).getAccountNumber()+" "+accountList.get(i).getAccountName()+" "+accountList.get(i).getMoney());
		}
	}
	
	// �����ϱ�
	public void deposit(int accountNumber, int money) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNumber() == accountNumber) {
				accountList.get(i).setMoney(accountList.get(i).getMoney() + money);
			}
		}
	}
	
	// ����ϱ�
	public void withdraw(int accountNumber, int money) {
		for(int i = 0; i < accountList.size(); i++) {
			if(accountList.get(i).getAccountNumber() == accountNumber) {
				accountList.get(i).setMoney(accountList.get(i).getMoney() - money);
			}
		}
	}
	
	// �Ű�����(���¹�ȣ)�� ������ Account ��ü ã��
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