package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		System.out.println(shape);
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		StdDraw.setPenColor(red, green, blue);
		boolean filled = in.nextBoolean();
		if (shape.equals("triangle")) {
			double x1 = in.nextDouble();
			double y1 = in.nextDouble();
			double x2 = in.nextDouble();
			double y2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y3 = in.nextDouble();
			double [] xTriangle =  {x1, x2, x3};
			double [] yTriangle = {y1, y2, y3};
			
			if (filled) {
				StdDraw.filledPolygon(xTriangle, yTriangle);
			} else {
				StdDraw.polygon(xTriangle, yTriangle);
			}
		} else {
			double x = in.nextDouble();
			double y = in.nextDouble();
			if (shape.equals("rectangle")) {
				double halfWidth = in.nextDouble();
				double halfHeight = in.nextDouble();
				if (filled) {
					StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
				} else {
					StdDraw.rectangle(x, y, halfWidth, halfHeight);
				}
			}
			if (shape.equals("ellipse")) {
				double semiMajor = in.nextDouble();
				double semiMinor = in.nextDouble();
				if (filled) {
					StdDraw.filledEllipse(x, y, semiMajor, semiMinor);
				} else {
					StdDraw.ellipse(x, y, semiMajor, semiMinor);
				}
			}

		}
	}
}
