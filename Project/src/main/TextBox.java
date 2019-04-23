package main;

import java.awt.Graphics;

public class TextBox extends GameObject {
	
	private String text;
	
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

}
