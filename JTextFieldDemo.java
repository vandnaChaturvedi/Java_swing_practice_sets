//program for Jtextfield
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JTextFieldDemo extends JFrame
{
	public JTextFieldDemo()
	{
		JTextField jtf = new JTextField(20); //creating JTextField.
		add(jtf); //adding JTextField to frame.
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
	}
		public static void main(String[] args)
		{
			JTextFieldDemo j=new JTextFieldDemo();
		}
}