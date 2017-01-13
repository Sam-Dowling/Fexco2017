/*
 *
 *	This Class creates a GUI for selecting what user to log in as.
 *	It is a singleton to allow its controls to be accessed from other classes.
 *	Components:
 *			JLabel : labelUserSelect
 *			JComboBox : comboBoxUserSelect
 *			JButton : buttonUserSelectOK
 *			JButton : buttonUserSelectClose
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUIUserSelect {

	private static JFrame frameUserSelect;
	private static JPanel panelBox, panelFlow;
	private static JLabel labelUserSelect;
	private static JComboBox<String> comboBoxUserSelect;
	private static JButton buttonUserSelectOK, buttonUserSelectClose;

	// This creates a single instance of GUIUserSelect class
	private static GUIUserSelect gui = new GUIUserSelect();

	// This Constructor is private to prevent another instance of this class to be created
	private GUIUserSelect() {
		createComponents();
		addComponents();
		addActionListeners();
	}

	// This returns the only instance of this class to be created
	public static GUIUserSelect getInstance() { return gui; }

	/*
	   Initialize Components and give their default values
	*/
	private void createComponents() {
		frameUserSelect		= new JFrame("Select User");
		panelBox 		= new JPanel();
		panelBox		.setLayout(new BoxLayout(panelBox, BoxLayout.Y_AXIS));
		FlowLayout flow 	= new FlowLayout();
		panelFlow		= new JPanel(flow);
		labelUserSelect		= new JLabel("Select a sample user to log in as");
		String [] userList	= {"Mary", "Tom", "Joe"};
		comboBoxUserSelect	= new JComboBox<>(userList);
		comboBoxUserSelect	.setSelectedIndex(0);
		buttonUserSelectOK	= new JButton("ok");
		buttonUserSelectClose	= new JButton("close");	
	}

	/*
	   Add Components to the correct layouts and add the layouts to the Frame
	*/
	private void addComponents() {
		panelBox	.add(labelUserSelect);
		panelBox	.add(comboBoxUserSelect);
		panelFlow	.add(buttonUserSelectOK);
		panelFlow	.add(buttonUserSelectClose);
		panelBox	.add(panelFlow);
		frameUserSelect	.add(panelBox);	
	}

	/*
	   Add the ActionListeners for OK Button and the Close Button
	*/
	private void addActionListeners() {
		buttonUserSelectOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ok button pressed");
			}
		});

		buttonUserSelectClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Close button pressed");
			}
		});	
	}

	/*
	   Allow other classes to open this gui
	*/
	public static void setFrameVisible(int width, int height) {
		frameUserSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameUserSelect.setSize(width, height);
		frameUserSelect.setVisible(true);
	}

	/*
	   Allows other classes to close this gui
	*/
	public static void closeFrame() {
		frameUserSelect.setVisible(false);
		frameUserSelect.dispose();
	}
}
