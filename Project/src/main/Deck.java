package main;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Deck()
	{
		reset();
	}
	
	public void reset()
	{
		cards.clear();
		for(int i = 1; i < 14; i++) {
			for(int j = 0; j < 4; j++) {
				cards.add(new Card(0,0,j,i));
			}
		}
		shuffle();
	}
	
	public Card Draw()
	{
		return cards.remove(cards.size() - 1);
	}
	
	public Card[] drawCards(int cards)
	{
		Card[] ret = new Card[cards];
		
		for(int i = 0; i < cards; i++)
		{
			ret[i] = Draw();
		}
		
		return ret;
	}
	
	public void add(Card c) {
		cards.add(c);
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
}
