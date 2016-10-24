//WAP in java which consist of init(),start(),paint() method of applet
//Sampledemo.java

import java.awt.*;
import java.applet.*;

/*
<applet code="Sampledemo" width=600 height=600>
</applet>
*/


public class Sampledemo extends Applet
{
	String msg="";
	public void init()
	{
		setBackground(Color.cyan);
		setForeground(Color.red);
		msg="Inside Init...";
	}
	public void start()
	{
		msg=msg+"Inside Start.....";
	}

	public void paint(Graphics g)
	{
		msg=msg+"Inside Paint....."; 
		g.drawString(msg,100,100);
	}
}

//HAPPY CODING...:)