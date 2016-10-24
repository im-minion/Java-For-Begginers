//WAP in java to add BUTTONS and display 
//a label corresponding to their clicks
//Buttondemo.java

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code="Buttondemo" width=600 height=600>
</applet>
*/

public class Buttondemo extends Applet implements ActionListener
{
	Button b1,b2,b3;
	String aa;
	public void init()
	{
		b1=new Button("YES");
		b2=new Button("NO");
		b3=new Button("MAYBE");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			aa="Yes button clicked";
		}
		if(ae.getSource()==b2)
		{
			aa="No button clicked";
		}
		if(ae.getSource()==b3)
		{
			aa="Mayb button clicked";
		}
	repaint();
	}

	public void paint(Graphics g)
	{
		g.drawString(aa,100,150);
	}
}

//Rember if you are IMPLEMENTing ActionListener then
//you must write the "actionPerformed()"" Frunction
//HAPPY CODING...:)