package money;

import java.util.Scanner;

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
                    System.out.println("------------------------------------------");
                    System.out.println("���»���:");
                    System.out.println("------------------------------------------");
                    System.out.println("���¹�ȣ:");
                    int id= scanner.nextInt();
                    System.out.println("������:");
                    String name = scanner.next();
                    System.out.println("�ʱ� �Աݾ�:");
                    long amount=scanner.nextInt();
                    bank.createAccount(id,name,amount);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    System.out.println("���¸��");
                    System.out.println("------------------------------------------");
                    bank.accountList();
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    System.out.println("����");
                    System.out.println("------------------------------------------");
                    System.out.println("���¹�ȣ");
                    int selectId= scanner.nextInt();
                    System.out.println("���ݾ�");
                    int inputAccount= scanner.nextInt();

                    bank.deposit(selectId,inputAccount);
                    System.out.println("���: ������ �����Ǿ����ϴ�.");
                    break;
                case 4:

                    System.out.println("------------------------------------------");
                    System.out.println("���");
                    System.out.println("------------------------------------------");
                    System.out.println("���¹�ȣ");
                    int selectId1= scanner.nextInt();
                    System.out.println("��ݾ�");
                    int inputAccount1= scanner.nextInt();

                    bank.withdraw(selectId1,inputAccount1);
                    System.out.println("���: ����� �����Ǿ����ϴ�.");
                    break;
                case 5:
                     run = false;
                    System.out.println("���α׷� ����");
                    break;
                default:
                    break;
            }


            // �Է��� ���� ���� ó��
        }
    }
}