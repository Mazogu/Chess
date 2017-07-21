package com.chess;

/**
 * Represents the playing board. 
 * @author Michael Azogu
 * @version 1.0
 */
public class Board {
	private Space[][] board;
	final static int SIZE = 8;
	public Board(){
		board = new Space[SIZE][SIZE];
		createBoard();
	}
	/**
	 * Creates a 8x8 board in the form of a two-dimensional array of spaces. 
	 */
	private void createBoard(){
		for(int i = 0;i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				board[j][i] = new Space(j,i);
			}
		}
	}
	/**
	 * Returns the created board
	 * @return
	 */
	public Space[][] getBoard(){return board;}
}
