package com.chess;

public abstract class Piece {
	public abstract Space[] possibleMoves();
	private Player player;
	private Board board;
	public void move(Space space){
		space.setPiece(this);
	}
	public Board getBoard(){return board;}
	public Player getPlayer(){return player;}
}
