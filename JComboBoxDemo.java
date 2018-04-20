//program for JComboBoxDemo
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JComboBoxDemo extends JFrame
{
	
		String name[] = {"Abhi","Adam","Alex","Ashkay"}; 
		public JComboBoxDemo()
		{
		JComboBox jc = new JComboBox(name); 
		add(jc); //adding JComboBox to frame.
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
		}
		public static void main(String args[])
		{
			JComboBoxDemo j=new JComboBoxDemo();
		}
}