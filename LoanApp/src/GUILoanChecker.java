/*
 *
 *	This Class creates a GUI for the user to check the probability of them getting a loan.
 *	It is a singleton to allow its controls to be accessed from other classes.
 *	Components:
 *			JLabel : labelLoanCheckerType
 *			JLabel : labelLoanCheckerAmount
 *			JComboBox : comboBoxLoanCheckerType
 *			JTextField : textFieldLoanCheckerAmount
 *			JButton : buttonLoanCheckerOK
 *			JButton : buttonLoanCheckerCancel
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUILoanChecker {

	private static JFrame frameLoanChecker;
	private static JPanel panelBox, panelFlow1, panelFlow2, panelFlow3;
	private static JLabel labelLoanCheckerType, labelLoanCheckerAmount;
	private static JComboBox<String> comboBoxLoanCheckerType;
	private static JTextField textFieldLoanCheckerAmount;
	private static JButton buttonLoanCheckerOK, buttonLoanCheckerCancel;

	// This creates a single instance of GUIUserSelect class
	private static GUILoanChecker gui = new GUILoanChecker();

	// This Constructor is private to prevent another instance of this class to be created
	private GUILoanChecker() {
		createComponents();
		addComponents();
		addActionListeners();
	}

	// This returns the only instance of this class to be created
	public static GUILoanChecker getInstance() { return gui; }

	/*
	   Initialize Components and give their default values
	*/
	private void createComponents() {
		frameLoanChecker		= new JFrame("Enter Loan Details");
		panelBox 			= new JPanel();
		panelBox			.setLayout(new BoxLayout(panelBox, BoxLayout.Y_AXIS));
		FlowLayout flow 		= new FlowLayout();
		panelFlow1			= new JPanel(flow);
		panelFlow2			= new JPanel(flow);
		panelFlow3			= new JPanel(flow);
		labelLoanCheckerType		= new JLabel("Type of Loan");
		labelLoanCheckerAmount		= new JLabel("Amount for Loan");
		String [] typeList		= {"Car Loan", "Mortgage", "Business Loan"};
		comboBoxLoanCheckerType 	= new JComboBox<>(typeList);
		textFieldLoanCheckerAmount	= new JTextField(20);
		buttonLoanCheckerOK		= new JButton("ok");
		buttonLoanCheckerCancel 	= new JButton("cancel");
	}

	/*
	   Add Components to the correct layouts and add the layouts to the Frame
	*/
	private void addComponents() {
		panelFlow1	.add(labelLoanCheckerType);
		panelFlow1	.add(comboBoxLoanCheckerType);
		panelFlow2	.add(labelLoanCheckerAmount);
		panelFlow2	.add(textFieldLoanCheckerAmount);
		panelFlow3	.add(buttonLoanCheckerOK);
		panelFlow3	.add(buttonLoanCheckerCancel);
		panelBox	.add(panelFlow1);
		panelBox	.add(panelFlow2);
		panelBox	.add(panelFlow3);
		frameLoanChecker.add(panelBox);
	}

	/*
	   Add the ActionListeners for OK Button and the Close Button
	*/
	private void addActionListeners() {
		buttonLoanCheckerOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ok button pressed");
			}
		});

		buttonLoanCheckerCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cancel button pressed");
			}
		});	
	}

	/*
	   Allow other classes to open this gui
	*/
	public static void setFrameVisible(int width, int height) {
		frameLoanChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLoanChecker.setSize(width, height);
		frameLoanChecker.setVisible(true);
	}

	/*
	   Allows other classes to close this gui
	*/
	public static void closeFrame() {
		frameLoanChecker.setVisible(false);
		frameLoanChecker.dispose();
	}
}
