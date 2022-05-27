package money;

import java.util.List;
import java.util.ArrayList;


public class Bank {
    private List<Account> accountList = new ArrayList<>();


    // 계좌생성
    public void createAccount(int id, String name, Long amount) {
        if (this.findAccount(name) ==null) {
            accountList.add((new Account(id, name, amount)));
            System.out.println("계좌가 생성되었습니다.");
        }
        else
            System.out.println("중복된 id 입니다.");
    }


    // 계좌목록출력
    public void accountList() {
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i).getId() + "  " + accountList.get(i).getName() + "  " + accountList.get(i).getAmount());
        }
    }

    // 예금하기
    public void deposit(int id, long amount) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountList.get(i).setAmount(accountList.get(i).getAmount() + amount);
            }
        }
    }

    // 출금하기
    public void withdraw(int id, long amount) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountList.get(i).setAmount(accountList.get(i).getAmount() - amount);
            }
        }
    }

    // 매개변수(계좌번호)와 동일한 Account 객체 찾기
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