//Program for JButton
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class JButtonDemo extends JFrame
{
		JButtonDemo()
		{
			JButton bt1 = new JButton("Yes"); //Creating a Yes Button.
			JButton bt2 = new JButton("No"); //Creating a No Button.
			setLayout(new FlowLayout()); //setting layout using FlowLayout object
			setSize(400, 400); //setting size of Jframe
			add(bt1); //adding Yes button to frame.
			add(bt2); //adding No button to frame.
			setVisible(true);
		}
			public static void main(String[] args)
			{
				 JButtonDemo b=new JButtonDemo();
			}
}