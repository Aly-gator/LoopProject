package loop.controller;


import loop.model.Looper;
import loop.view.LoopFrame;

/**
 * Controller object for the loop project
 * @author Aly Molling
 *@version 1.0 11/5/13 Added data members and start method.
 */

public class LoopController
{
	private LoopFrame appFrame;
	private Looper myLooper;
	
	public LoopController()
	{
		this.myLooper = new Looper();
	}
	
	/**
	 * Starts the application.
	 */
	
	
	public void start()
	{
		appFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String currentResults = myLooper.loopTestTwo();
		
		return currentResults;
	}
	
	private String getText(int position)
	{
		String results = "";
		
		results = myLooper.getGraveNameList().get(position);
		
		return results;
	}

}
