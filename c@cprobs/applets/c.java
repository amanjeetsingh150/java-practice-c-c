import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class c extends Applet implements MouseListener,MouseMotionListener
{

	int X,Y;

	public void init()
	{
	
		setBackground(Color.RED);
		addMouseListener(this);
		addMouseMotionListener(this);
				
	}
	

	public void mouseEntered(MouseEvent m)
	{
		setBackground(Color.GREEN);
	}
	
	public void mouseExited(MouseEvent m)
	{
		setBackground(Color.RED);
	}

	public void mousePressed(MouseEvent m)
	{

	}

	public void mouseReleased(MouseEvent m)
	{

	}
	

	public void mouseClicked(MouseEvent m)
	{

	}

	public void mouseDragged(MouseEvent m)
	{

	X=m.getX();
	Y=m.getY();
		
		repaint();
	}

	public void mouseMoved(MouseEvent m)
	{
		
	showStatus(m.getX()+" , " +m.getY()+" px");
		
	}
	



	public void paint(Graphics g)
	{


		g.drawString("@",X,Y);
	}	


	
}


//<applet code=c width=350 height=350></applet>