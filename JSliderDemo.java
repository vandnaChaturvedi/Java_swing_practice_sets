//Program for JSliderDemo
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JSliderDemo extends JFrame
{
	JSlider js;
	public JSliderDemo()
	{
		this.setSize(300,300);
		js=new JSlider(JSlider.HORIZONTAL);
		js.setBounds(100,100,130,20);
		this.add(js);
		this.setLayout(null);
		this.setVisible(true);
	}
		public static void main(String args[])
		{
			JSliderDemo a=new JSliderDemo();
		}
}
