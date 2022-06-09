package omok;

public class Find {
	
	public boolean findWidthOmok(int x, int y, Player player, Board board) {
		
		if(y < 4) y = 4;
		else if(y > board.map.length -5) y = board.map.length -5;
	
		for(int i = y-4; i < y+1; i++) {
			int count = 0;
			for(int j = i; j < i+5; j++) {
				if(board.map[x][j] == player.stone) count++;
				else if(board.map[x][j] != player.stone) break;
			}
			if(count == 5) return true;
		}
		return false;
	}
	
	public boolean findVerticalOmok(int x, int y, Player player, Board board) {
		
		if(x < 4) x = 4;
		else if(x > board.map.length -5) x = board.map.length -5;
	
		for(int i = x-4; i < x+1; i++) {
			int count = 0;
			for(int j = i; j < i+5; j++) {
				if(board.map[j][y] == player.stone) count++;
				else if(board.map[j][y] != player.stone) break;
			}
			if(count == 5) return true;
		}
		return false;
	}
	
	public boolean findRightDownOmok(Player player, Board board) {
		int count = 0;
		
		for(int i = 0; i < board.map.length-4; i++) {
			for(int j = 0; j < board.map[i].length-4; j++) {
				if(board.map[i][j] != player.stone) continue;
				else if(board.map[i][j] == player.stone) {
					for(int k = i+1, l = j+1; k < i+5; k++, l++) {
						if(board.map[k][l] == player.stone) count++;
						else if(board.map[k][l] != player.stone) break;
					}
				}
				if(count == 4) return true;
			}
		}
		return false;
	}
	
	public boolean findRightUpOmok(Player player, Board board) {
		int count = 0;
		
		for(int i = 0; i < board.map.length-4; i++) {
			for(int j = board.map[i].length-1; j > 3; j--) {
				if(board.map[i][j] != player.stone) continue;
				else if(board.map[i][j] == player.stone) {
					for(int k = i+1, l = j-1; k < i+5; k++, l--) {
						if(board.map[k][l] == player.stone) count++;
						else if(board.map[k][l] != player.stone) break;
					}
				}
				if(count == 4) return true;
			}
		}
		return false;
	}
}