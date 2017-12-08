package com.chess;

import java.util.ArrayList;

public class Bishop extends Piece {
	public static final String type = "BISHOP";
	/**
	 * A bishop piece. 
	 * @param player
	 * @param space
	 * @param color
	 */
	public Bishop(Player player, Space space, Color color) {
		super(player, space, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<Space> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
