package main;

import java.awt.Color;
import java.awt.Graphics;

public class TextBox extends GameObject {
	
	private String text;
	
	private final int PAD = 15;

	public TextBox(int x, int y) {
		super(x,y, 100, 100);
		text = "";
		selected = false;
	}
	
	public TextBox(int x, int y, int width, int length) {
		super(x,y, width, length);
		selected = false;
		text = "";
	}

	@Override
	public void render(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(x, y, width, height);
		
		g.setColor(Color.DARK_GRAY);
		g.drawRect(x, y, width, height);
		
		g.setColor(Color.BLACK);
		g.drawString(text, x+5, y+20);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
