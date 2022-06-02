package omok;

import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	Player user = new Player("�����", "O");
        Player computer = new Player("��ǻ��", "X");
        Board board = new Board(19);
        play(board, user, computer);
        
        for(int i = 0; i < board.size * board.size + 1; i++) {
        	int breakCount_User = 0;
        	int breakCount_Computer = 0;
        	
        	//����� ����
        	if(i%2 == 0) {
        		System.out.print(user.name + " > ");
        		int y = (int)sc.next().charAt(0)-65;
        		int x = sc.nextInt();
            	board.map[x][y] = user.stone;
            	
            	
            	//���η� ����
            	for(int j = 0; j < board.map.length; j++) {
            		for(int k = 0; k < board.map[j].length-4; k++) {
            			if(board.map[j][k] != user.stone) {
            				continue;
            			}
            			else if(board.map[j][k] == user.stone){
            				if(board.map[j][k+1] == user.stone && board.map[j][k+2] == user.stone &&
            					board.map[j][k+3] == user.stone && board.map[j][k+4] == user.stone) {
            					breakCount_User = 1;
            					break;
            				}
            			}
            		}
            		if(breakCount_User == 1) {
            			break;
            		}
            	}
            	
            	//���η� ����
            	for(int j = 0; j < board.map.length; j++) {
            		for(int k = 0; k < board.map[j].length-4; k++) {
            			if(board.map[k][j] != user.stone) {
            				continue;
            			}
            			else if(board.map[k][j] == user.stone){
            				if(board.map[k+1][j] == user.stone && board.map[k+2][j] == user.stone &&
            					board.map[k+3][j] == user.stone && board.map[k+4][j] == user.stone) {
            					breakCount_User = 1;
            					break;
            				}
            			}
            		}
            		if(breakCount_User == 1) {
            			break;
            		}
            	}
            	
            	//��밢�� ����
            	for(int j = 0; j < board.map.length-4; j++) {
            		for(int k = 0; k < board.map[j].length-4; k++) {
            			if(board.map[j][k] != user.stone) {
            				continue;
            			}
            			else if(board.map[j][k] == user.stone){
            				if(board.map[j+1][k+1] == user.stone && board.map[j+2][k+2] == user.stone &&
            					board.map[j+3][k+3] == user.stone && board.map[j+4][k+4] == user.stone) {
            					breakCount_User = 1;
            					break;
            			
            				}
            			}
            		}
            		if(breakCount_User == 1) {
            			break;
            		}
            	}
            	
            	//�´밢�� ����
            	for(int j = 0; j < board.map.length-4; j++) {
            		for(int k = board.map[j].length-1; k > 3; k--) {
            			if(board.map[j][k] != user.stone) {
            				continue;
            			}
            			else if(board.map[j][k] == user.stone){
            				if(board.map[j+1][k-1] == user.stone && board.map[j+2][k-2] == user.stone &&
            					board.map[j+3][k-3] == user.stone && board.map[j+4][k-4] == user.stone) {
            					breakCount_User = 1;
            					break;
            				}
            			}
            		}
            		if(breakCount_User == 1) {
            			break;
            		}
            	}
        	}
        	
        	//��ǻ�� ����
        	else if(i%2 == 1) {
        		System.out.print(computer.name + " > ");
        		int y = (int)sc.next().charAt(0)-65;
        		int x = sc.nextInt();
            	board.map[x][y] = computer.stone;
            	
            	//���η� ����
            	for(int j = 0; j < board.map.length; j++) {
            		for(int k = 0; k < board.map[j].length-4; k++) {
            			if(board.map[j][k] != computer.stone) {
            				continue;
            			}
            			else if(board.map[j][k] == computer.stone){
            				if(board.map[j][k+1] == computer.stone && board.map[j][k+2] == computer.stone &&
            					board.map[j][k+3] == computer.stone && board.map[j][k+4] == computer.stone) {
            					breakCount_Computer = 1;
            					break;
            				}
            			}
            		}
            		if(breakCount_Computer == 1) {
            			break;
            		}
            	}
            	
            	//���η� ����
            	for(int j = 0; j < board.map.length; j++) {
            		for(int k = 0; k < board.map[j].length-4; k++) {
            			if(board.map[k][j] != computer.stone) {
            				continue;
            			}
            			else if(board.map[k][j] == computer.stone){
            				if(board.map[k+1][j] == computer.stone && board.map[k+2][j] == computer.stone &&
            					board.map[k+3][j] == computer.stone && board.map[k+4][j] == computer.stone) {
            					breakCount_Computer = 1;
            					break;
            				}
            			}
            		}
            		if(breakCount_Computer == 1) {
            			break;
            		}
            	}
            	
            	//��밢�� ����
            	for(int j = 0; j < board.map.length-4; j++) {
            		for(int k = 0; k < board.map[j].length-4; k++) {
            			if(board.map[j][k] != computer.stone) {
            				continue;
            			}
            			else if(board.map[j][k] == computer.stone){
            				if(board.map[j+1][k+1] == computer.stone && board.map[j+2][k+2] == computer.stone &&
            					board.map[j+3][k+3] == computer.stone && board.map[j+4][k+4] == computer.stone) {
            					breakCount_Computer = 1;
            			
            					break;
            				}
            			}
            		}
            		if(breakCount_Computer == 1) {
            			break;
            		}
            	}
            	
            	//�´밢�� ����
            	for(int j = 0; j < board.map.length-4; j++) {
            		for(int k = board.map[j].length-1; k > 3; k--) {
            			if(board.map[j][k] != computer.stone) {
            				continue;
            			}
            			else if(board.map[j][k] == computer.stone){
            				if(board.map[j+1][k-1] == computer.stone && board.map[j+2][k-2] == computer.stone &&
            					board.map[j+3][k-3] == computer.stone && board.map[j+4][k-4] == computer.stone) {
            					breakCount_Computer = 1;
            					break;
            				}
            			}
            		}
            		if(breakCount_Computer == 1) {
            			break;
            		}
            	}
        	}
        	
        	board.print();
        	
        	if(breakCount_User == 1) {
        		System.out.println("����ڰ� �̰���ϴ�.");
        	}
        	if(breakCount_Computer == 1) {
        		System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
        	}
        	if(breakCount_User == 1 || breakCount_Computer == 1) {
        		break;
        	}
        	if(i == board.size * board.size) {
        		System.out.println("�� �̻� ���� ���� �� �����ϴ�. �����ϴ�.");
        		break;
        	}
        }
        
        sc.close();
    }
    
    private static void play(Board board, Player user, Player computer) {
        board.print();
    }
}