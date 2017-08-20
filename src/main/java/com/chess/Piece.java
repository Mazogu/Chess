package com.chess;

public abstract class Piece {
	public abstract Space[] possibleMoves();
	protected Player player;
	protected Board board;
	public void move(Space space){
		space.setPiece(this);
	}
	public Board getBoard(){return board;}
	public Player getPlayer(){return player;}
}
