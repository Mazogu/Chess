package com.chess;

public abstract class Piece {
	public abstract Space[] possibleMoves();
	private Player player;
	public boolean move(Space space){
		space.setPiece(this);
		return true;
	}
	public void setPlayer(Player player){this.player = player;}
	public Player getPlayer(){return player;}
}
