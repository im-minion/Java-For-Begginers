//Frame2.java

import java.awt.*;
import java.awt.event.*;

public class Frame2 extends Frame implements ActionListener
{
TextField t1,t2,t3,t4,t5,t6;
Label l1,l2,l3,l4,l5,l6;
Button b1,b2;
	Frame2(String aa,String bb,int cc)
	{
	l1=new Label("Ename");
	l2=new Label("Ecode");
	l6=new Label("GS");
	
	t1=new TextField(30);
	t2=new TextField(30);
	t6=new TextField(30);
	
	b2=new Button("Exit");

	setLayout(null);
	
	l1.setBounds(100,100,50,30);
	l2.setBounds(100,150,50,30);
	l6.setBounds(100,200,50,30);
	
	t1.setBounds(200,100,80,30);
	t2.setBounds(200,150,80,30);
	t6.setBounds(200,200,80,30);
	b2.setBounds(200,250,80,30);
	t1.setText(aa);
	t2.setText(bb);
	t6.setText(Integer.toString(cc));
	add(t1);
	add(t2);
	add(t6);		

	add(b2);
	
	add(l1);
	add(l2);

	add(l6);	

	b2.addActionListener(this);

	setSize(600,600);
	setTitle("Frame1");
	setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b2)
	{
	System.exit(0);
	}	
	}
	//NO NEED TO ADD STATIC MAIN() METHOD .....
	//SOWE CAN't EXECUTE THIS PROGRAM SEPERATEly
	
}

//HAPPY CODING...:)