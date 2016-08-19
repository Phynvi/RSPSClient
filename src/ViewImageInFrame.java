import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseWheelEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class ViewImageInFrame extends JFrame {
	DisplayCanvas canvas;

	public ViewImageInFrame(String fullFilePath) {
		super();
		Container container = getContentPane();

		try{
			canvas = new DisplayCanvas(fullFilePath);
		}
		catch(Exception e){}
		
		container.add(canvas);

		setSize(450, 400);
	}

}

class DisplayCanvas extends JPanel {
	int x, y;

	BufferedImage bi;

	Image _image = null;
	
	DisplayCanvas(String fullFilePath) throws IOException {
		setBackground(Color.white);
		setSize(450, 400);
		addMouseListener(new MousePressedHandler());
		addMouseMotionListener(new MouseMotionHandler());
		//addMouseWheelListener(new MouseScrollWheelHandler());

		_image = ImageIO.read(new File(fullFilePath));
		_image = _image.getScaledInstance(_image.getWidth(this),  _image.getHeight(this), BufferedImage.TYPE_INT_ARGB);

		MediaTracker mt = new MediaTracker(this);
		mt.addImage(_image, 1);
		try {
			mt.waitForAll();
		} catch (Exception e) {
			System.out.println("Exception while loading image.");
		}

		if (_image.getWidth(this) == -1) {
			System.out.println("no gif file");
			System.exit(0);
		}

		bi = new BufferedImage(_image.getWidth(this), _image.getHeight(this),
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D big = bi.createGraphics();
		big.drawImage(_image, 0, 0, this);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;

		g2D.drawImage(bi, x, y, this);
	}
	
	private int offsetX = 0;
	private int offsetY = 0;

//	class MouseScrollWheelHandler extends MouseAdapter{
//		public void mouseWheelMoved(MouseWheelEvent e){
//			int scrollAmount = e.getWheelRotation();
//			if(scrollAmount > 0){
//				Image i = bi.getScaledInstance(bi.getWidth()+100, bi.getHeight()+100, Image.SCALE_SMOOTH);
//				BufferedImage b = new BufferedImage(i.getWidth(null), i.getHeight(null), BufferedImage.SCALE_SMOOTH);
//				Graphics2D g = b.createGraphics();
//				g.drawImage(i,0,0,null);
//				g.dispose();
//				bi = b;
//				repaint();
//			}
//			else if(scrollAmount < 0){
//				Image i = bi.getScaledInstance(bi.getWidth()-100, bi.getHeight()-100, Image.SCALE_SMOOTH);
//				BufferedImage b = new BufferedImage(i.getWidth(null), i.getHeight(null), BufferedImage.SCALE_SMOOTH);
//				Graphics2D g = b.createGraphics();
//				g.drawImage(i,0,0,null);
//				g.dispose();
//				repaint();
//			}
//		}
//	}
	
	class MousePressedHandler extends MouseAdapter {
		public void mousePressed(MouseEvent e){
			int oldX = x;
			int oldY = y;
			
			Point imageUpperLeft = new Point(oldX, oldY);

			Point p = e.getPoint();
			
			offsetX = p.x-imageUpperLeft.x;
			offsetY = p.y-imageUpperLeft.y;
		}
	}
	
	class MouseMotionHandler extends MouseAdapter {
		
		public void mouseDragged(MouseEvent e) {			
			Point p = e.getPoint();
			
			x = p.x-offsetX;
			y = p.y-offsetY;
			repaint();
		}
	}
}