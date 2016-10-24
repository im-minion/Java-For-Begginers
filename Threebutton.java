//Design a applet window using java which has 3 buttons which will
//change the background color on clicking....
//Threebutton.java

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*
<applet code = "Threebutton" width = 600 height = 600>
</applet>
*/
public class Threebutton extends Applet implements ActionListener
{
	public Button a,b,c;
	public void init()
	{
		a = new Button("RED");
		b = new Button("BLUE");
		c = new Button("GREEN");
		add(a);
		add(b);
		add(c);
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==a)
		{
			setBackground(Color.red);
		}
		if(ae.getSource()==b)
		{
			setBackground(Color.blue);
		}
		if(ae.getSource()==c)
		{
			setBackground(Color.green);
		}
		repaint();
	}
}

//HAPPY CODING...:)