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
	
	}

	/*
	   Add the ActionListeners for OK Button and the Close Button
	*/
	private void addActionListeners() {
	
	}

	/*
	   Allow other classes to open this gui
	*/
	public static void setFrameVisible() {
	
	}

	/*
	   Allows other classes to close this gui
	*/
	public static void closeFrame() {
	
	}
}
