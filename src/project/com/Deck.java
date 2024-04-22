package project.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<>();
	
	
	
	public Deck() {
		
		String[] names = {"DIAMONDS", "CLUBS", "HEARTS", "SPADES"};
		int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		//String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
		
		for (String name: names) {
			for (int value: values) {
				
				cards.add(new Card(value, name));
			}
		}
	}
	
	public  int getSize() {
		
		return cards.size();
	}

	public void shuffle() {
		
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		
		
		return cards.remove(cards.size() - 1);
	}

}
