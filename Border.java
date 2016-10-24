//WAP in java to study about BORDERLAYOUT in APPLET
//Border.java

import java.awt.*;
import java.applet.*;
import java.util.*;

/*
<applet code="Border" width=400 height=200>
</applet>
*/
public class Border extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());	
		add(new Button("this is across the top"),BorderLayout.NORTH);
		add(new Label("the footer message might go here"),BorderLayout.SOUTH);
		add(new Button("Right"),BorderLayout.EAST);
		add(new Button("Left"),BorderLayout.WEST);
		
		String msg="The reasonable man adapts";

		add(new TextArea(msg),BorderLayout.CENTER);
	}
}

//HAPPY CODING...:)