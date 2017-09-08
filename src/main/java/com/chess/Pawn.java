package com.chess;

import java.util.ArrayList;

/**
 * @author Michael Azogu
 * @version 1.0
 */
public class Pawn extends Piece {
	
	private Player player;
	private Space space;
	private boolean firstMove;
	/**
	 * Represents a pawn in chess
	 * @param player
	 * @param board
	 */
	public Pawn(Player player, Space space, Color color){
		super(player,space,color);
		this.player = player;
		this.space = space;
		this.color = color;
		firstMove = true;
	}
	/**
	 * Determines that a pawn has moved. 
	 */
	public void hasMoved(){
		firstMove = false;
	}
	
	/**
	 * Returns a boolean based on whether or not this Pawn has moved at least once this game. 
	 * @return
	 */
	public boolean hasMovedOnce(){
		return !firstMove;
	}
	
	@Override
	public ArrayList<Space> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
