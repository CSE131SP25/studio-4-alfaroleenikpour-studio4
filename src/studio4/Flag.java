package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color lightBlue = new Color (114, 160, 193);
		Color lighterBlue = new Color (128, 218, 235);
		StdDraw.setPenColor(lightBlue);
		StdDraw.filledRectangle(0.5, 0.5, 1, 1);
		StdDraw.setPenRadius(0.25);
		StdDraw.setPenColor(lighterBlue);
		StdDraw.line(0, 0.5, 1, 0.5);
	
		
	}
}