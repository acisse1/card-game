package cisse.com;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
	
	static String[] gameBoard = new String[9];
	
	static void initialize () {
		
		int count = 1;
		
		for (int i = 0; i < 9; i++) {
				
				gameBoard[i] = String.valueOf(count);	
				count++;
		}
		
	}
	
	static void display () {
		
		System.out.println("+---+---+---+");		
		System.out.print("| " + gameBoard[0] + " " + "| " + gameBoard[1] + " " + "| " + gameBoard[2] + " |");
		System.out.println();
		
		System.out.println("+---+---+---+");
		System.out.print("| " + gameBoard[3] + " " + "| " + gameBoard[4] + " " + "| " + gameBoard[5] + " |");
		System.out.println();
		
		System.out.println("+---+---+---+");
		System.out.print("| " + gameBoard[6] + " " + "| " + gameBoard[7] + " " + "| " + gameBoard[8] + " |");
			
		System.out.println();
		System.out.println("+---+---+---+");
			
		
	}
	
	static boolean hasWin (String str) {
		
		if (gameBoard[0].equals(str) && gameBoard[0].equals(str) && gameBoard[0].equals(str)) {
			return true;
		}
		
		if (gameBoard[1].equals(str) && gameBoard[1].equals(str) && gameBoard[1].equals(str)) {
			return true;
		}
		
		if (gameBoard[2].equals(str) && gameBoard[2].equals(str) && gameBoard[2].equals(str)) {
			return true;
		}
		
		if (gameBoard[0].equals(str) && gameBoard[1].equals(str) && gameBoard[2].equals(str)) {
			return true;
		}
		
		if (gameBoard[0].equals(str) && gameBoard[1].equals(str) && gameBoard[2].equals(str)) {
			return true;
		}
		
		if (gameBoard[0].equals(str) && gameBoard[1].equals(str) && gameBoard[2].equals(str)) {
			return true;
		}
		
		if (gameBoard[0].equals(str) && gameBoard[1].equals(str) && gameBoard[2].equals(str)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String winner = "";
		String player = "X";
		int allSquares = 1;
		int squareNumber;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to 3 × 3 Tic Tac Toe.");
		initialize();
		display();
		
		
		while (winner.equals("") && allSquares <= 9) {
			
			System.out.print(player + "'s turn, please enter the square number for " + player  + ": ");
			
			
			String input = scan.nextLine();
			squareNumber = Integer.valueOf(input);
			
			System.out.println();
			
			if (squareNumber > 0 && squareNumber <= 9) {
				
				if (isValidSquare(squareNumber, input, player)) {
					
					if (player.equals("X")) {
						
						player = "O";
					}
					
					else {
						player = "X";
					}
					
					allSquares++;
					display();
					
					winner = checkWinnerStatus();
							
				}
				
				else {
					System.out.println("square is already filled");
				}
			}
			
		}
		System.out.println("+--------------------------+");
		System.out.println("	Game is over		");
		
		if (winner.equals("draw")) {
			System.out.println("This game is a " + winner + " !");
		}
		
		else {
			System.out.println(winner + " wins");
		}
		
		System.out.println("+--------------------------+");
			
		scan.close();
	}
	

	static String checkWinnerStatus() {
		// TODO Auto-generated method stub
		for (int pos = 0; pos < 8; pos++) {
			
			String winningCombo = "";
			
			switch (pos) {
			
			case 0:	
				winningCombo = gameBoard[0] + gameBoard[1] + gameBoard[2];
				break;
			case 1:
				winningCombo = gameBoard[3] + gameBoard[4] + gameBoard[5];
				break;
			case 2:
				winningCombo = gameBoard[6] + gameBoard[7] + gameBoard[8];
				break;
			case 3:
				winningCombo = gameBoard[0] + gameBoard[3] + gameBoard[6];
				break;
			case 4:
				winningCombo = gameBoard[1] + gameBoard[4] + gameBoard[7];
				break;
			case 5:
				winningCombo = gameBoard[2] + gameBoard[5] + gameBoard[8];
				break;
			case 6:
				winningCombo = gameBoard[0] + gameBoard[4] + gameBoard[8];
				break;
			case 7:
				winningCombo = gameBoard[2] + gameBoard[4] + gameBoard[6];
				break;
			
			}
			
			if (winningCombo.equals("XXX")) {
				return "X";
			}
			
			else if (winningCombo.equals("OOO")) {
				return "O";
			}
		}
			
		for (int pos = 1; pos <= 9; pos++) {
				
			if (Arrays.asList(gameBoard).contains(String.valueOf(pos))) {
				break;
			}
				
			else if (pos == 9) {
				return "draw";
			}
		}
			
		
		return "";
	}

	static boolean isValidSquare(int squareNumber, String input, String player) {
		// TODO Auto-generated method stub
		if (gameBoard[squareNumber - 1].equals(input)) {
			
			gameBoard[squareNumber - 1] = player;
			return true;
		}
		
		else {
			return false;
		}
		
	}

}
