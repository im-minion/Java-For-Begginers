import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener
{	
	public static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15;
	//public static String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,bb,be;
	JTextArea ta;
	JScrollPane scrollPane;
	JLabel l1;
	
	
	public GUI( )
	{	

		ta = new JTextArea();
		scrollPane = new JScrollPane(ta);
		
		setLayout(null);
				
		l1 = new JLabel("<<<<<<<<;)GUI:)>>>>>>>>");
		
		b1 = new JButton("APPLET BASIC");
		b2 = new JButton("BORDER LAYOUT");
		b3 = new JButton("ADDITION(TEXTBOXES)");
		b4 = new JButton("LABEL_DEMO");
		b5 = new JButton("BUTTON_DEMO");
		b6 = new JButton("BUTTON_EVENT_BGCOLOR");
		b7 = new JButton("LOGIN JFRAME");
		b8 = new JButton("MANUPULATION on STRING(FONT)");
		b9 = new JButton("TEXTFIELD_DEMO");
		b10 = new JButton("FRAME-1");
		b11 = new JButton("FRAME-2");
		b12 = new JButton("LIST_SWAP");
		b13 = new JButton("CHOICE_DEMO");
		b14 = new JButton("CHECKBOX_DEMO");
		b15 = new JButton("MENUBAR and TEXTBOX");
		
		be = new JButton("EXIT");	
		
		bb = new JButton("BACK");
		
		//ta = new JTextArea();
		
		l1.setBounds(10,20,600,50);

		b1.setBounds(10,60,250,25);
		b2.setBounds(10,100,250,25);
		b3.setBounds(10,140,250,25);
		b4.setBounds(10,180,250,25);
		b5.setBounds(10,220,250,25);
		b6.setBounds(10,260,250,25);
		b7.setBounds(10,300,250,25);
		b8.setBounds(10,340,250,25);
		b9.setBounds(10,380,250,25);
		b10.setBounds(10,420,250,25);
		b11.setBounds(10,460,250,25);
		b12.setBounds(10,500,250,25);
		b13.setBounds(10,540,250,25);
		b14.setBounds(10,580,250,25);
		b15.setBounds(10,620,250,25);

		be.setBounds(10,660,100,30);

		bb.setBounds(180,660,100,30);

		ta.setBounds(450,10,500,500);
		scrollPane.setBounds(400,0,600,600);

		add(l1);

		add(scrollPane);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(be);
		add(bb);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		
	
		be.addActionListener(this);

		bb.addActionListener(this);
		setSize(1360,800);
		setVisible(true);
		setTitle("GUI");
    	ta.setEditable(false);
    	try{
    			s1 = new String(Files.readAllBytes(Paths.get("Sampledemo.java")));
		s2 = new String(Files.readAllBytes(Paths.get("Border.java")));
		s3 = new String(Files.readAllBytes(Paths.get("Addgui.java")));
		s4 = new String(Files.readAllBytes(Paths.get("LabelDemo.java")));
		s5 = new String(Files.readAllBytes(Paths.get("ButtonDemo.java")));
		s6 = new String(Files.readAllBytes(Paths.get("Threebutton.java")));
		s7 = new String(Files.readAllBytes(Paths.get("LoginFrame.java")));
		s8 = new String(Files.readAllBytes(Paths.get("BILU.java")));
		s9 = new String(Files.readAllBytes(Paths.get("Textdemo.java")));
		s10 = new String(Files.readAllBytes(Paths.get("Frame1.java")));
		s11 = new String(Files.readAllBytes(Paths.get("Frame2.java")));
		s12 = new String(Files.readAllBytes(Paths.get("FrndEmny.java")));
		s13 = new String(Files.readAllBytes(Paths.get("ChoiceDemo.java")));
		s14 = new String(Files.readAllBytes(Paths.get("CheckboxDemo.java")));
		s15 = new String(Files.readAllBytes(Paths.get("MenuColor.java")));
    }catch(Exception e){}
    	
	}
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == b1)
			{ta.setText(s1);}			
		if(ae.getSource() == b2)
			{ta.setText(s2);}
		if(ae.getSource() == b3)
			{ta.setText(s3);}
		if(ae.getSource() == b4)
			{ta.setText(s4);}
		if(ae.getSource() == b5)
			{ta.setText(s5);}
		if(ae.getSource() == b6)
			{ta.setText(s6);}
		if(ae.getSource() == b7)
			{ta.setText(s7);}
		if(ae.getSource() == b8)
			{ta.setText(s8);}
		if(ae.getSource() == b9)
			{ta.setText(s9);}
		if(ae.getSource() == b10)
			{ta.setText(s10);}
		if(ae.getSource() == b11)
			{ta.setText(s11);}
		if(ae.getSource() == b12)
			{ta.setText(s12);}
		if(ae.getSource() == b13)
			{ta.setText(s13);}
		if(ae.getSource() == b14)
			{ta.setText(s14);}
		if(ae.getSource() == b15)
			{ta.setText(s15);}

		if(ae.getSource() == bb)
		{
			new A();
			
		}

		if(ae.getSource()==be)
		{	System.exit(0);}
		repaint();
	}
	public static void main(String[] args) throws IOException
	{
		GUI g = new GUI();
	}
		
}