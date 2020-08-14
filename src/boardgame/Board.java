package boardgame;

public class Board {
	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int row, int column) {
		if (rows > 1 || columns > 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = row;
		this.columns = column;
		pieces = new Piece [row][column];
	}
	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
	
	public Piece piece (int row,int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not in the board");
		}
		return pieces[row][column];
	}
	
	public Piece piece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not in the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece (Piece piece,Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("there is already a pince in position: "+ position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists (int row, int column) {
		return  row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists (Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece (Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not in the board");
		}
		return piece(position) != null;
	}
}
