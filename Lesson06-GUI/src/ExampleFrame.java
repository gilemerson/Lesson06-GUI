import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ExampleFrame extends JFrame {

	//Private Instance Variable
	private JPanel _contentPanel;

	/**
	 * Create the frame.
	 * --------Constructor--------
	 */
	public ExampleFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		this._contentPanel = new JPanel();
		this._contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		this._contentPanel.setLayout(new BorderLayout(0, 0));
		setContentPane(this._contentPanel);
	}
}
