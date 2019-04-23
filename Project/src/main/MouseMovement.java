package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMovement implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		Game g = Main.g;
		g.registerMouse(e.getX(), e.getY());
	}

}
