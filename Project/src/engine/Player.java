package engine;

public class Player {
	
	private boolean isComp;
	private Hand h;
	private int points;
	private boolean isHovering = false;
	private Card selectedCard;
	private int selectedCardIndex;
	private boolean hasLost;
	
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

	public int getSelectedCardIndex() {
		return selectedCardIndex;
	}

	public void setSelectedCardIndex(int selectedCardIndex) {
		this.selectedCardIndex = selectedCardIndex;
	}

	public Card getSelectedCard() {
		return selectedCard;
	}

	public void setSelectedCard(Card selectedCard) {
		this.selectedCard = selectedCard;
	}

	public boolean isHovering() {
		return isHovering;
	}

	public void setHovering(boolean isHovering) {
		this.isHovering = isHovering;
	}
}
