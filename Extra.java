import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.swing.*;

public class Extra extends JFrame implements ActionListener
{	
	public static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15;
	public static String c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,bb,be;
	JTextArea ta;
	JLabel l1;
	JFrame f = new JFrame();
	//JPanel ctr = new JPanel();
	//JScrollPane sp = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	JScrollPane sp ;
	//JFrame f = new JFrame();
	//2DefaultCaret caret = (DefaultCaret)ta.getCaret();
	
	public Extra( )
	{	
		f.setLayout(null);
		
		l1 = new JLabel("<<<<<<<SIMPLE PROGRAMS-1>>>>>>>");
		
		b1 = new JButton("WELCOME");
		b2 = new JButton("SWAP TWO NUMBERS");
		b3 = new JButton("CONDITION");
		b4 = new JButton("SWITCH CASE");
		b5 = new JButton("AMSTRONG NIMBER");
		
		b6 = new JButton("WHILE LOOP");
		b7 = new JButton("FACTORIAL");
		b8 = new JButton("DO WHILE LOOP");
		b9 = new JButton("REVERSE(3 DIGIT NO.)");
		b10 = new JButton("FIBONACCI SERIES");
		b11 = new JButton("SORT ARRAY");
		b12 = new JButton("POWER");
		b13 = new JButton("FUN. OVERLOADING-1");
		b14 = new JButton("FUN. OVERLOADING-2");
		b15 = new JButton("CONSTRUCTOR");
		
		be = new JButton("EXIT");	
		
		bb = new JButton("BACK");
		
		ta = new JTextArea();
		sp= new JScrollPane(ta);

		l1.setBounds(10,20,600,50);

		
		//f. setContentPane(sp);
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
		
		ta.setBounds(450,10,600,650);

		sp.setBounds(410,5,700,800);
		

		be.setBounds(10,660,100,30);

		bb.setBounds(180,660,100,30);

		

		
		//2caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		f.add(l1);

		f.add(ta);
		f.add(sp);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
		f.add(be);
		f.add(bb);
		
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

		f.setSize(1770,800);
		f.setVisible(true);
		f.setTitle("SIMPLE-1");
    	//ta.setEditable(false);
    		
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			//String fun(String chk)
			//{
			//	s1 = new String(Files.readAllBytes(Paths.get(chk)));
			//	c1=s1;
			//	return c1;
			//}
		s1 = new String(Files.readAllBytes(Paths.get("GUI.java")));
		c1 = s1;
		s2 = new String(Files.readAllBytes(Paths.get("Swap.java")));
		c2 = s2;
		s3 = new String(Files.readAllBytes(Paths.get("Condition.java")));
		c3 = s3;
		s4 = new String(Files.readAllBytes(Paths.get("Sw.java")));
		c4 = s4;
		s5 = new String(Files.readAllBytes(Paths.get("Amstrong.java")));
		c5 = s5;
		s6 = new String(Files.readAllBytes(Paths.get("Wh.java")));
		c6 = s6;
		s7 = new String(Files.readAllBytes(Paths.get("Factorial.java")));
		c7 = s7;
		s8 = new String(Files.readAllBytes(Paths.get("Dw.java")));
		c8 = s8;
		s9 = new String(Files.readAllBytes(Paths.get("Reverse.java")));
		c9 = s9;
		s10 = new String(Files.readAllBytes(Paths.get("Fab.java")));
		c10 = s10;
		s11 = new String(Files.readAllBytes(Paths.get("Arr_asc.java")));
		c11 = s11;
		s12 = new String(Files.readAllBytes(Paths.get("Power.java")));
		c12 = s12;		
		s13 = new String(Files.readAllBytes(Paths.get("Fun_ovr.java")));
		c13 = s13;
		s14 = new String(Files.readAllBytes(Paths.get("Fun_over2.java")));
		c14 = s14;
		s15 = new String(Files.readAllBytes(Paths.get("Constructor.java")));
		c15 = s15;
		if(ae.getSource() == b1)
			ta.setText(c1);
		if(ae.getSource() == b2)
			ta.setText(c2);
		if(ae.getSource() == b3)
			ta.setText(c3);
		if(ae.getSource() == b4)
			ta.setText(c4);
		if(ae.getSource() == b5)
			ta.setText(c5);
		if(ae.getSource() == b6)
			ta.setText(c6);
		if(ae.getSource() == b7)
			ta.setText(c7);
		if(ae.getSource() == b8)
			ta.setText(c8);
		if(ae.getSource() == b9)
			ta.setText(c9);
		if(ae.getSource() == b10)
			ta.setText(c10);
		if(ae.getSource() == b11)
			ta.setText(c11);
		if(ae.getSource() == b12)
			ta.setText(c12);
		if(ae.getSource() == b13)
			ta.setText(c13);
		if(ae.getSource() == b14)
			ta.setText(c14);
		if(ae.getSource() == b15)
			ta.setText(c15);
		
		if(ae.getSource()==bb)
		{
			new A();
		}
		
		if(ae.getSource()==be)
			System.exit(0);
		}catch(IOException e)
		{

		}
		repaint();
	}
	public static void main(String[] args) throws IOException 
	{
		Extra j1 = new Extra();

	}
		
}