package hu.bme.demarci.mastermind;

import java.awt.Color;
import java.awt.Point;

public class ColoredPoint {
	private Color color;
	private Point p;
	
	public ColoredPoint(Color color, Point p) {
		super();
		this.color = color;
		this.p = p;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Point getP() {
		return p;
	}

	public void setP(Point p) {
		this.p = p;
	}
	
	
	
}
