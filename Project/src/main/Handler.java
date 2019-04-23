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
}
