//Program for JToggleButton 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JToggleButtonDemo
{	
	JFrame j;
	JToggleButton jt;
	JLabel l;
	JToggleButtonDemo()
	{	
		try
		{
		j=new JFrame();
		j.setSize(1000,1000);
		jt=new JToggleButton("on/off");
		j.add(jt);
		jt.setBounds(130,130,150,130);
		l=new JLabel();
		j.add(l);
		l.setBounds(130,260,100,100);
			
		jt.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
			{
				if(jt.isSelected())
				{	
					l.setText("Button is ON");
				}
				else
				{
					l.setText("Button is OFF");
				}
			}
		});
		j.setLayout(null);
		j.setVisible(true);
		}
		catch(Exception e)	
		{}
	}
		public static void main(String args[])
		{
			JToggleButtonDemo a=new JToggleButtonDemo();
		}
}