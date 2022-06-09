package omok;

import java.util.Scanner;

public class Omok {
	public static void main(String[] args) {
		Player user = new Player("사용자", "O");
		Player computer = new Player("컴퓨터", "X");
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
					else System.out.println("이미 돌이 놓여있는 곳입니다. 다른 곳에 돌을 놓아주세요.");
				}
				
				board.print();
				
				if(find.findWidthOmok(y, x, user, board)) {
					System.out.println(user.name + "가 가로오목을 만들었습니다. " + user.name + "의 승리!");
					break;
				}
				else if(find.findVerticalOmok(y, x, user, board)) {
					System.out.println(user.name + "가 세로오목을 만들었습니다. " + user.name + "의 승리!");
					break;
				}
				else if(find.findRightDownOmok(user, board)) {
					System.out.println(user.name + "가 대각선오목을 만들었습니다. " + user.name + "의 승리!");
					break;
				}
				else if(find.findRightUpOmok(user, board)) {
					System.out.println(user.name + "가 대각선오목을 만들었습니다. " + user.name + "의 승리!");
					break;
				}
				if(i == board.size * board.size) {
	        		System.out.println("더 이상 돌을 놓을 수 없습니다. 비겼습니다.");
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
					else System.out.println("이미 돌이 놓여있는 곳입니다. 다른 곳에 돌을 놓아주세요.");
				}
				
				board.print();
				
				if(find.findWidthOmok(y, x, computer, board)) {
					System.out.println(computer.name + "가 가로오목을 만들었습니다. " + computer.name + "의 승리!");
					break;
				}
				else if(find.findVerticalOmok(y, x, computer, board)) {
					System.out.println(computer.name + "가 세로오목을 만들었습니다. " + computer.name + "의 승리!");
					break;
				}
				else if(find.findRightDownOmok(computer, board)) {
					System.out.println(computer.name + "가 대각선오목을 만들었습니다. " + computer.name + "의 승리!");
					break;
				}
				else if(find.findRightUpOmok(computer, board)) {
					System.out.println(computer.name + "가 대각선오목을 만들었습니다. " + computer.name + "의 승리!");
					break;
				}
				if(i == board.size * board.size) {
	        		System.out.println("더 이상 돌을 놓을 수 없습니다. 비겼습니다.");
	        		break;
	        	}
			}
		}
	}
	
	private static void play(Board board, Player player1, Player player2) {
		board.print();
	}

}
