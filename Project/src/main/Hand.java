package main;

import java.awt.Graphics;
import java.util.ArrayList;

public class Hand extends GameObject {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private boolean isHidden;
	private Card lastSelected;
	private int lastSelectedIndex;
	
	public Hand(int x, int y)
	{
		super(x,y,0,Card.HEIGHT);
	}
	
	public void resetCoords() {
		for(int i = 0; i < cards.size(); i++) {
			Card c = cards.get(i);
			c.setY(y);
			c.setX(x + i * 10 + i * Card.WIDTH);
		}
		width = cards.size() * Card.WIDTH + (cards.size() - 1) * 10;
	}
	
	public void add(Card c)
	{
		c.setHidden(isHidden);
		cards.add(c);
		resetCoords();
	}
	
	public Card get(int i)
	{
		return cards.get(i);
	}
	
	public Card remove(int i) {
		Card c = cards.remove(i);
		resetCoords();
		return c;
	}
	
	public int getHit(int x, int y) {
		for(int i = 0; i < cards.size(); i++) {
			if(cards.get(i).hitClip(x, y))
				return i;
		}
		return -1;
	}
	
	public void render(Graphics g) {
		for(Card c : cards)
			c.render(g);
	}
	
	public void drawCards(Deck d, int cards) {
		for(Card c : d.drawCards(cards))
			add(c);
	}
	
	public void shuffleCards(Deck d)
	{
		int s = cards.size();
		for(int i = 0; i < s; i++) {
			d.add(cards.remove(0));
		}
		d.shuffle();
	}
	
	public void setHidden(boolean b) {
		isHidden = b;
		for(Card c : cards)
			c.setHidden(b);
	}
	
	public boolean isHidden() {
		return isHidden;
	}
	
	public int numCards() {
		return cards.size();
	}
	
	
	// TODO for point system
	public int getValue(){
		return 0;
	}

	public void update() {
//		for(Card c : cards)
//			c.update();
	}
	
	public void setHovering(boolean hovering) {
		
		if(hovering) {
			int index = getHit(Game.mouseX, Game.mouseY);
			if(index != -1) {
				Card c = get(index);
				if(lastSelected != null && lastSelected != c) {
					lastSelected.setHovering(false);
				}
				lastSelected = c;
				setLastSelectedIndex(index);
				c.setHovering(true);
			}
		} else if(lastSelected != null) {
			lastSelected.setHovering(false);
			lastSelected = null;
		}
//		} else if(lastSelected != null) {
//			setLastSelectedIndex(-1);
//			lastSelected.setHighlight(false);
//		}
		
		
//		if(index != -1) {
//			Card c = habs.get(habs.getHit(x, y));
//			c.setHighlight(true);
//			p1.setSelectedCard(c);
//			p1.setSelectedCardIndex(index);
//			p1.setHovering(true);
//		} else if(p1.isHovering()){
//			for(int i = 0; i < habs.numCards(); i++) {
//				Card c = habs.get(i);
//				p1.setSelectedCard(null);
//				p1.setSelectedCardIndex(-1);
//				c.setHighlight(false);
//			}
//			p1.setHovering(false);
//		}
		
		
		this.hovering = hovering;
	}

	public int getLastSelectedIndex() {
		return lastSelectedIndex;
	}

	public void setLastSelectedIndex(int lastSelectedIndex) {
		this.lastSelectedIndex = lastSelectedIndex;
	}

}
