//WAP in java which consist of 5 textfields and 5 buttons
//accept a string in one textfield and display it in
//BOLD, ITALIC, UPPER CASE, LOWER CASE after clicking on
//corresponding buttons....
//BILU.java

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "BILU" height=600 width=600>
</applet>
*/
public class BILU extends Applet implements ActionListener
{
	
	Label l1;
	
	Button b1,b2,b3,b4;
	TextField t1,t2,t3,t4,t5;
	public void init()
	{
	setLayout(null);
	l1 = new Label("Enter Text :");
	b1 = new Button("BOLD");
	b2 = new Button("ITALIC");
	b3 = new Button("UPPER CASE");
	b4 = new Button("LOWER CASE");
	
	t1 = new TextField(25);
	t2 = new TextField(25);
	t3 = new TextField(25);
	t4 = new TextField(25);
	t5 = new TextField(25);
	
	l1.setBounds(100,100,100,30);
	b1.setBounds(100,150,100,30);
	b2.setBounds(100,200,100,30);
	b3.setBounds(100,250,100,30);
	b4.setBounds(100,300,100,30);
	t1.setBounds(250,100,100,30);
	t2.setBounds(250,150,100,30);
	t3.setBounds(250,200,100,30);
	t4.setBounds(250,250,100,30);
	t5.setBounds(250,300,100,30);
	
	add(l1);
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		
	}
	repaint();
}	

//HAPPY CODING...:)