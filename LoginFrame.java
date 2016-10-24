
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginFrame extends JFrame implements ActionListener
{ 
	JLabel ll1,ll2;
	JTextField tt1;
	JPasswordField tt2;
	JButton bb1,bb2;
	int count=0;
	public LoginFrame()
	{
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("fun.jpg"));
		
		ll1=new JLabel("Username");
		ll2=new JLabel("Password");
		tt1=new JTextField(30);
		tt2 = new JPasswordField(30);
		bb1=new JButton("Login");
		bb2=new JButton("Exit");
		
		
		ll1.setBounds(50,50,100,30);
		tt1.setBounds(200,50,100,30);
		ll2.setBounds(50,100,100,30);
		tt2.setBounds(200,100,100,30);
		bb1.setBounds(100,150,100,30);
		bb2.setBounds(300,150,100,30);
		ll1.setForeground(Color.WHITE);
		ll2.setForeground(Color.WHITE);
		
		add(background);
		
		background.add(ll1);
		background.add(tt1);
		background.add(ll2);
		background.add(tt2);
		background.add(bb1);
		background.add(bb2);
		
		tt1.addActionListener(this);
		tt2.addActionListener(this);
		
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		
		setTitle("Login Here");
		setSize(1770,800);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String aa=tt1.getText();
		String bb=tt2.getText();
		if(ae.getSource()==bb1)
		{
			if(aa.equals("VPM") && bb.equals("1111"))
			{		
				JOptionPane.showMessageDialog(null,"Logged In");
				new A();
				
			}
			else
			{
				try
				{
					if(count<3)
					{
						count=count+1;
						JOptionPane.showMessageDialog(null,"Invalid Attempt:"+count);
						tt1.setText("");
						tt2.setText("");	
					}
					else
					{ 
						throw new Invalid();
						
					}
				}	
				catch(Invalid a){}		
			}
		
		}
		if(ae.getSource()==bb2)
		{
			System.exit(0);	
		}
		repaint();
	}
	public static void main(String args[])
	{
		LoginFrame L=new LoginFrame();
	}
}
class Invalid extends Exception
{
	Invalid()
	{
		JOptionPane.showMessageDialog(null,"\nYOU HAVE EXCLUDEDE LIMIT");
		System.exit(0);
	}
}

//HAPPY CODING...:)