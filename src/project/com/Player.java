package project.com;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private List<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public Player() {
		
		this.score = 0;
		Deck deck = new Deck();
		
		for (int i = 0; i < 5; i++) {
			
			deck.shuffle();
			hand.add(deck.draw());
		}
	}
	
	
	public List<Card> getHand() {
		return hand;
	}


	public void setHand(List<Card> hand) {
		this.hand = hand;
	}


	public int getScore() {
		return score;
	}


	public void setScore(int score) {
		this.score = score;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void describe() {
		
		System.out.println("The player's information: ");
		System.out.println("name: " + this.name);
		System.out.println("score: " + this.score);
		System.out.println("hand: " + this.hand);
		
		for (Card card: hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		
		return hand.remove(hand.size() - 1);
	}
	
	public void draw(Deck deck) {
		
		Card card = deck.draw();
		hand.add(card);
	}
	
	public void incrementScore() {
		
		this.score++;
	}
	
	

}
