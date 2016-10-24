//WAP in java using applet having 2 labels and 2 textfield
//and display the content in textfield in the applet itself(use drawString() fun)
//use init(),paint() methods of applet
//Textdemo.java

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

/*
<applet code = "Textdemo" width = 600 height = 600>
</applet>
*/

public class Textdemo extends Applet implements ActionListener
{
	TextField t1,t2;
	Label l1,l2;
	public void init()
	{
		l1=new Label("Username");
		l2=new Label("Password");
		t1 = new TextField(20);
		t2 = new TextField(20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		t1.addActionListener(this);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		String aa=t1.getText();	
		String bb=t2.getText();
		g.drawString(aa,100,100);
		g.drawString(bb,100,200);
	}
}

//HAPPY CODING...:)