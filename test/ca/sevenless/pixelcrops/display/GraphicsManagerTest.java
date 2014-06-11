/**
 * 
 */
package ca.sevenless.pixelcrops.display;

import java.awt.image.BufferedImage;
import java.io.IOException;

import ca.sevenless.pixelcrops.gui.GameKeyListener;
import ca.sevenless.pixelcrops.gui.GameMouseListener;
import ca.sevenless.pixelcrops.init.GameInitialization;
import ca.sevenless.pixelcrops.util.ImageLoader;
import ca.sevenless.pixelcrops.world.Tile;

/**
 * @author Sevenless
 *
 */
public class GraphicsManagerTest extends WindowManager{
	

	public BufferedImage testImage;

	/**
	 * @param _main
	 * @param keyListener
	 * @param mouseListener
	 * @param _fullscreen
	 * @param _frameRate
	 */
	public GraphicsManagerTest(GameInitialization _main,
			GameKeyListener keyListener, GameMouseListener mouseListener,
			boolean _fullscreen, int _frameRate) {
		//TODO passing null tileSet gunna make you craaaaAaaaash
		super(_main, keyListener, mouseListener, null, _fullscreen, _frameRate);
	}
	
	private void loadGraphicResources(){
		try {
			testImage = ImageLoader.createImageIO("yellowcircle.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	private void initDisplayObjects(){
		Tile[][] tileSet = new Tile[2][2];
		
		displayFarm = new DisplayFarm(tileSet);
	}
	
}
