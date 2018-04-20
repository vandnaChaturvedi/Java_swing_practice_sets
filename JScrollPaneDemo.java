import javax.swing.*;
import java.awt.*;
class JScrollPaneDemo
{
JButton b ;
	JScrollPaneDemo()
	{	
	JFrame f = new JFrame();
	b= new JButton("Ck");
	JPanel jp=new JPanel();
	jp.setLayout(new GridLayout(20,20));
	for(int i=0;i<20;i++)
	{
		for(int j=0;j<20;j++)
		{
			jp.add(new JButton("Button"+(i+1)));	
		}
	}
	JScrollPane jsp = new JScrollPane(jp);
	
	jsp.setBounds(100,100,500,500);
	f.add(jsp,BorderLayout.CENTER);
	f.setSize(1000,1000);
	f.setLayout(null);
	f.setVisible(true);
	
	}	
	public static void main(String args[])
	{
		JScrollPaneDemo a = new JScrollPaneDemo();
	}

}