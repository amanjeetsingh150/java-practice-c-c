import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ip extends Applet implements ActionListener
{
	Label l1;
	Button show;
	Button clear;
	public void init()
	{
		Label l1=new Label("",30);
		Button show=new Button("show");
		Button clear=new Button("clear");
		add(l1);
		add(show);
		add(clear);
		show.addActionListener(this);
		clear.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent a) throws Exception
	{
		String dowhat=a.getActionCommand();
		if(dowhat.equals("show"))
		{
			InetAddress adr=InetAddress.getLocalHost();
			l1.setText("ip : "+adr);
		}
		else if(dowhat.equals("clear"))
		{
			l1.setText("");
		}
	}
}

//<Applet code=ip height="300" width="300"></applet>