package loop.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

import loop.controller.LoopController;
/**
 * 
 * @author Aly Molling
 *@version 1.2 11/5/13 basic frame work, setupPanel
 */

public class LoopPanel extends JPanel
{
	private LoopController baseController;
	private SpringLayout baseLayout;
	private JTextArea loopTextArea;
	private JButton submitButton;
	private JScrollPane textPane;
	
	/**
	 * creates a loop panel object linked via the controller for MVC paradigm.
	 * @param baseController
	 */
	

	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10,20);
		submitButton = new JButton("click here :D");
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 66, SpringLayout.NORTH, this);
		textPane = new JScrollPane(loopTextArea);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 51, SpringLayout.EAST, textPane);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/*
	 * Adds all components to the panel, sets color and component settings.
	 */
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(120, 50, 220));
		this.add(submitButton);
		this.add(textPane);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopTextArea.append(baseController.getLoopResults());
			}
		});
				
	}
	
	
}
