package main;

import java.awt.*;

public abstract class GameObject {
	
	protected int x;
	protected int y;
	
	public abstract void render(Graphics g);
	
	public abstract void update();
	
	public GameObject() {
		
	}
	
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	public void setY(int y){
		this.y = y;
	}
}

