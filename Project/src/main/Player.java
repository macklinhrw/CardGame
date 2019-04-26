package main;

public class Player {
	
	private boolean isComp;
	private Hand h;
	private int points;
	private GameObject hoverObject;
	private boolean hasLost;
	private GameObject selectedObject;
	
	public Player(boolean isComp)
	{
		this.isComp = isComp;
	}
	
	public boolean isComp()
	{
		return isComp;
	}
	
	public void setPoints(int p)
	{
		points = p;
	}
	
	public int getPoints()
	{
		return points;
	}
	
	public Hand getHand()
	{
		return h;
	}
	
	public void setHand(Hand h)
	{
		this.h = h;
	}
	
	public GameObject getHoverObject() {
		return hoverObject;
	}

	public void setHoverObject(GameObject hoverObject) {
		this.hoverObject = hoverObject;
	}

	public GameObject getSelectedObject() {
		return selectedObject;
	}

	public void setSelectedObject(GameObject selectedObject) {
		this.selectedObject = selectedObject;
	}
}
