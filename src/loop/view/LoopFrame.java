package loop.view;

import javax.swing.JFrame;

import loop.controller.LoopController;

public class LoopFrame extends JFrame
/**
 * the referenced controller object.
 */
{
	private LoopController baseController;
	/**
	 * 
	 * the applications main panel for GUI.
	 */
	private LoopPanel basePanel;
	/**
	 * 
	 * creates a loop frame object.
	 * @param baseController
	 */
	
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
	}
	/**
	 * sets the content, size and visibility of the frame.
	 */

	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(450, 450);
		this.setVisible(true);
	}
}
