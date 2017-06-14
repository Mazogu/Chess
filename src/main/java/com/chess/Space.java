package com.chess;

public class Space {
	private boolean occupied;
	private int x,y; 
	private Piece piece;
	public Space(int x, int y){
		this.x = x;
		this.y = y;
		occupied = false;
		piece = null;
	}
	public boolean isOccupied(){return occupied;}
	public void occupy(){this.occupied = true;}
	public int[] getPosition(){return new int[]{x,y};}
	public Piece getPiece(){return piece;}
	public void setPiece(Piece piece){this.piece = piece;};
} 
