package com.chess;
import java.util.Arrays;
import java.util.HashSet;

public class Player {
	private int number;
	private HashSet<Piece> set; 
	public Player(int number, Piece... pieces){
		this.number = number;
		set = new HashSet<Piece>();
		set.addAll(Arrays.asList(pieces));
	}
	public int getNumber(){return number;}
	public HashSet<Piece> getPieceSet(){return set;}
}
