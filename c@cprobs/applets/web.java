import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class web extends Applet implements ActionListener
{
	Button show,clear;
	TextField l1;
	public void init()
	{
		show=new Button("show");
		clear=new Button("clear");
		l1=new TextField("",20);
		add(l1);
		add(show);
		add(clear);
		show.addActionListener(this);
		clear.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) 
	{
		String but=ae.getActionCommand();
		if(but.equals("show"))
		{
			try
			{
				InetAddress adr=InetAddress.getByName("www.google.co.in");
				l1.setText("web : "+adr);
			}
			catch(Exception e)
			{
				l1.setText("exception occured!!");
			}
		}
		else if(but.equals("clear"))
			l1.setText("");
	}
}

//<Applet code=web height=300 width=300></applet>