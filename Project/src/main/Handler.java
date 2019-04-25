package main;

import java.util.ArrayList;
import java.awt.*;

public class Handler {
	
	private ArrayList<GameObject> objects = new ArrayList<GameObject>();
	
	public Handler()
	{
		
	}
	
	public void renderObjects(Graphics g)
	{
		for(GameObject c : objects)
		{
			c.render(g);
		}
	}
	
	public void updateObjects()
	{
		for(GameObject c : objects)
		{
			c.update();
		}
	}
	
	public GameObject get(int index)
	{
		return objects.get(index);
	}
	
	public void add(GameObject o)
	{
		objects.add(o);
	}
	
	/** 
	 * Goes through objects list to
	 * find object that mouse is currently
	 * hovering over according to x, y params.
	 * @param x Mouse x coordinate.
	 * @param y Mouse y coordinate.
	 * @return returns GameObject mouse is hovering over.
	 * 
	 */
	
	public GameObject hoverObject(int x, int y) {
		
		for(GameObject c : objects)
		{
			if(c.hitClip(x, y))
				return c;
		}
		return null;
	}
}
