import java.awt.*;
class C extends Frame
{
	C()
	{
		RadioButton b1=new RadioButton("1");
		add(b1);
		setBounds(10,10,50,50);
		setLayout(null);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String ars[])
	{
		C a = new C();	
	}
}