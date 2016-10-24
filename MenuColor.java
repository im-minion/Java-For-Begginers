//WAP to add Menubar in a frame using JFrame in java.
//MenuColor.java

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
class MenuColor extends JFrame implements ActionListener
{
	JTextField tf;
	JMenuBar mbar;
	JMenu f,c;
	JMenuItem r,g,b,exit;
	MenuColor()
	{
		setLayout(null);
		setTitle("Set Color");
		setSize(500,500);
		setVisible(true);
		mbar = new JMenuBar();
		setJMenuBar(mbar);
		f = new JMenu("Font");
		c = new JMenu("Close");
		r = new JMenuItem("RED");
		f.add(r);
		b = new JMenuItem("BLUE");
		f.add(b);
		g = new JMenuItem("GREEN");
		f.add(g);
		exit = new JMenuItem("Exit");
		c.add(exit);
		mbar.add(f);
		mbar.add(c);
		tf = new JTextField(30);
		tf.setBounds(200,200,50,30);
		add(tf);
		r.addActionListener(this);
		b.addActionListener(this);
		g.addActionListener(this);
		exit.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==r)
		{
			tf.setBackground(Color.red);
		}
		if(ae.getSource()==b)
		{
			tf.setBackground(Color.blue);
		}
		if(ae.getSource()==g)
		{
			tf.setBackground(Color.green);
		}
		if(ae.getSource()==exit)
		{
			System.exit(0);
		}
		repaint();
	}
	public static void main(String args[])
	{
		MenuColor m1 = new MenuColor();
	}
}

//HAPPY CODING...:)