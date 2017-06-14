package com.chess;

public class Board {
	private Space[][] board;
	final static int SIZE = 8;
	public Board(){
		board = new Space[SIZE][SIZE];
		createBoard();
	}
	private void createBoard(){
		for(int i = 0;i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				board[j][i] = new Space(j,i);
			}
		}
	}
	public Space[][] getBoard(){return board;}
}
