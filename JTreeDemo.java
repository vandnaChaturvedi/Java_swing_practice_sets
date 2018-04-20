//Program for JTree
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import javax.swing.tree.*;
import javax.swing.tree.DefaultMutableTreeNode.*;
public class JTreeDemo
{	
	JTree tree;
	JTreeDemo()
	{
		JFrame f;	
		try
		{
		f=new JFrame();
				
		DefaultMutableTreeNode top=new DefaultMutableTreeNode ("opt");
		
		DefaultMutableTreeNode a=new DefaultMutableTreeNode ("A");
		top.add(a);
		DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
		a.add(a1);
		DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
		a.add(a2);
		
		DefaultMutableTreeNode b=new DefaultMutableTreeNode ("B");
		top.add(b);
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
		b.add(b1);
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
		b.add(b2);

		tree=new JTree(top);
		tree.setBounds(100,100,500,500);
		//JScrollPane js=new JScrollPane(tree);
		//f.add(js);
		f.add(tree);

		//js.setBounds(100,100,500,500);
		f.setSize(1000,1000);
		
		f.setLayout(null);
		f.setVisible(true);
		
		}
		
		catch(Exception e)
		{}
						
	}	
	public static void main(String args[])
	{
		JTreeDemo jt=new JTreeDemo();
	}
}
