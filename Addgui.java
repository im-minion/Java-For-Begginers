//WAP in java to take a input of 2 no.s in the 2 textfield and display
//the result in the 3rd textfield after cliking on the result button using APPLET.
//Addgui.java


import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
/*
<applet code = "Addgui" width = 700 height = 500>
</applet>
*/
public class Addgui extends Applet implements ActionListener
{
	
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int total;
	public void init()
	{
		
		l1 = new Label("First no : ");
		l2 = new Label("Second no : ");
		l3 = new Label("result : ");
		t1 = new TextField(20);
		t2 = new TextField(20);
		t3 = new TextField(30);
		b1 = new Button("CALCULATE");
		b2 = new Button("RESET");
		setLayout(null);
		
		l1.setBounds(100,50,100,30);
		l2.setBounds(100,100,100,30);
		l3.setBounds(100,150,100,30);
		t1.setBounds(200,50,100,30);
		t2.setBounds(200,100,100,30);
		t3.setBounds(200,150,100,30);
		b1.setBounds(100,230,100,30);
		b2.setBounds(250,230,100,30);
			
		b1.addActionListener(this);
		b2.addActionListener(this);

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		add(b2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int aa=Integer.parseInt(t1.getText());
		int bb=Integer.parseInt(t2.getText());
		if(ae.getSource()==b1)
		{
			total = aa+bb;
			t3.setText(Integer.toString(total));
		}
		if(ae.getSource()==b2)
		{
			t1.setText(" ");
			t2.setText(" ");
			t3.setText(" ");
		}
	}
}

//HAPPY CODING...:)