//program for JButtonGroup
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JButtonGroupDemo extends JFrame
	{
		public JButtonGroupDemo()
		{
		JRadioButton b1 = new JRadioButton("A"); //creating JRadioButton.
		add(b1); //adding JRadioButton to frame.
		JRadioButton b2 = new JRadioButton("B"); //creating JRadioButton.
		add(b2); //adding JRadioButton to frame.
 		JRadioButton b3= new JRadioButton("C"); //creating JRadioButton.
		add(b3); //adding JRadioButton to frame.
		JRadioButton b4 = new JRadioButton("D");
		add(b4);
		ButtonGroup bg=new ButtonGroup();
		bg.add(b1);
		bg.add(b2);
		bg.add(b3);
		bg.add(b4);
		setLayout(new FlowLayout());
		setSize(400, 400);
		setVisible(true);
	}
		public static void main(String[] args)
		{
		JButtonGroupDemo bt= new JButtonGroupDemo();
		}
}