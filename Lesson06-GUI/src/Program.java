import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Program {

	public static void main(String[] args) {
		
		
		ExampleFrame myFrame = new ExampleFrame();
		myFrame.setVisible(true);
		
		Dimension dialogDimensions = new Dimension(500, 300);
		//firstName =  JOptionPane.showInputDialog("Enter Your First Name:");	
		//lastName =  JOptionPane.showInputDialog("Enter Your Last Name:");
		
		//JOptionPane.showMessageDialog(null, "FirstName: " + firstName + "\nLast Name: " + lastName, "Profile Info", JOptionPane.PLAIN_MESSAGE);
		//messageReturn = JOptionPane.showConfirmDialog(null, "Error: Incorrect Input", "Error", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
		//System.out.println(messageReturn);
		
		
		
		//EnstansiTE Object
		myFrame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		myFrame.setSize(dialogDimensions);
		myFrame.setMinimumSize(dialogDimensions);
		myFrame.setMaximumSize(dialogDimensions);
		myFrame.setVisible(true);
	}
	
}
