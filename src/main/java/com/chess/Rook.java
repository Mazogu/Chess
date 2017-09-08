package com.chess;

import java.util.ArrayList;

public class Rook extends Piece {
	private Player player;
	private Space space;
	private Color color;
	private boolean moved;
	
	public Rook(Player player,Space space, Color color){
		super(player,space,color);
		this.player = player;
		this.space = space;
		this.color = color;
		moved = false;
		
	}
	
	/**
	 * Changes to true when the piece moves for the first time. 
	 */
	public void hasMoved(){
		moved = true;
	}
	/**
	 * Returns wether or not the Rook has moved at any point.
	 * @return
	 */
	public boolean hasMovedOnce(){
		return moved;
	}
	@Override
	public ArrayList<Space> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
