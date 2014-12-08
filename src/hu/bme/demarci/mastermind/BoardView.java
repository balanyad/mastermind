package hu.bme.demarci.mastermind;

import hu.bme.demarci.mastermind.logic.MastermindLogic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class BoardView extends Canvas {

	ArrayList<Point> l = new ArrayList<Point>();

	public BoardView () {
        setBackground (Color.GRAY);
        setSize(300, 480);
        
this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
				for (int i = MastermindLogic.round*4; i < (((MastermindLogic.round+1)*4)-1); i++) {
					boolean b = inCircle(Game.centerOfCirclesGuess.get(i).x,Game.centerOfCirclesGuess.get(i).y, e.getX(), e.getY(), 40);
					if(b){
						l.add(new Point(Game.centerOfCirclesGuess.get(i).x, Game.centerOfCirclesGuess.get(i).y));
						System.out.println(Game.centerOfCirclesGuess.get(i));
					}
					
				}
				
				repaint();
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
     }

	@Override
	public void paint(Graphics g) {
		final Graphics2D g2 = (Graphics2D) g;

		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("bg.png"));
		} catch (IOException e) {
		}
		if (img != null)
			g2.drawImage(img, 0, 0, null);

		g.setColor(Color.WHITE);
		drawCenteredCircle(g2, 20, 21, 14);

		for (Point point : l) {
			drawCenteredCircle(g2, point.x, point.y, 40);
		}

		g2.dispose();
	}

	public void drawCenteredCircle(Graphics2D g, int x, int y, int r) {
		x = x - (r / 2);
		y = y - (r / 2);
		g.fillOval(x, y, r, r);
	}

	public boolean inCircle(int circleX, int circleY, int clickX, int clickY, int radius) {
		return java.lang.Math.pow((circleX + radius - clickX), 2)
				+ java.lang.Math.pow((circleY + radius - clickY), 2) < java.lang.Math.pow(radius, 2);
	}

}
