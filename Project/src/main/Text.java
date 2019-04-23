package main;

import java.awt.Color;
import java.awt.Graphics;

public class Text extends GameObject {

	private String s;
	
	public Text(String s, int x, int y) {
		this.s = s;
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.drawString(s, x, y);
		
	}

	public String getString() {
		return s;
	}

	public void setString(String s) {
		this.s = s;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
