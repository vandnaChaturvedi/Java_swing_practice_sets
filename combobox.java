import java.awt.event.*;  
    import java.awt.*;  
    import javax.swing.*; 
      
    public class combobox extends JFrame implements ActionListener{  
JTextField tf1;  
JComboBox dd1;
JButton b1;

    combobox(){  
       tf1=new JTextField();  
    tf1.setBounds(20,50,200,30);  
tf1.setEnabled(false);
String country[]={"--Select--","India","Aus","U.S.A","England","Newzeland"};  
dd1=new JComboBox(country); 
 dd1.setBounds(20,10,100,30); 
    b1=new JButton("Click Me");  
    b1.setBounds(140,10,100, 30); 
          b1.addActionListener(this); 
add(dd1);    
    add(b1);  
     add(tf1);   
    
    setSize(300,400);  
    setLayout(null);  
    setVisible(true);                
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                
        }  
    public void actionPerformed(ActionEvent e)
{    tf1.setText("Ur country is "+dd1.getSelectedItem( ));     }  
          
    public static void main(String[] args) {  
     combobox ob=new combobox();      }      }  


 
 
