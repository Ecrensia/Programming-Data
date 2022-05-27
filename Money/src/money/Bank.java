package money;

import java.util.List;
import java.util.ArrayList;


public class Bank {
    private List<Account> accountList = new ArrayList<>();


    // ���»���
    public void createAccount(int id, String name, Long amount) {
        if (this.findAccount(name) ==null) {
            accountList.add((new Account(id, name, amount)));
            System.out.println("���°� �����Ǿ����ϴ�.");
        }
        else
            System.out.println("�ߺ��� id �Դϴ�.");
    }


    // ���¸�����
    public void accountList() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i).getId() + "  " + accountList.get(i).getName() + "  " + accountList.get(i).getAmount());
        }
    }

    // �����ϱ�
    public void deposit(int id, long amount) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountList.get(i).setAmount(accountList.get(i).getAmount() + amount);
            }
        }
    }

    // ����ϱ�
    public void withdraw(int id, long amount) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountList.get(i).setAmount(accountList.get(i).getAmount() - amount);
            }
        }
    }

    // �Ű�����(���¹�ȣ)�� ������ Account ��ü ã��
    private Account findAccount(String ano) {
        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getName().equals(ano)){
                return accountList.get(i);
            }
            else return null;
        }
        return null;
    }
}