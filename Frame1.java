//WAP in java to accept info of employee their BS,DA,HRA in one FRAME(Frame1.java)
//and disply their GS in second FRAME(Frame1.java)

import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame implements ActionListener
{
TextField t1,t2,t3,t4,t5,t6;
Label l1,l2,l3,l4,l5,l6;
Button b1,b2;
	Frame1()
	{
	l1=new Label("Ename");
	l2=new Label("Ecode");
	l3=new Label("BS");
	l4=new Label("DA");
	l5=new Label("HRA");
	l6=new Label("GS");
	
	t1=new TextField(30);
	t2=new TextField(30);
	t3=new TextField(30);
	t4=new TextField(30);
	t5=new TextField(30);
	t6=new TextField(30);
	
	b1=new Button("Display");
	b2=new Button("Exit");

	setLayout(null);
	
	l1.setBounds(100,100,50,30);
	l2.setBounds(100,150,50,30);
	l3.setBounds(100,200,50,30);
	l4.setBounds(100,250,50,30);
	l5.setBounds(100,300,50,30);
	l6.setBounds(100,350,50,30);
	b1.setBounds(100,400,80,30);
	
	t1.setBounds(200,100,80,30);
	t2.setBounds(200,150,80,30);
	t3.setBounds(200,200,80,30);
	t4.setBounds(200,250,80,30);
	t5.setBounds(200,300,80,30);
	t6.setBounds(200,350,80,30);
	b2.setBounds(200,400,80,30);

	add(t1);
	add(t2);
	add(t3);
	add(t4);
	add(t5);
	add(t6);		

	add(b1);
	add(b2);
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);	

	b1.addActionListener(this);
	b2.addActionListener(this);

	setSize(600,600);
	setTitle("Frame1");
	setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
	String xx=t1.getText();
	String yy=t2.getText();
	int a=Integer.parseInt(t3.getText());
	int b=Integer.parseInt(t4.getText());
	int c=Integer.parseInt(t5.getText());
	if(ae.getSource()==b2)
	{
	System.exit(0);
	}
	
	if(ae.getSource()==b1)
	{
	int d=a+b+c;
	t6.setText(Integer.toString(d));
	Frame2 f100=new Frame2(xx,yy,d);
	}
	repaint();	
	}
	
	public static void main(String args[])
	{
		Frame1 f1=new Frame1();
	}
}

//HAPPY CODING...:)