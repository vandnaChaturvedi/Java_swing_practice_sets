//Program for JListDemo
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JScrollPane.*;
class JListDemo extends JFrame
{	
	JList<String>jl;
	JScrollPane jsp;
	public JListDemo()
	{	
		setSize(1000,1000);
		DefaultListModel<String> l=new DefaultListModel<>();
		l.addElement("delhi");
		l.addElement("bareilly");
		l.addElement("rajasthan");
		l.addElement("Haldwani");
		l.addElement("hong kong");
		l.addElement("MP");
		l.addElement("china");
		l.addElement("bejing");
		jl=new JList<String>(l);
		jl.setBounds(100,100,130,100);
		add(jl);
		jsp=new JScrollPane(jl);
		jsp.setBounds(100,100,130,100);
		add(jsp);
		setLayout(null);
		setVisible(true);	
	}
		public static void main(String args[])
		{
			JListDemo b=new JListDemo();
		}
}