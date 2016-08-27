import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class calculator extends Applet implements ActionListener,MouseListener
{
	Button b[]=new Button[10],ba,bs,bd,bm,beq,bcl;
	//Pannel p[]=new Pannel[4];
	TextField t1;
	double x,y,z;
	String inside="a";
	char symb;
	boolean num_done=false;
	public void init()
	{
	//	Panel p1=new Pannel();
		setBackground(Color.GREEN);
		int i,j=0;
		for(i=0;i<10;++i)
		{
			b[i]=new Button(""+i);
		}
		
		ba=new Button("+");
		bs=new Button("-");
		bm=new Button("*");
		bd=new Button("/");
		beq=new Button("=");
		bcl=new Button("clear");
		t1=new TextField("",13);
		add(t1);
		for(i=0;i<10;++i)
			add(b[i]);
		add(ba);
		add(bm);
		add(bd);
		add(bs);
		add(beq);
		add(bcl);
		
		/*
		for(i=0;i<4;++i)
			Pannel p[i]=new Pannel();
		p[0].add(t1);
		add(p[0]);
		for(i=1;i<4;++i)
		{
			for(;j<10;++j)
				p[i].add(b[j]);
		}
		p[1].add(ba);
		p[2].add(bs);
		p[3].add(bm);
		add(p[1]);
		add(p[2]);
		add(p[3]);
		setLayout (new FlowLayout(FlowLayout.CENTER));
		add(bd);
		add(beq);
		add(bcl);
		*/
		b[0].addActionListener(this);
		b[1].addActionListener(this);
		b[2].addActionListener(this);
		b[3].addActionListener(this);
		b[4].addActionListener(this);
		b[5].addActionListener(this);
		b[6].addActionListener(this);
		b[7].addActionListener(this);
		b[8].addActionListener(this);
		b[9].addActionListener(this);
		ba.addActionListener(this);
		bs.addActionListener(this);
		bm.addActionListener(this);
		bd.addActionListener(this);
		beq.addActionListener(this);
		bcl.addActionListener(this);
		addMouseListener(this);
		//addMouseMotionListener(this);///////////////////HERE
	}
	public void mouseEntered(MouseEvent m)
	{
		setBackground(Color.YELLOW);
	}
	
	public void mouseExited(MouseEvent m)
	{
		setBackground(Color.BLUE);
	}

	public void mouseReleased(MouseEvent m)
	{
		setBackground(Color.CYAN);
	}
	
	
	public void mousePressed(MouseEvent m)
	{
		setBackground(Color.RED);
	}
	

	public void mouseClicked(MouseEvent m)
	{
		setBackground(Color.BLUE);
	}

	public void mouseDragged(MouseEvent m)
	{
		setBackground(Color.GREEN);
	}

	public void mouseMoved(MouseEvent m)
	{
		setBackground(Color.WHITE);
	}

	public void actionPerformed(ActionEvent a)	
	{
		inside=a.getActionCommand();
		if((inside.equals("=")||inside.equals("+")||inside.equals("-")||inside.equals("*")||inside.equals("/"))&&num_done==false)
			t1.setText("mazze na le");
		else
		{
			num_done=true;
			if(inside.equals("0"))
				t1.setText(t1.getText()+"0");
			if(inside.equals("1"))
				t1.setText(t1.getText()+"1");
			if(inside.equals("2"))
				t1.setText(t1.getText()+"2");
			if(inside.equals("3"))
				t1.setText(t1.getText()+"3");
			if(inside.equals("4"))
				t1.setText(t1.getText()+"4");
			if(inside.equals("5"))
				t1.setText(t1.getText()+"5");
			if(inside.equals("6"))
				t1.setText(t1.getText()+"6");
			if(inside.equals("7"))
				t1.setText(t1.getText()+"7");
			if(inside.equals("8"))
				t1.setText(t1.getText()+"8");
			if(inside.equals("9"))
				t1.setText(t1.getText()+"9");
			if(inside.equals("."))
				t1.setText(t1.getText()+".");
			if(inside.equals("+"))
			{
				symb='+';
				x=Double.parseDouble(t1.getText());
				t1.setText("");
			}			
			if(inside.equals("-"))
			{
				symb='-';
				x=Double.parseDouble(t1.getText());
				t1.setText("");
			}			
			if(inside.equals("*"))
			{
				symb='*';
				x=Double.parseDouble(t1.getText());
				t1.setText("");
			}			
			if(inside.equals("/"))
			{
				symb='/';
				x=Double.parseDouble(t1.getText());
				t1.setText("");
			}			
			if(inside.equals("="))
			{
				y=Double.parseDouble(t1.getText());
				if(symb=='+')
				{
					z=x+y;
					t1.setText(""+z);
				}
				if(symb=='-')
				{
					z=x-y;
					t1.setText(""+z);
				}
				if(symb=='*')
				{
					z=x*y;
					t1.setText(""+z);
				}
				if(symb=='/')
				{
					z=x/y;
					t1.setText(""+z);
				}
				
			}	
			if(inside.equals("clear"))
				t1.setText("");			
		}
	}
}
//<Applet code=calculator height=300 width=360></applet>