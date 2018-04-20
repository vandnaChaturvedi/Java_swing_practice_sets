//program for jtextarea
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JTextAreaDemo extends JFrame
{
	//JApplet jp;
	JTextArea ja;
	public JTextAreaDemo()
	{
		//jp=new JApplet("This is an Example for TextArea");
		ja=new JTextArea();
		this.setSize(1000,1000);
		ja.setBounds(100,100,200,50);
		add(ja);
		this.setLayout(null);
		this.setVisible(true);
		
	}
		public static void main(String args[])
		{
			JTextAreaDemo c=new JTextAreaDemo();
		}
}