package main;

import java.awt.*;

public class Card extends GameObject {
	
	//suits
	public final int HEART = 0;
	public final int SPADE = 1;
	public final int DIAMOND = 2;
	public final int CLUB = 3;
	
	//numbers
	public final int KING = 13;
	public final int QUEEN = 12;
	public final int JACK = 11;
	public final int ACE = 1;
	
	//instance variables
	private int suit;
	private int number;
	private Color c;
	private boolean isHighlighted;
	private boolean isHidden;
	
	//graphic settings
	public static final int WIDTH = 40;
	public static final int HEIGHT = 50;
	
	
	public Card(int x, int y){
		super(x,y);
		c = Color.BLACK;
	}
	
	
	public Card(int x, int y, int suit, int number)
	{
		super(x, y, WIDTH, HEIGHT);
		this.suit = suit;
		this.number = number;
		
		// TODO: make or instead combining same suit color
		if(suit == HEART)
		{
			c = Color.RED;
		} else if(suit == SPADE)
		{
			c = Color.BLACK;
		} else if(suit == CLUB)
		{
			c = Color.BLACK;
		} else if(suit == DIAMOND)
		{
			c = Color.RED;
		}
	}
	
	public void render(Graphics g) {
		
		FontMetrics f = g.getFontMetrics();
		String displayString = getNumRepr();
		
		if(isHidden) {
			g.setColor(Color.DARK_GRAY);
		} else {
			g.setColor(c);
		}
		if(isHighlighted)
			g.setColor(Color.BLUE);
		g.drawRect(x, y, WIDTH, HEIGHT);
		
		if(!isHidden) {
			g.drawString(displayString, x + (WIDTH / 2) - f.stringWidth(displayString) / 2, y + f.getHeight());
			g.drawString(getSuitRepr(), x + (WIDTH / 2) - f.stringWidth(getSuitRepr()) / 2, y + f.getHeight() * 2);
		} else {
			g.drawString("?", x + (WIDTH / 2) - f.stringWidth("?") / 2, y + f.getHeight());
		}
	}
	
	public String getSuitRepr()
	{
		if(suit == HEART)
		{
			return "♥";
		} else if(suit == SPADE)
		{
			return "♠";
		} else if(suit == CLUB)
		{
			return "♣";
		} else if(suit == DIAMOND)
		{
			return "♦";
		}
		return "X";
	}
	
	public String getNumRepr()
	{
		if(!(number < JACK)&& number == KING) {
			return "K";
		} else if (number == QUEEN) {
			return "Q";
		} else if (number == JACK) {
			return "J";
		} else if (number == ACE) {
			return "A";
		}
		return "" + number;
	}
	
	public void setHighlight(boolean isHighlighted) {
		this.isHighlighted = isHighlighted;
	}
	
	public void update() {
		
	}


	public boolean isHidden() {
		return isHidden;
	}


	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}
}
