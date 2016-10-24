import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;

public class A extends JFrame implements ActionListener
{
	JButton but1,but2,but3,bexit,bback;
	JLabel l1,l2,l3;
	public A()
	{
		//setLayout(new BorderLayout());
		setLayout(null);
		//JLabel bg1 = new JLabel(new ImageIcon("EDi.jpg"));
		//JLabel bg2 = new JLabel(new ImageIcon("ss2.jpg"));
		ImageIcon aa=new ImageIcon("simpleedi1.jpg");
		ImageIcon bb=new ImageIcon("simpleedi2.jpg");
		ImageIcon cc=new ImageIcon("guiedi11.jpg");
		but1 = new JButton(aa);
		but2 = new JButton(bb);
		but3 = new JButton(cc);
		bexit = new JButton("EXIT");
		bback = new JButton("LOG OUT");
		
		l1 = new JLabel("CLICK THE IMAGE BELOW FOR SIMPLE PRORAMS-1\n");
		l2 = new JLabel("CLICK THE IMAGE BELOW FOR SIMPLE PRORAMS-2\n");
		l3 = new JLabel("CLICK THE IMAGE BELOW FOR GUI PROGRAMS\n");

		l1.setBounds(10,110,450,30);
		l2.setBounds(460,110,450,30);
		l3.setBounds(910,110,450,30);

		but1.setBounds(10,150,450,500);
		but2.setBounds(460,150,450,500);
		but3.setBounds(910,150,450,500);
		bexit.setBounds(200,670,100,30);
		bback.setBounds(600,670,100,30);
		//bg1.setBounds(0,0,1080,1000);///
		//bg2.setBounds(600,0,400,1000);///
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);
		bexit.addActionListener(this);
		bback.addActionListener(this);
		//add(bg1);
		//add(bg2);

		add(l1);
		add(l2);
		add(l3);

		add(but1);//
		add(but2);//
		add(but3);//
		add(bexit);//
		add(bback);//
		//but1.add(new ImageIcon(ss1.jpg));
		setSize(1770,800);
		setTitle("CHOOSE....");
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == but1)
		{
			JOptionPane.showMessageDialog(null,"ENTERING Simple Simple Programs-1");
			NewJ j1 = new NewJ();
			
		}
		if(ae.getSource() == but2)
		{
			JOptionPane.showMessageDialog(null,"ENTERING Simple Simple Programs-2");
			new NewJ2();
			
		}
		if(ae.getSource() == but3)
		{
			JOptionPane.showMessageDialog(null,"ENTERING G.U.I. Programs");
			new GUI();
		}
		if(ae.getSource() == bback)
		{
			JOptionPane.showMessageDialog(null,"LOGGING OUT");
			new LoginFrame();
			
		}
		if(ae.getSource() == bexit)
		{
				System.exit(0);
		}
		repaint(); 
	}
	public static void main(String args[])
	{
		A a = new A();
	}

}