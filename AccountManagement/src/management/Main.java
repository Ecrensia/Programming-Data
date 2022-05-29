package management;

import java.util.Scanner;
import define.Define;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Bank bank = new Bank();

		boolean run = true;
		while (run) {
			System.out.println("------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("------------------------------------------");
			System.out.print("����> ");

			int selectNo = scanner.nextInt();

			switch(selectNo) {
			case 1:
				System.out.println(Define.LINE);
				System.out.println(Define.ACMAKE);
				System.out.println(Define.LINE);
				System.out.print(Define.ACNUM);
				int accountNumber = scanner.nextInt();
				System.out.print(Define.ACNAME);
				String accountName = scanner.next();
				System.out.print(Define.FIMON);
				int money = scanner.nextInt();
				bank.createAccount(accountNumber, accountName, money);
				break;
				
			case 2:
				System.out.println(Define.LINE);
				System.out.println(Define.ACLIST);
				System.out.println(Define.LINE);
				bank.accountList();
				break;
				
			case 3:
				System.out.println(Define.LINE);
				System.out.println(Define.DEPOSIT);
				System.out.println(Define.LINE);
				System.out.println(Define.ACNUM);
				int makedAccountNum1 = scanner.nextInt();
				System.out.println(Define.FIMON);
				int depMoney = scanner.nextInt();
				bank.deposit(makedAccountNum1, depMoney);
				System.out.print(Define.RESULT);
				System.out.println("������ �����Ǿ����ϴ�.");
				break;
				
			case 4:
				System.out.println(Define.LINE);
				System.out.println(Define.WIDRAW);
				System.out.println(Define.LINE);
				System.out.println(Define.ACNUM);
				int makedAccountNum2 = scanner.nextInt();
				System.out.println(Define.WIDMON);
				int widMoney = scanner.nextInt();
				bank.withdraw(makedAccountNum2, widMoney);
				System.out.print(Define.RESULT);
				System.out.println("����� �����Ǿ����ϴ�.");
				break;
				
			case 5:
				System.out.println("���α׷� ����");
				run = false;
				break;
				
			default :
				break;
			}
		}
	}
}