package ser120.chess.game;

import ser120.chess.models.CoolBoard;
import ser120.chess.Piece;

public class GameManager {
	private CoolBoard board;
	
	public GameManager(){
		this.board = new CoolBoard(8,8);
	}
	
	public void runGame(int[] startingPosition, int[] endingPosition){
		System.out.println("GameManager: Initializing engine...");
		int oldRow = startingPosition[0];
		int oldCol = startingPosition[1];
		int newRow = endingPosition[0];
		int newCol = endingPosition[1];
		Piece p = board.getPiece(oldRow, oldCol);
		if(p == null){
			System.out.println("No piece at that position.");
			return;
		}
		if(p.canMove(board, newRow, newCol, oldRow, oldCol)){
			board.movePiece(oldRow, oldCol, newRow, newCol);
			System.out.println("Move successful!");
		}else{
			System.out.println("Invalid move.");
		}
		board.showBoard();
        System.out.println("GameManager: Ready for Green's move.");
	}
	
	public void runGame(){
		System.out.println("GameManager: Initializing engine...");
        board.showBoard();
        System.out.println("GameManager: Ready for Green's move.");
	}
	
	public CoolBoard getBoard(){
		return board;
	}
}
