package project.com;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Deck deck = new Deck();
		Player player1 = new Player();
		Player player2 = new Player();
		
		deck.shuffle();
		
		for (int i = 0; i < 26; i++) {
			
			if (deck.getSize() > 2) {
				
				player1.draw(deck);
				player2.draw(deck);	
			}
			
			else {
				System.out.println("Game is over");
				break;
			}
		}
		
		// Finding player with the higher value
		
		for (int i = 0; i < 26; i++) {
			
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			int value1 = card1.getValue();
			int value2 = card2.getValue();
			
			if (value1 > value2) {
				
				player1.incrementScore();
				System.out.println("player 1 receives a point");
			}
			
			else if (value2 > value1) {
				
				player2.incrementScore();
				System.out.println("player 2 receives a point");
			}
			
			else {
				System.out.println("no point was awarded");
			}	
			
		}
		
		// Finding player with higher score
		
		int score1 = player1.getScore();
		int score2 = player2.getScore();
		
		if (score1 > score2) {
			System.out.println("player 1 receives higher score: " + score1);
		}
		
		
		else if (score2 > score1) {
			System.out.println("player 2 receives higher score: " + score2);
		}
		
		else {
			System.out.println("no winner, both player receive same score. player 1' score: " + score1 + " and player 2' score: " + score2);
		}
		

	}

}
