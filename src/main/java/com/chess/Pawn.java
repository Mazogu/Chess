package com.chess;

import java.util.ArrayList;

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
	public Pawn(Player player, Board board, Color color){
		super(player,board,color);
		this.player = player;
		this.board = board;
		this.color = color;
	}
	
	@Override
	public ArrayList<Space> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
