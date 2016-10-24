//WAP in java to add CHECKBOXs 
//CheckboxDemo.java 

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "CheckboxDemo" width = 250 height=200>
</applet>
*/

public class CheckboxDemo extends Applet implements ItemListener,ActionListener
{
	String msg;
	Button b1;
	Checkbox winXP,vista ,solaris,mac;
	CheckboxGroup cbg,cbg1;
	public void init()
	{
	cbg=new CheckboxGroup();
	cbg1=new CheckboxGroup();
	b1=new Button("Clicked");
	winXP = new Checkbox("Windows XP",cbg,false);//////ANY ONE FROM
	vista = new Checkbox("Windows VISTA",cbg,false);///IT----
	solaris = new Checkbox("SOLARIS",cbg1,true);///////OTHER ANY ONE FROM
	mac = new Checkbox("MAC OS",cbg1,true);///////////IT
	add(b1);
	add(winXP);
	add(vista);
	add(solaris);
	add(mac);
	winXP.addItemListener(this);
	vista.addItemListener(this);
	solaris.addItemListener(this);
	mac.addItemListener(this);
	b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b1)
	{
	vista.setState(true);
	}
	repaint();
	}
	public void itemStateChanged(ItemEvent ie)
	{
	repaint();
	}
	public void paint(Graphics g)
	{
		msg = "Current state : ";	
		g.drawString(msg,6,80);
		msg = "XP: "+winXP.getState();	
		g.drawString(msg,6,100);
		msg = "vista "+vista.getState();	
		g.drawString(msg,6,120);
		msg = "solaris "+solaris.getState();	
		g.drawString(msg,6,140);
		msg = "mac: "+mac.getState();	
		g.drawString(msg,6,160);	
	}
}

//HAPPY CODING...:)