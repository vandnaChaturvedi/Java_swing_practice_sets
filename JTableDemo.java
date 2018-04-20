import javax.swing.*;
import java.awt.*;
public class JTableDemo
 {
	 JFrame f;
 	public JTableDemo()
	{
 		f=new JFrame();
		String data[][]={ {"101","Amit","670000"},{"102","Jai","780000"}, {"101","Sachin","700000" }};
 		String column[]={"ID","NAME","SALARY"};
 		JTable jt=new JTable(data,column);
 		jt.setBounds(30,40,200,300);
 		//JScrollPane sp=new JScrollPane(jt);
 		f.add(jt);
 		f.setSize(300,400);
 		f.setVisible(true);
 	}
 			public static void main(String[] args)
			 {
				 JTableDemo j=new JTableDemo();			
 			}
 }
