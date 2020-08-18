package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString () {
		return "R";
	}
	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean [getBoard().getRows()] [getBoard().getColumns()];
		
		Position pt = new Position (0,0);
		// ACIMA 
		pt.setValues(position.getRow() - 1, position.getColumn());
		while (getBoard().positionExists(pt) && !getBoard().thereIsAPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
			pt.setRow(pt.getRow() - 1);
		}
		if (getBoard().positionExists(pt) && isThereOppnoentPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
		}
		
		// Para baixo
		pt.setValues(position.getRow() + 1, position.getColumn());
		while (getBoard().positionExists(pt) && !getBoard().thereIsAPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
			pt.setRow(pt.getRow() + 1);
		}
		if (getBoard().positionExists(pt) && isThereOppnoentPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
		}
		
		//ESQUERDA
		pt.setValues(position.getRow(), position.getColumn() - 1);
		while (getBoard().positionExists(pt) && !getBoard().thereIsAPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
			pt.setColumn(pt.getColumn() - 1);
		}
		if (getBoard().positionExists(pt) && isThereOppnoentPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
		}
		
		//DIREITA
		pt.setValues(position.getRow(), position.getColumn() + 1);
		while (getBoard().positionExists(pt) && !getBoard().thereIsAPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
			pt.setColumn(pt.getColumn() + 1);
		}
		if (getBoard().positionExists(pt) && isThereOppnoentPiece(pt)) {
			mat[pt.getRow()][pt.getColumn()] = true;
		}
		return mat;
	}

}
