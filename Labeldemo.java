//WAP in java to add the LABELs in APPLET
//LabelDemo.java

import java.awt.*;
import java.applet.*;

/*
<applet code="Labeldemo" width=600 height=600>
</applet>
*/

public class Labeldemo extends Applet
{
	Label l1,l2,l3;
	String aa;
	public void init()
	{
		//l1=new Label("MIT");
		l1=new Label();
		l1.setText("MIT");
		aa=l1.getText();
		System.out.println(aa);
		l2=new Label("SIT");
		l3=new Label("VIIT");
		add(l1);
		add(l2);
		add(l3);
	}
	public void paint(Graphics g)
	{
		g.drawString(aa,100,150);
	}
}

//HAPPY CODING...:)