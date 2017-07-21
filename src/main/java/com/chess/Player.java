package com.chess;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Represents a single player in a chess match
 * @author Michael Azogu
 * @version 1.0
 */
public class Player {
	private HashSet<Piece> set; 
	private Color color;
	/**
	 * The constructor of player
	 * @param color The color the pieces this player will have. 
	 * @param pieces The pieces the player current has active.
	 */
	public Player(Color color, Piece... pieces){
		this.color = color;
		set = new HashSet<Piece>();
		set.addAll(Arrays.asList(pieces));
	}
	/**
	 * Returns the player color.
	 * @return
	 */
	public Color getColor(){return color;}
	/**
	 * Returns the player active set of pieces. 
	 * @return
	 */
	public HashSet<Piece> getPieceSet(){return set;}
}
