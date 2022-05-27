package money;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean run = true;
        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택> ");

            int selectNo = scanner.nextInt();
            switch(selectNo) {
                case 1:
                    System.out.println("------------------------------------------");
                    System.out.println("계좌생성:");
                    System.out.println("------------------------------------------");
                    System.out.println("계좌번호:");
                    int id= scanner.nextInt();
                    System.out.println("계좌주:");
                    String name = scanner.next();
                    System.out.println("초기 입금액:");
                    long amount=scanner.nextInt();
                    bank.createAccount(id,name,amount);
                    break;
                case 2:
                    System.out.println("------------------------------------------");
                    System.out.println("계좌목록");
                    System.out.println("------------------------------------------");
                    bank.accountList();
                    break;
                case 3:
                    System.out.println("------------------------------------------");
                    System.out.println("예금");
                    System.out.println("------------------------------------------");
                    System.out.println("계좌번호");
                    int selectId= scanner.nextInt();
                    System.out.println("예금액");
                    int inputAccount= scanner.nextInt();

                    bank.deposit(selectId,inputAccount);
                    System.out.println("결과: 예금이 성공되었습니다.");
                    break;
                case 4:

                    System.out.println("------------------------------------------");
                    System.out.println("출금");
                    System.out.println("------------------------------------------");
                    System.out.println("계좌번호");
                    int selectId1= scanner.nextInt();
                    System.out.println("출금액");
                    int inputAccount1= scanner.nextInt();

                    bank.withdraw(selectId1,inputAccount1);
                    System.out.println("결과: 출금이 성공되었습니다.");
                    break;
                case 5:
                     run = false;
                    System.out.println("프로그램 종료");
                    break;
                default:
                    break;
            }


            // 입력한 값에 따라 처리
        }
    }
}