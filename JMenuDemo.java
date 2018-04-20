//program for JMenuDemo
import java.awt.*;
import javax.swing.*;
public class JMenuDemo extends JFrame
{
	JMenu  jmenu,jopt,jhelp;
	JMenuItem jopen,jclose,jsave,jexit;
	public JMenuDemo()
	{	
		setSize(300,300);
		JMenuBar jmb=new JMenuBar();
		add(jmb);
		jmenu=new JMenu("Files");//create the file menu
		jopt=new JMenu("Options");//create the file menu
		jhelp=new JMenu("Help");//create the file menu
		//create the file submenu for file
		jopen=new JMenuItem("Open");
		jclose=new JMenuItem("Close");
		jsave=new JMenuItem("Save");
		jexit=new JMenuItem("Exit");
		jmenu.add(jopen);
		jmenu.add(jclose);
		jmenu.add(jsave);
		jmenu.add(jexit);
		jmb.add(jmenu);
		jmb.add(jopt);
		jmb.add(jhelp);
		jmb.setBounds(100,100,160,50);
		setLayout(null);
		setVisible(true);
	
	}
		public static void main(String args[])
		{
			JMenuDemo a=new JMenuDemo();
		}
}