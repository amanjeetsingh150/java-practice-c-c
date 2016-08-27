import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calcn extends Applet implements ActionListener
{
	/*Button b=new Button[10];
	int i;
	for(i=0;i<10;++i)
	{
		Button b[i]=new Button("%d",i);
	}*/
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
	TextField t1,t2;
	String bp="";
	int x,y,z;
	String content=" ";
	char sign=' ';
	
	public void init()
	{
		b0=new Button("0");
		b1=new Button("1");
/*		b0.addActionListener(this);
		b1.addActionListener(this);*/
		t1=new TextField(" ",10);
		add(t1);
		add(b0);
		add(b1);		
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("+");
		b11=new Button("-");
		b12=new Button("*");
		b13=new Button("/");
		b14=new Button("=");
		t1=new TextField("",10);
		t2=new TextField("",10);		
//		add(t1);
		add(b0);
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
		//t1.addActionListener(this);
		b0.addActionListener(this);
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
		//t2.addActionListener(this);*/
	}
	public void actionPerformed(ActionEvent ae)
	{
		 bp=ae.getActionCommand();
		if(bp.equals("0"))
		{
			t1.setText(t1.getText()+"0");
		}
		else if(bp.equals("1"))
		{
			t1.setText(t1.getText()+"1");
		}
		
		else if(bp.equals("1"))
		{
				t1.setText(t1.getText()+"1");
		}
		else if(bp.equals("2"))
		{
				t1.setText(t1.getText()+"2");
		}
		else if(bp.equals("3"))
		{
				t1.setText(t1.getText()+"3");
		}
		else if(bp.equals("4"))
		{
				t1.setText(t1.getText()+"4");
		}
		else if(bp.equals("5"))
		{
				t1.setText(t1.getText()+"5");
		}
		else if(bp.equals("6"))
		{
				t1.setText(t1.getText()+"6");
		}
		else if(bp.equals("7"))
		{
				t1.setText(t1.getText()+"7");
		}
		else if(bp.equals("8"))
		{
			t1.setText(t1.getText()+"8");
		}
		else if(bp.equals("9"))
		{
				t1.setText(t1.getText()+"9");
		}
		
		else if(bp.equals("+"))
		{
			sign='+';
			x=Integer.parseInt(t1.getText());
			content=" ";
			t1.setText(content);
		}

		else if(bp.equals("-"))
		{
			sign='-';
			x=Integer.parseInt(t1.getText());
			content=" ";
			t1.setText(content);
		}
		else if(bp.equals("*"))
		{
			sign='*';
			x=Integer.parseInt(t1.getText());
			content=" ";
			t1.setText(content);
		}
		else if(bp.equals("/"))
		{
			sign='/';
			x=Integer.parseInt(t1.getText());
			content=" ";
			t1.setText(content);
		}
		else if(bp.equals("="))
		{
			y=Integer.parseInt(t1.getText());
			if(sign=='+')
			z=x+y;
			if(sign=='-')
			z=x-y;
			if(sign=='/')
			z=x/y;
			if(sign=='*')
			z=x*y;		
			t1.setText(z+" ");
		}
	}
}
//<applet code=calcn height=300 width=360></applet>