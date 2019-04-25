package main;

import java.awt.*;

public abstract class GameObject {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected boolean selected;
	protected boolean hovering;
	
	public abstract void render(Graphics g);
	
	public abstract void update();
	
	public GameObject() {
		
	}
	
	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 0;
		this.height = 0;
		selected = false;
	}
	
	public GameObject(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		selected = false;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setY(int y){
		this.y = y;
	}
	
	public boolean hitClip(int x, int y) {
		//System.out.println("this-x: " + this.x + '\n' + "x: " + x + '\n' + "width: " + width + '\n' + "this-y: " + this.y + '\n' + "y: " + y + '\n' + "height: " + height);
		//System.out.println("" + (this.x < x && x < this.x + width) + " " + (this.y < y && y < this.y + height) + '\n');
		return (this.x < x && x < this.x + width) && (this.y < y && y < this.y + height);
	}

	public boolean isHovering() {
		return hovering;
	}

	public void setHovering(boolean hovering) {
		this.hovering = hovering;
	}
	
	
}

