//WAP in java to make a list of friends and enemies and also
//make it flexible that you can move selected friend to enemy
//and vica versa.....
//FrndEmny.java

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code = "FrndEmny" width=600 height=600>
</applet>
*/

public class FrndEmny extends Applet implements ItemListener,ActionListener
{
	List list1,list2;
	Label l1,l2;
	Button b1,b2;
	public void init()
	{
		b1 = new Button(">>");
		b2 = new Button("<<");
		l1 = new Label("FRIEND");
		l2 = new Label("ENEMY");
		list1 = new List();
		list2 = new List();
		setLayout(null);
		l1.setBounds(100,50,50,30);
		l2.setBounds(300,50,50,30);
		list1.setBounds(100,150,200,200);
		list2.setBounds(300,150,200,200);
		add(list1);
		add(list2);
		list1.add("A");
		list1.add("B");
		list1.add("C");
		//list1.add("D");
		list2.add("X");
		list2.add("Y");
		list2.add("Z");
		//list2.add("W");
		b1.setBounds(100,350,50,30);
		b2.setBounds(300,350,50,30);
		add(b1);
		add(b2);
		add(l1);
		add(l2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		list1.addActionListener(this);
		list2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			
			list2.add(list1.getSelectedItem());
			int zz = list1.getSelectedIndex();
			list1.remove(zz);
		}
		if(ae.getSource()==b2)
		{
			list1.add(list2.getSelectedItem());
			int zz = list2.getSelectedIndex();
			list2.remove(zz);
		}
		repaint();
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
	
	repaint();
	}
	
	public static void main(String args[])
	{
		FrndEmny f1 = new FrndEmny();
	}
}

//HAPPY CODING...:)