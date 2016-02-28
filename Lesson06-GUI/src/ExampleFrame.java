import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

import Assets.*;

import javax.swing.JLabel;

public class ExampleFrame extends JFrame {

	//Private Instance Variable
	private JLabel _firstNameLabel;
	private Icon _gil;

	/**
	 * Create the frame.
	 * --------Constructor--------
	 */
	//Private Method
	public ExampleFrame() {
		super("Example Frame");
		_initialize();
	}

	private void _initialize() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout());
		
	    this._gil = new ImageIcon(ExampleFrame.class.getResource("/Assets/gil.jpg"));
		
		this._firstNameLabel = new JLabel("First Name: ", SwingConstants.CENTER);
		this._firstNameLabel.setIcon(this._gil);//Set Gil Image
		getContentPane().add(this._firstNameLabel);
	}
}
