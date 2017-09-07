package com.chess;
import java.util.ArrayList;

public abstract class Piece {
	public abstract ArrayList<Space> possibleMoves();
	protected Player player;
	protected Board board;
	protected Color color;
	/**
	 * Represents any chess piece. 
	 * @param player
	 * @param board
	 * @param color
	 */
	public Piece(Player player, Board board, Color color){
		this.player = player;
		this.board = board;
		this.color = color;
		
	}
	/**
	 * Occupies the given space 
	 * @param space
	 */
	public void move(Space space){
		space.setPiece(this);
	}
	/**
	 * returns Game Board
	 * @return
	 */
	public Board getBoard(){return board;}
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
