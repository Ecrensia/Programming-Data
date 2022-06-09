package omok;

import java.util.Scanner;

public class Omok {
	public static void main(String[] args) {
		Player user = new Player("�����", "O");
		Player computer = new Player("��ǻ��", "X");
		Board board = new Board(19);
		Find find = new Find();
		play(board, user, computer);
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int y;
		
		for(int i = 0; i <= board.size*board.size; i++) {
			if(i%2 == 0) {
				System.out.print(user.name + " > ");
				
				while(true) {
					x = (int)sc.next().charAt(0)-65;
					y = sc.nextInt();
					
					if(board.map[y][x] == ".") {
						board.map[y][x] = user.stone;
						break;
					}
					else System.out.println("�̹� ���� �����ִ� ���Դϴ�. �ٸ� ���� ���� �����ּ���.");
				}
				
				board.print();
				
				if(find.findWidthOmok(y, x, user, board)) {
					System.out.println(user.name + "�� ���ο����� ��������ϴ�. " + user.name + "�� �¸�!");
					break;
				}
				else if(find.findVerticalOmok(y, x, user, board)) {
					System.out.println(user.name + "�� ���ο����� ��������ϴ�. " + user.name + "�� �¸�!");
					break;
				}
				else if(find.findRightDownOmok(user, board)) {
					System.out.println(user.name + "�� �밢�������� ��������ϴ�. " + user.name + "�� �¸�!");
					break;
				}
				else if(find.findRightUpOmok(user, board)) {
					System.out.println(user.name + "�� �밢�������� ��������ϴ�. " + user.name + "�� �¸�!");
					break;
				}
				if(i == board.size * board.size) {
	        		System.out.println("�� �̻� ���� ���� �� �����ϴ�. �����ϴ�.");
	        		break;
	        	}
			}
			
			else {
				System.out.print(computer.name + " > ");
				
				while(true) {
					x = (int)sc.next().charAt(0)-65;
					y = sc.nextInt();
					
					if(board.map[y][x] == ".") {
						board.map[y][x] = computer.stone;
						break;
					}
					else System.out.println("�̹� ���� �����ִ� ���Դϴ�. �ٸ� ���� ���� �����ּ���.");
				}
				
				board.print();
				
				if(find.findWidthOmok(y, x, computer, board)) {
					System.out.println(computer.name + "�� ���ο����� ��������ϴ�. " + computer.name + "�� �¸�!");
					break;
				}
				else if(find.findVerticalOmok(y, x, computer, board)) {
					System.out.println(computer.name + "�� ���ο����� ��������ϴ�. " + computer.name + "�� �¸�!");
					break;
				}
				else if(find.findRightDownOmok(computer, board)) {
					System.out.println(computer.name + "�� �밢�������� ��������ϴ�. " + computer.name + "�� �¸�!");
					break;
				}
				else if(find.findRightUpOmok(computer, board)) {
					System.out.println(computer.name + "�� �밢�������� ��������ϴ�. " + computer.name + "�� �¸�!");
					break;
				}
				if(i == board.size * board.size) {
	        		System.out.println("�� �̻� ���� ���� �� �����ϴ�. �����ϴ�.");
	        		break;
	        	}
			}
		}
	}
	
	private static void play(Board board, Player player1, Player player2) {
		board.print();
	}

}
