package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString () {
		return "K";
	}

	private boolean canMove (Position position) {
		ChessPiece pc = (ChessPiece) getBoard().piece(position);
		return pc == null || pc.getColor() != getColor();
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean [getBoard().getRows()] [getBoard().getColumns()];
		Position pt = new Position (0,0);
		
			// ACIMA
			pt.setValues(position.getRow() - 1, position.getColumn());
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			// EMBAIXO
			pt.setValues(position.getRow() + 1, position.getColumn());
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			// ESQUERDA
			pt.setValues(position.getRow(), position.getColumn() - 1);
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			// DIREITA
			pt.setValues(position.getRow(), position.getColumn() + 1);
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			//DIAGONAIS
			// NW
			pt.setValues(position.getRow() - 1, position.getColumn() - 1);
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			// NE
			pt.setValues(position.getRow() - 1, position.getColumn() + 1);
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			// SW
			pt.setValues(position.getRow() + 1, position.getColumn() - 1);
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
			
			// SE
			pt.setValues(position.getRow() + 1, position.getColumn() + 1);
			if (getBoard().positionExists(pt) && canMove(pt)) {
				mat[pt.getRow()][pt.getColumn()] = true;
			}
		
		return mat;
	}
}
