package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public ChessPosition getChessPosition () {
		return ChessPosition.fromPosition(position);
	}
	protected boolean isThereOppnoentPiece (Position position) {
		ChessPiece pc = (ChessPiece) getBoard().piece(position);
		return pc != null & pc.getColor() != color;
	}
	
}
