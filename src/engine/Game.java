package engine;

public class Game {
	
	private Deck d;
	private Player p1;
	private Player p2;
	private boolean playerTurn;
	private Handler h;
	private Hand h1;
	private Hand h2;
	private Hand mid;
	private int turnPhase;
	private int turn;
	private boolean enterText;
	private Text textString;
//	private Text mouseCoord;
	
	public Game(Handler h)
	{
		textString = new Text("", 100, 500);
		enterText = false;
		d = new Deck();
		p1 = new Player(false);
		p2 = new Player(true);
		h1 = new Hand(200, 300);
		h2 = new Hand(200, 100);
		mid = new Hand(200,200);
		p1.setHand(mid);
		p2.setHand(h1);
		playerTurn = true;
		this.h = h;
	}
	
	public void start()
	{
		setup();
		h.add(h1);
		h.add(h2);
		h.add(mid);
		h.add(textString);
	}
	
	public void setup() {
		turn = 0;
		turnPhase = 0;
		mid.drawCards(d, 3);
		h1.drawCards(d, 6);
		h2.drawCards(d, 2);
		h2.setHidden(true);
	}
	
	public void drawCard() {
		mid.drawCards(d, 1);
	}
	
	public boolean canDraw() {
		return turnPhase == 0;
	}
	
	public void registerKey(String key) {
		if(enterText && !key.equalsIgnoreCase("/")) {
			textString.setString(textString.getString() + key);
		} else if(key.equalsIgnoreCase("d") && canDraw()) {
			drawCard();
		} else if(key.equalsIgnoreCase("s")) {
			h1.shuffleCards(d);
			h2.shuffleCards(d);
			mid.shuffleCards(d);
			setup();
		} else if(key.equalsIgnoreCase("h")) {
			h2.setHidden(!h2.isHidden());
		} else if(key.equalsIgnoreCase("/")) {
			textString.setString("");
			enterText = !enterText;
		}
	}
	
	public void registerMouse(int x, int y) {
//		System.out.println("Move: " + x + " " + y);
//		if(mouseCoord == null)
//		{
//			mouseCoord = new Text("X: " + x + ", Y: " + y, 500, 500);
//			h.add(mouseCoord);
//		}
//		mouseCoord.setString("X: " + x + ", Y: " + y);
		int index = h1.getHit(x, y);
		if(index != -1) {
			Card c = h1.get(h1.getHit(x, y));
			c.setHighlight(true);
			p1.setSelectedCard(c);
			p1.setSelectedCardIndex(index);
			p1.setHovering(true);
		} else if (p1.isHovering()) {
			for(int i = 0; i < h1.numCards(); i++) {
				Card c = h1.get(i);
				p1.setSelectedCard(null);
				p1.setSelectedCardIndex(-1);
				c.setHighlight(false);
			}
			p1.setHovering(false);
		}
		
		
	}
	
	public void registerClick(int x, int y) {
		if(p1.isHovering()) {
			int i = p1.getSelectedCardIndex();
			Card c = h1.remove(i);
			c.setHighlight(false);
			d.add(c);
			d.shuffle();
			h1.drawCards(d, 1);
		}
	}
}
