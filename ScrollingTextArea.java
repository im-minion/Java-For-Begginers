import javax.swing.*;
import java.nio.file.Files;
import java.io.*;
import java.nio.file.Paths;
public class ScrollingTextArea 
{
JFrame f;
JTextArea ta;
JScrollPane scrolltxt;

public ScrollingTextArea() 
{
    // TODO Auto-generated constructor stub
    try{
    f=new JFrame();
    f.setLayout(null);
    f.setVisible(true);
    f.setSize(500,500);
    ta=new JTextArea();
    ta.setBounds(5,5,100,200);
    String s15 = new String(Files.readAllBytes(Paths.get("GUI.java")));
    scrolltxt=new JScrollPane(ta);
    scrolltxt.setBounds(3,3,400,400);

    f.add(scrolltxt);
    ta.setText(s15);
    }
    catch(Exception e){}
}

public static void main(String[] args)
{
    ScrollingTextArea a= new ScrollingTextArea();
}
}