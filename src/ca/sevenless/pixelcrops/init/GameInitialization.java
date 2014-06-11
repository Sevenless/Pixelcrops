/**
 * 
 */
package ca.sevenless.pixelcrops.init;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import ca.sevenless.pixelcrops.display.WindowManager;
import ca.sevenless.pixelcrops.gui.GameKeyListener;
import ca.sevenless.pixelcrops.gui.GameMouseListener;
import ca.sevenless.pixelcrops.world.World;

/**
 * Initializes game client
 * 
 * @author Sevenless
 *
 */
public class GameInitialization {

	private WindowManager graphicsManager;
	private GameKeyListener keyListener;
	private GameMouseListener mouseListener;

	private World gameWorld;
	
	/*
	 * All setup code that is hard coded should be placed below this comment and filtered into the
	 * appropriate places via constructor params. No other variable setup code should be in src files.
	 * Test files can be used for that, bad sevenless!
	 */
	
	//Setup values for inventory dimensions
	private int invX = 4;
	private int invY = 4;
	//Setup values for farm dimensions
	private int farmX = 1;
	private int farmY = 1;
	
	//Location of graphical resources
	private String graphicResourceDirectory = "res";
	private List<String> imageFormats = Arrays.asList(".png",".jpg");
	
	/**
	 * Handles game setup by initializing graphics, data and socket managers
	 */
	public GameInitialization(){

		initListeners();
		initGameWorld();
		//TODO don't pass a null tileSet like you're doing you lazy bumkisser
		try {
			graphicsManager = new WindowManager(this, 
					keyListener, mouseListener, //Window listeners
					graphicResourceDirectory, imageFormats,
					null, false, 30);
		} catch (IOException e) {
			System.out.println("Graphics failed to load successfully");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	/**
	 * Initializes the game world
	 */
	private void initGameWorld(){
		
		//TODO pass tileSet generated by world logic to display code
		//TODO allow code to be loaded from memory if present
		gameWorld = new World(farmX, farmY, invX, invY);
		
	}
	
	/*
	 * Initializes the listeners to be attached to the canvas
	 */
	private void initListeners(){
		keyListener = new GameKeyListener(this);
		mouseListener = new GameMouseListener(this, null);
	}
	
	/**
	 * Calls the appropriate code to cleanup client resources before program closure
	 */
	public void endProgram() {
		
		//TODO Actually do cleanup you lazy trash eater
		System.exit(0);
		
	}
	
	/**
	 * initialization code for PixelCrops
	 */
	public static void main(String[] args){
		@SuppressWarnings("unused")
		GameInitialization main = new GameInitialization();
	}
	
}
