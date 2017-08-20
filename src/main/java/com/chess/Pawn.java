package com.chess;

/**
 * @author Michael Azogu
 * @version 1.0
 */
public class Pawn extends Piece {
	
	protected Player player;
	protected Board board;
	/**
	 * Represents a pawn in chess
	 * @param player
	 * @param board
	 */
	public Pawn(Player player, Board board){
		super.player = player;
		this.player = player;
		super.board = board;
		this.board = board;
	}
	@Override
	public Space[] possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
