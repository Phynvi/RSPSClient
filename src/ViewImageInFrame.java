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

	/**
	 * 
	 * @param fullFilePath Full path with image.
	 * @param zoomLevels Number of times to zoom from min to normal size and from normal size to max size. Setting this at 10 means there will be 10 levels of scaled images between the normal image size and its max or min zoomed size.
	 * @param maximumZoom Multiplier of maximum image size in terms of zoom. Setting this at 2 means that the largest the image can be zoomed into is 2 times its original size.
	 * @param drawImages Number of images from natural size to draw in zoom. If this is set to 2, this means that the 2 immediate smaller and larger images will be drawn in memory in relation to the natural image.
	 */
	public ViewImageInFrame(String fullFilePath, int zoomLevels, double maximumZoom, int drawImages, int windowWidth, int windowHeight) {
		super();
		Container container = getContentPane();

		try{
			canvas = new DisplayCanvas(fullFilePath, zoomLevels, maximumZoom, drawImages);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		container.add(canvas);

		setSize(windowWidth, windowHeight);
	}

}

class DisplayCanvas extends JPanel {
	int x, y;

	BufferedImage bi;

	Image _image = null;
	String _fullFilePath = null;
			
	Image[] _images = null;
	int _index;
	
	public boolean debugMode = false;
	
	private void debug(String origin, String message){
		if(debugMode)
			System.out.println("[DEBUG] ["+origin+"] "+message);
	}
	
	private Image getSmallerImage(){
		int tempIndex = _index - 1;
		if(tempIndex >= 0){
			_index = tempIndex;
			return _images[_index];
		}
		return null;
	}
	
	private Image getLargerImage(){
		int tempIndex = _index + 1;
		if(tempIndex < _images.length-1 && _images[tempIndex] != null){
			_index = tempIndex;
			return _images[_index];
		}
		return null;
	}
	
	private Image getScaledInstance(Image img, double scaleW,double scaleH, int hints){
		return img.getScaledInstance(  (int)(((double)img.getWidth(null))*scaleW)  , (int)(((double)img.getHeight(null))*scaleH), hints);
	}
	
	/**
	 * Will populate _images and _index.
	 * Will also pre render in range of drawImages to memory.
	 */
	private void populateImageScales(int zoomLevels, double maximumZoom, int drawImages){
		int totalImages = (int)((double)zoomLevels*maximumZoom);
		_images = new Image[totalImages];
		
		_index = totalImages/2;
		double zoomOffset = 1.0/(double)zoomLevels;
		debug("populateImageScales", "zoomOffset :"+zoomOffset);
		
		double currentOffset = 0;
		for(int i = 0; i < _images.length; i++){
			currentOffset += zoomOffset;
			debug("populateImageScales", "Assigning offset "+currentOffset);
			debug("populateImageScales", "To index "+i);
			_images[i] = getScaledInstance(_image, currentOffset, currentOffset, BufferedImage.TYPE_INT_ARGB);
			if( (_index-drawImages) <= i && i <= (_index+drawImages) ){
				debug("PRE-RENDER", "Drawing image at index "+i+" to memory.");
				BufferedImage b = new BufferedImage(_images[i].getWidth(this), _images[i].getHeight(this),
						BufferedImage.TYPE_INT_ARGB);
				Graphics2D big = b.createGraphics();
				big.drawImage(_images[i], 0, 0, this);
			}
			
		}
	}
	
	DisplayCanvas(String fullFilePath, int zoomLevels, double maximumZoom, int drawImages) throws IOException {
		_fullFilePath = fullFilePath;
		setBackground(Color.black);
		addMouseListener(new MousePressedHandler());
		addMouseMotionListener(new MouseMotionHandler());
		addMouseWheelListener(new MouseScrollWheelHandler());

		_image = ImageIO.read(new File(fullFilePath));
		_image = _image.getScaledInstance(_image.getWidth(this),  _image.getHeight(this), BufferedImage.TYPE_INT_ARGB);

		//draw images in memory and preload image sizes
		populateImageScales(zoomLevels, maximumZoom, drawImages);
		_image = _images[_index];
		
		MediaTracker mt = new MediaTracker(this);
		mt.addImage(_image, 1);
		try {
			mt.waitForAll();
		} catch (Exception e) {
			e.printStackTrace();
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

	class MouseScrollWheelHandler extends MouseAdapter{
		public void mouseWheelMoved(MouseWheelEvent e){
			int scrollAmount = e.getWheelRotation();
			Image tempImage = null;
			if(scrollAmount > 0){ //scroll up
				tempImage = getSmallerImage();
			}
			else if(scrollAmount < 0){ //scroll down
				tempImage = getLargerImage();
			}
			if(tempImage != null)
				_image = tempImage;
			else
				return;
			bi = new BufferedImage(_image.getWidth(null), _image.getHeight(null),  BufferedImage.SCALE_REPLICATE);
			Graphics2D g = bi.createGraphics();
			g.drawImage(_image,0,0,null);
			g.dispose();
			repaint();
		}
	}
	
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