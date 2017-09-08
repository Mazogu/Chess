package com.chess;
import java.util.ArrayList;

public abstract class Piece {
	public abstract ArrayList<Space> possibleMoves();
	protected Player player;
	protected Space space;
	protected Color color;
	/**
	 * Represents any chess piece. 
	 * @param player
	 * @param board
	 * @param color
	 */
	public Piece(Player player, Space space, Color color){
		this.player = player;
		this.space = space;
		this.color = color;
		
	}
	/**
	 * Occupies the given space 
	 * @param space
	 */
	public void move(Space space){
		space.setPiece(this);
		setSpace(space);
	}
	/**
	 * Sets the pieces space to the space it just moved to. 
	 * @param space
	 */
	private void setSpace(Space space){
		this.space = space;
	}
	/**
	 * returns the space the piece is occupying
	 * @return
	 */
	public Space getSpace(){return space;}
	/**
	 * Returns the player that owns piece
	 * @return
	 */
	public Player getPlayer(){return player;}
	/**
	 * Returns color of the piece.
	 * @return
	 */
	public Color getColor(){return color;}
}
