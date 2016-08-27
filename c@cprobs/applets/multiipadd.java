import java.net.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class multiipadd implements ActionListener,MouseListener throws UnknownHostException
{
	String website="",dowhat="",errormessage="";
	Button show,clear;
	int ctr=0,len;
	Label ip;
	Textfeild url;
	//InetAddress  adr[]=new InetAddress;
	Graphics g;
	public void init()
	{
		show=new Button("SHOW");
		clear=new Button("CLEAR");
		url=new Textfeild("",30);
		ip.setText("",16);
		add(url);
		add(ip);
		add(show);
		addd(clear);
		show.addActionListener(this);
		clear.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		dowhat=a.getActionCommand();
		if(dowhat.equals("SHOW"))
		{
			website=url.getText();
			len=website.length();
			while(ctr<3)
				if(website[ctr]=='w')
					++ctr;
			if(ctr<2)
			{
				ip.setText("Fir mazze le rha hai bhai :@");
			}
			if(!website[website.length()-3].equals(".com"))
				ip.setText("Fir mazze le rha hai bhai :@");
			else
			{
				ctr=0;
				InetAddress adr[]=InetAddress.getAllByName(website);
				while(ctr<adr.length)
				{
					try{
						ip.setText(adr[ctr++]);
						Thread.sleep(10000);
					}
					catch(InterruptedException i){
						errormessage="Sorry. an unknown error occured.";
					/*	galat(errormessage);*/g.drawString(msg,0,250);//////////////////////////////////check here
					}
				}
			}
		}
		else if(dowhat.equals("CLEAR"))
		{
			ctr=0;
			msg="";
			website="";
			dowhat="";
			errormessage="" ;
			repaint();
		}
	}
	/*
	public void galat(String msg)
	{
		public void paint(Graphics g)
		{
			g.drawString(msg,0,250);
		}
	}*/
}

//<applet code=multiipadd height="300" width="300"></applet>
