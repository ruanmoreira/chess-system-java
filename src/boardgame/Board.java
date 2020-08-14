package boardgame;

public class Board {
	private int row;
	private int column;
	private Piece[][] pieces;
	public Board(int row, int column) {
		super();
		this.row = row;
		this.column = column;
		pieces = new Piece [row][column];
	}
	
	
}
