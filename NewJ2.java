import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*; 
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;

public class NewJ2 extends JFrame implements ActionListener
{	
	public static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14;
	//public static String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,be,bb;
	JTextArea ta;
	JLabel l1;
	JScrollPane scrollPane;
	
	public NewJ2( )
	{	
		
		ta = new JTextArea(" ", 10,600);
		scrollPane = new JScrollPane(ta);
		setLayout(null);
		l1 = new JLabel("<<<<<<<SIMPLE PROGRAMS-2>>>>>>>");
		
		b1 = new JButton("SINGLE INHERITANCE");
		b2 = new JButton("MULTILEVEL INHERITANCE");
		b3 = new JButton("INTERFACE-1");
		b4 = new JButton("INTERFACE-2");
		b5 = new JButton("ABSTRACT CLASS-1");
		b6 = new JButton("ABSTRACT CLASS-2");
		b7 = new JButton("SUPER FUNCTION");
		b8 = new JButton("STATIC FUNCTION");
		b9 = new JButton("this POINTER");
		b10 = new JButton("EXCEPTION HANDLING(basic)");
		b11 = new JButton("USER EXCEPTION-1");
		b12 = new JButton("USER EXCEPTION-2");
		b13 = new JButton("BUFFERED_READER-1");
		b14 = new JButton("BUFFERED_READER-2");
		
		be = new JButton("EXIT");	
		
		bb = new JButton("BACK");
		
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

		be.setBounds(10,620,100,30);

		bb.setBounds(180,620,100,30);

//ta.setBounds(450,10,600,650);

		ta.setBounds(450,10,600,650);
		scrollPane.setBounds(400,0,700,700);

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

		add(bb);
	
		add(be);

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
	
		be.addActionListener(this);

		bb.addActionListener(this);
		
		setSize(1360,800);
		setVisible(true);
		setTitle("SIMPLE-1");
    	ta.setEditable(false);
    	try
		{
		s1 = new String(Files.readAllBytes(Paths.get("Single.java")));
		
		s2 = new String(Files.readAllBytes(Paths.get("MultilevelEmp.java")));
		
		s3 = new String(Files.readAllBytes(Paths.get("Inter.java")));
		
		s4 = new String(Files.readAllBytes(Paths.get("Inter2.java")));
		
		s5 = new String(Files.readAllBytes(Paths.get("ShapeDemo.java")));
		
		s6 = new String(Files.readAllBytes(Paths.get("Abst.java")));
		
		s7 = new String(Files.readAllBytes(Paths.get("SuperDemo.java")));
		
		s8 = new String(Files.readAllBytes(Paths.get("Use_static.java")));
		
		s9 = new String(Files.readAllBytes(Paths.get("Demo1.java")));
		
		s10 = new String(Files.readAllBytes(Paths.get("Excp.java")));
		
		s11 = new String(Files.readAllBytes(Paths.get("Userexcp1.java")));
		
		s12 = new String(Files.readAllBytes(Paths.get("RMExcep.java")));
		
		s13 = new String(Files.readAllBytes(Paths.get("Userip2.java")));
		
		s14 = new String(Files.readAllBytes(Paths.get("Emp1.java")));
		
		}
		catch(IOException e){}

    		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == b1)
			ta.setText(s1);
		if(ae.getSource() == b2)
			ta.setText(s2);
		if(ae.getSource() == b3)
			ta.setText(s3);
		if(ae.getSource() == b4)
			ta.setText(s4);
		if(ae.getSource() == b5)
			ta.setText(s5);
		if(ae.getSource() == b6)
			ta.setText(s6);
		if(ae.getSource() == b7)
			ta.setText(s7);
		if(ae.getSource() == b8)
			ta.setText(s8);
		if(ae.getSource() == b9)
			ta.setText(s9);
		if(ae.getSource() == b10)
			ta.setText(s10);
		if(ae.getSource() == b11)
			ta.setText(s11);
		if(ae.getSource() == b12)
			ta.setText(s12);
		if(ae.getSource() == b13)
			ta.setText(s13);
		if(ae.getSource() == b14)
			ta.setText(s14);

		if(ae.getSource() == bb)
		{
			new A();
			
		}

		
		if(ae.getSource()==be)
			System.exit(0);

				repaint();
	}
	public static void main(String[] args) throws IOException 
	{
		NewJ2 j = new NewJ2();
	}
		
}