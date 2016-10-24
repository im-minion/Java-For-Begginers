//WAP in java to implement Choice List
//ChoiceDemo.java

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code = "ChoiceDemo" width=600 height=600>
</applet>*/
public class ChoiceDemo extends Applet implements ItemListener
{
	Choice os,browser;
	String msg = "";
	public void init()
	{
	os = new Choice();
	browser = new Choice();
	os.add("Win XP");
	os.add("VISTA");
	os.add("SOLARIS");
	os.add("MAC");
	os.add("LINUX");
	
	browser.add("INTERNET EXPLORER");
	browser.add("Firefox");
	browser.add("GOOGLE");
	add(os);
	add(browser);
	os.addItemListener(this);
	browser.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
	msg = "Current OS :";
	msg += os.getSelectedItem();
	g.drawString(msg,6,120);
	msg = "Current Browser : ";
	msg += browser.getSelectedItem();
	g.drawString(msg,6,140);
	}
}

//HAPPY CODING...:)